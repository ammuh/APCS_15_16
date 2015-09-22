/**
 * Created by Ammar Husain on 9/20/2015.
 */
var fs = require('fs');
var request = require('request');
var cheerio = require('cheerio');
var readline = require('readline');

var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log("Welcome to Ammar's Saucy Java Textbook Web Scrapper, press enter to continue");

rl.question("Shall we begin the scraping? (y/n)", function(answer) {
    if(answer === 'y'){
        rl.close();
        console.log("Starting scrape sequence...");
        scraoeSequence();
    }
    else if(answer === 'n'){
        console.log("Maybe some other day");
        process.exit();
    }
    else{
        console.log("Ill take that as a no");
        process.exit();
    }
});

function scraoeSequence(){
    var url = 'http://iws.punahou.edu/user/DKiang/apcs/'
    request(url, function(error, response, body){
        if (!error && response.statusCode == 200) {
            console.log("We made it to the website! Starting to pull data...");
            for(lesson = 1; lesson < 5; lesson++){
                url = 'http://iws.punahou.edu/user/DKiang/apcs/LessonA' + lesson + '/A' + lesson + '-intro.html';
                request(url, function(error, response, html){
                    if (!error && response.statusCode == 200) {
                        console.log("Navigated to: " + 'http://iws.punahou.edu/user/DKiang/apcs/LessonA' + lesson + '/A' + lesson + '-intro.html');
                        var $ = cheerio.load(html);
                        var mainTable;
                        $ = cheerio.load($('table[bgcolor = "ffffff"]').html());
                        $ = cheerio.load($('tr').html());
                        console.log($('td[align = "left"]').html());
                        
                    }
                    else if (!error && response.statusCode == 404) {
                        console.log("No intro page in chapter");
                    }
                    else{
                        console.log("Network Error");
                        process.exit();
                    }
                });
            }
        }
        else{
            console.log('Some error');
        }
    });
}