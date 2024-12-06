const express = require('express');

const nodemailer = require("nodemailer");
const app = express();
app.use(express.json());
app.use(express.urlencoded());
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


const transporter = nodemailer.createTransport({
    service: 'gmail',
    auth: {
      user: "manishdevlikar@gmail.com",
      pass: "wxxd qnez spyz yquw",
    },
  });


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

app.get('/menu', async (req, res) => {
    try {
        var result = await userModel.find();
        res.render("menu.ejs");
    } catch (err) {
        res.send(err);
    }
})
app.get('/add', async (req, res) => {
    try {
        var result = await userModel.find();
        res.render("adddata.ejs");
    } catch (err) {
        res.send(err);
    }
})
app.get('/show', async (req, res) => {
    try {
        var result = await userModel.find();
        res.render("showdata.ejs", {data : result});
    } catch (err) {
        res.send(err);
    }
})

app.post('/save', async (req,res) => {
    try {
     const instance = new userModel(req.body);
     await instance.save();
    //  res.send("badhai ho ladka hua h!")
    res.redirect('/show')
    } catch (err) {
     res.send(err);
    }
 
 })

app.post("/email-action", async(req,res) => {
    const info = await transporter.sendMail({
        from: '<jhingooorkaka@gmail.com>', // sender address
        to: req.body.email, // list of receivers
        subject: req.body.subject, // Subject line
        text: "Hello world?", // plain text body
        html: req.body.msg, // html body
      });
      res.redirect('/show');
})

app.listen(9000);