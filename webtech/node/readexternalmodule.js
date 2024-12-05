const fs = require('fs');
const http = require('http');

var server = http.createServer((req,res) => {
    // res.end('help im under da water')
    // res.end(req.url);

    switch(req.url){
        case '/':
         var filename='home.html';
         break;
        case '/about':
         var filename='about.html';
         break;
        case '/contact':
         var filename='contact.html';
         break;
        default:
            var filename='home.html'; 
    }
    console.log(filename);
    fs.readFile(filename,'utf-8',(err,data)=>{
        if(err) throw err;    
        res.end(data);
    })
    })
server.listen(6969);