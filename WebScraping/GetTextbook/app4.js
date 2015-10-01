var pdf = require('pdfcrowd');

// create an API client instance
var client = new pdf.Pdfcrowd("ammo700", "f41070362937f05f79b671094cd9ab5b");


// convert a local HTML file:
client.convertFile('rendered/textbook.txt', pdf.saveToFile("Textbook.pdf"));
