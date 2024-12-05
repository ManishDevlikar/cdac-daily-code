const express = require('express');
const app = express();
app.use(express.json());
const mongoose = require('mongoose');
const result = require('./db/database');
result()
.then(()=>console.log("succ"))
.catch(err=>{console.log(err)});
const Schema = mongoose.Schema;
var userSchema = new Schema({
    name:String,
    age: Number
})

const userModel = mongoose.model('users', userSchema);




app.get('/users', async (req, res) => {
    try {
        var result = await userModel.find();
        res.send(result);
    } catch (err) {
        res.send(err);
    }
})

app.post('/users', async (req,res) => {
   try {
    const instance = new userModel(req.body);
    await instance.save();
    res.send("badhai ho ladka hua h!")
   } catch (err) {
    res.send(err);
   }

})

app.delete('/users', (req, res) => {
    res.send('dekhte h');
})

app.put('/users', (req, res) => {
    res.send('tu bht badal gai h re chinki');
})

app.listen(9000);