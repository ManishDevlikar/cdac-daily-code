const http = require('http');

const server = http.createServer((req, res) => {
    res.end('Loda bancho');

});

server.listen(6969);