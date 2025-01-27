const exp = require('express')
const cookieParsel = require('cookie-parser');
const app = exp();

//middleware to parse cookie
app.use(cookieParsel());

const shop ={
    'name':"dukan",
    "date of opening":Date.now(),
    'no of items':100
}


// craeting and sending cookie
app.get('/',(req,res)=>{
    res.cookie('user','sunny',{
        maxAge: 1000*60*60*24*7 ,    // 1 day in milliseconds   
        httpOnly: true,              // Prevent access via client-side scripts
        secure: false,               // Set to true if using HTTPS
        sameSite: 'strict'           // Restrict cross-site cookie sharing  
    });
    res.send("on home page cookie created");
})

app.get("/cookie",(req,res)=>{
    const cookieVal = req.cookies['user'];
    if(cookieVal==='manish'){
        res.send({'shop':shop,'cookie':req.cookies['user']});
    }else{
        res.send("cookie not found");
    }
})




app.listen(3000,()=>{
    console.log("running on 3000"); 
});

