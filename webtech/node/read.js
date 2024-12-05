const fs = require('fs');

console.log('starting server');

fs.readFile('home.html', 'utf-8' , (err, data) => {
    if(err) throw err;
    else console.log(data);
})

console.log('end');