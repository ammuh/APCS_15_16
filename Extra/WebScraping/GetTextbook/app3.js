var rp = require('request-promise');
var Promise = require('bluebird');
var fs = require('fs');
var cheerio = require('cheerio');
var readline = require('readline');
var colors = require('colors')
var fs = require("fs");
var replace = require("replace");
var pdf = require('pdfcrowd');

// create an API client instance
var client = new pdf.Pdfcrowd("ammo700", "f41070362937f05f79b671094cd9ab5b");

Promise.promisifyAll([fs, cheerio, readline]);

var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log("Welcome to Ammar's Saucy Java Textbook Web Scrapper, press enter to continue");
rl.question("Delete previous scrape data? (y/n) ", function(answer) {
    if (answer === 'y') {
        console.log()
        console.log("Clearing contents of rendered folder");
        cDir('rendered');
        beginPrompt();
    } else if (answer === 'n') {
        console.log("Warning: Data will be overwritten".red);
        beginPrompt();
    }
});

function beginPrompt() {
    rl.question("Shall we begin the scraping? (y/n) ", function(answer) {
        if (answer === 'y') {
            rl.close();
            console.log("Starting scrape sequence...");
            scrapeSequence();
        } else if (answer === 'n') {
            console.log("Maybe some other day");
            process.exit();
        } else {
            console.log("Ill take that as a no");
            process.exit();
        }
    });
}

function scrapeSequence() {
    rp({
            uri: 'http://iws.punahou.edu/user/DKiang/apcs',
            resolveWithFullResponse: true
        })
        .then(function(response) {
            // Access response.statusCode, response.body etc. 
            if (response.statusCode == 200) {
                console.log("We made it to the website! Starting to pull data...");
            }
        })
        .then(function() {
            console.log("Sequence two begins");
            global.lesson = 1;
            global.section = 65;
            global.lab = 1;
            global.letter = 'A';
            pullL();
        })
}

function pullL() {
    var url = 'http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/index.html';
    rp({
            uri: url,
            resolveWithFullResponse: true,
            simple: false
        })
        .then(function(response) {
            if (response.statusCode == 200) {
                var heading = '<h2>Chapter ' + global.lesson + '</h2>';
                logTextbook(heading);
                pullI();
            } else if (response.statusCode == 404) {
                console.log('Hit 404 status code. Must be end of lesson line.');
                iterA();
            }
        })
}

function pullI() {
    var url = 'http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/' + global.letter + global.lesson + '-intro.html';
    rp({
            uri: url,
            resolveWithFullResponse: true,
            simple: false
        })
        .then(function(response) {
            if (response.statusCode == 200) {
                console.log("Navigated to: " + 'http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/' + global.letter + global.lesson + '-intro.html');
                var $ = cheerio.load(response.body);
                $ = cheerio.load($('table[bgcolor = "ffffff"]').html());
                $ = cheerio.load($('tr').html());
                logTextbook($('td[align = "left"]').html());
                console.log('Intro from '+global.letter + global.lesson + ' pulled.')
                setTimeout(pullV(), 200);
            } else if (response.statusCode == 404) {
                console.log('Hit 404, lesson may not have intro. Checking for next category of items.');
                pullV();
            }
        });
}

function pullV() {
    var url = 'http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/' + global.letter + global.lesson + '-vocab.html';
    rp({
            uri: url,
            resolveWithFullResponse: true,
            simple: false
        })
        .then(function(response) {
            if (response.statusCode == 200) {
                console.log("Navigated to: " + 'http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/' + global.letter + global.lesson + '-vocab.html');
                var $ = cheerio.load(response.body);
                $ = cheerio.load($('table[bgcolor = "ffffff"]').html());
                $ = cheerio.load($('tr').html());
                logTextbook($('td[align = "left"]').html());
                console.log('Vocab from '+global.letter + global.lesson + ' pulled.')
                setTimeout(pullS(), 200);
            } else if (response.statusCode == 404) {
                console.log('Hit 404, lesson may not have intro. Checking for next category of items.');
                pullS();
            }
        });
}

function pullS() {
    var url = 'http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/' + global.letter + global.lesson + '-' + String.fromCharCode(global.section) + '.html';
    rp({
            uri: url,
            resolveWithFullResponse: true,
            simple: false
        })
        .then(function(response) {
            if (response.statusCode == 200) {
                console.log("Navigated to: " + 'http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/' + global.letter + global.lesson + '-' + String.fromCharCode(global.section) + '.html');
                var $ = cheerio.load(response.body);
                $ = cheerio.load($('table[bgcolor = "ffffff"]').html());
                $ = cheerio.load($('tr').html());
                logTextbook($('td[align = "left"]').html());
                console.log('Section ' + String.fromCharCode(global.section) + ' from '+global.letter + global.lesson + ' pulled.');
                global.section++;
                setTimeout(pullS(), 200);
            } else if (response.statusCode == 404) {
                replace({
                    regex: 'img src="images',
                    replacement: 'img src="http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/images',
                    paths: ['rendered/textbook.txt'],
                    recursive: true,
                    silent: true,
                });
                pullLab();
            }
        });
}

function pullLab() {
    var url = 'http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/Lab-' + global.letter + global.lesson + '-' + global.lab + '.html';
    rp({
            uri: url,
            resolveWithFullResponse: true,
            simple: false
        })
        .then(function(response) {
            if (response.statusCode == 200) {
                console.log("Navigated to: " + 'http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/Lab-' + global.letter + global.lesson + '-' + global.lab + '.html');
                var $ = cheerio.load(response.body);
                $ = cheerio.load($('table[bgcolor = "ffffff"]').html());
                $ = cheerio.load($('tr').html());
                logTextbook($('td[align = "left"]').html());
                console.log('Lab ' + global.lab + ' from '+global.letter + global.lesson + ' pulled.');
                global.lab++;
                setTimeout(pullLab(), 200);
            } else if (response.statusCode == 404) {
                replace({
                    regex: 'img src="images',
                    replacement: 'img src="http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/images',
                    paths: ['rendered/textbook.txt'],
                    recursive: true,
                    silent: true,
                });
                pullSum();
            }
        });
}

function pullSum() {
    var url = 'http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/' + global.letter + global.lesson + '-summary.html';
    rp({
            uri: url,
            resolveWithFullResponse: true,
            simple: false
        })
        .then(function(response) {
            if (response.statusCode == 200) {
                console.log("Navigated to: " + 'http://iws.punahou.edu/user/DKiang/apcs/Lesson' + global.letter + global.lesson + '/' + global.letter + global.lesson + '-summary.html');
                var $ = cheerio.load(response.body);
                $ = cheerio.load($('table[bgcolor = "ffffff"]').html());
                $ = cheerio.load($('tr').html());
                logTextbook($('td[align = "left"]').html());
                console.log('Summary from '+global.letter + global.lesson + ' pulled.')
                setTimeout(iterA(), 200);
            } else if (response.statusCode == 404) {
                console.log('Hit 404, lesson may not have intro. Checking for next category of items.');
                iterA();
            }
        });
}

function iterA() {
    if (global.lesson < 22 && global.letter == 'A') {
        var footer = '<br><br><br>';
        logTextbook(footer);
        global.lesson++;
        global.section = 65;
        pullL();
    } else if (global.lesson < 34 && global.letter == 'AB') {
        var footer = '<br><br><br>';
        logTextbook(footer);
        global.lesson++;
        global.section = 65;
        pullL();
    } else {
        console.log("Scrape of A Complete");
        if (global.letter == 'AB') {
            console.log('Full Scrape Complete');
            pdfPrompt();
        } else {
            global.letter = 'AB';
            iterA();
        }

    }
}

function logTextbook(data) {
    fs.appendFileSync('rendered/textbook.txt', data);
}

function cDir(dirPath) {
    try {
        var files = fs.readdirSync(dirPath);
    } catch (e) {
        return;
    }
    if (files.length > 0)
        for (var i = 0; i < files.length; i++) {
            var filePath = dirPath + '/' + files[i];
            if (fs.statSync(filePath).isFile())
                fs.unlinkSync(filePath);
            else
                cDir(filePath);
        }
}

function pdfPrompt() {
    var rl2 = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });
    rl2.question("Would you like to convert the text file to a pdf? (y/n) ", function(answer) {
        if (answer === 'y') {
            console.log();
            console.log("Converting to pdf... Once you see file, program will be finished");
            // convert a local HTML file:
            client.convertFile('rendered/textbook.txt', pdf.saveToFile("rendered/Textbook.pdf"), {
                width: "8.5in",
                height: "11in",
                vmargin: ".4in",
                footer_html: '<div style=text-align:center;font-size:smaller;color:maroon;">Created by mu</div>'
            });
        } else if (answer === 'n') {
            console.log('Thank you');
            process.exit();
        }
    });
}