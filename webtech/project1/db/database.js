const mongoose = require('mongoose');

 async function dbConnection(){
    await mongoose.connect('mongodb://localhost:27017/metcdac2024') // localhost ->127.0.0.1:27017
}

// creating custom modeules
module.exports=dbConnection;