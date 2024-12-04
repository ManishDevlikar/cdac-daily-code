"use strict";
console.log("file loaded");

const apiPath = "https://fakestoreapi.com/products";

document.getElementById("btn").onclick = () => {

    var xmlhttp = new XMLHttpRequest();
    console.log(xmlhttp);
    console.log(xmlhttp.readyState, xmlhttp.status);
    

    xmlhttp.onreadystatechange = () => {
        console.log(xmlhttp.readyState, xmlhttp.status);
        if(xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            console.log(xmlhttp.responseText);
           let record = JSON.parse(xmlhttp.responseText);
            // console.log(record);
            record && record.length> 0 && record.forEach((val) => {
                console.log(val);
                let divTag = document.createElement("div");
                divTag.className = "col-xl-3"
                divTag.style.border="1px solid #fff"
                divTag.style.margin="0.5rem"
                divTag.style.backgroundColor="#212121"
                divTag.style.color="#fff"



                let imgTag = document.createElement("img")
                imgTag.src = val.image;
                imgTag.className = "img-fluid"

                let h2Tag = document.createElement("h2")
                h2Tag.innerHTML = val.price;

                let pTag = document.createElement("p")
                pTag.innerHTML = val.title;

                divTag.append(imgTag, h2Tag, pTag)
                document.querySelector('.row').append(divTag);
            });
        }
    }
    xmlhttp.open("GET" , apiPath);

    xmlhttp.send();

}