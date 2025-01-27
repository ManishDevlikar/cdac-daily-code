const express = require('express');
const pathM= require('path');

const app = express();

const path = pathM.join(__dirname,'../public')

// buit in middleware
app.use(express.static(path))

// sending html

app.get("/",(req,res)=>{
    res.send();
})

app.get("/about",(req,res)=>{
    // const p = pathM.join(__dirname,'../public/about.html')
    res.sendFile(`${path}/about.html`);
})

app.listen(3000,()=>{
    console.log("listening on port 3000");
    
})