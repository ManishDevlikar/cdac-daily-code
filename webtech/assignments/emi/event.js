


console.log(document);
// getElementById() DOM Methods
console.log(document.getElementById('btn'));

//event handling
document.getElementById('btn').onclick = ()=>{
    console.log(document.getElementById('x1'));

    // DOM Properties - value
    var amount = document.getElementById('x1').value;
    var roi = document.getElementById('x2').value;
    var duration = document.getElementById('x3').value;


    console.log(amount);
    console.log(roi);
    console.log(isNaN(roi)); // true or false
    console.log(duration);

    if(amount == "" || roi =="" || duration==""){
        alert("Please enter Values")
    }
    else if(isNaN(amount) || isNaN(roi) || isNaN(duration)){
        alert("Values Must Be A Number");
    }
    else if(amount < 0 || roi < 0 || duration<0 ){
        alert("Values Must Be Positive");
    }
    else{
        //Type Casting
        var p = Number(amount);
        var n = parseInt(duration)*12;
        var r = parseFloat(roi)/12/100;

        console.log(p , typeof p);
        //P x R x (1+R)^N / [(1+R)^N-1] 

        var emi = p * r * (1+r)**n / ( (1+r)**n - 1 );
        console.log(emi);
        emi = Math.round(emi);

        console.log(document.getElementById('r1'));
        
        document.getElementById('r1').innerHTML = `&#8377; ${emi}`;
        document.getElementById('r2').innerHTML = `&#8377; ${amount}`;
        document.getElementById('r3').innerHTML = `&#8377; ${emi*n}`;
        document.getElementById('r4').innerHTML = `&#8377; ${emi*n-p}`;
        // document.getElementById('r1').innerText = `&#8377; ${emi}`;
        
        
    }
}
/*
    Bootstrap Grid
    Usage of ID in Javascript
    DOM Event Handling:
        document.getElementById('btn').onclick
    DOM Methods:
        document.getElementById('x1')
    DOM Propeties:
        innerHTML
        innerText
        value
    Control Structure - If Else
    Type Casting : Number() , parseInt() , parseFloat()
    Arithmetic Operators: +, -, *, /, %
    Exponential Operator: **
    Math Object

*/