'use strict'
const API_KEY="VETC9Z23QJPFNVJJ42NPXV86F"
// `https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/London?key=${API_KEY} `
const api=`https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/`;

async function getData(city){
    try{
        let data= (await fetch(`${api}${city}?key=${API_KEY}`));
        
        if(!data.ok){
            throw new Error("Invalid City");
        }
        let dataJson=await data.json().then(data=>data);
        return dataJson;
    }catch(err){
        console.log("error");
        return null;
    }
}

const btnSubmit = document.getElementById("btn");


btnSubmit.addEventListener('click',async ()=>{
    let cardDetails=document.getElementById('card-details');

    let isPres=document.getElementById('weather-info');
    if(isPres){
        cardDetails.removeChild(isPres);
    }
    

    const city = document.getElementById("city").value;
    const temp= await getData(city);
    console.log(temp);

    if(temp){

        let divcity= document.createElement('div');
        divcity.id="weather-info";

        let h3cty=document.createElement('h3');
        let ptemp=document.createElement('p');
        let pcondi=document.createElement('p');
        
        h3cty.style.textTransform="capitalize";
        // console.log(divcity);
        
        h3cty.innerHTML="city: "+temp.address;
        let currTemp=  Math.round (Number ((temp.currentConditions.temp - 32) * 5/9)) ;
        ptemp.innerHTML=`temp: <span class="temp">${currTemp}&deg;C</span>`;
        ptemp.style.textTransform="capitalize";
        pcondi.innerHTML="Conditions: "+temp.currentConditions.conditions;
        divcity.append(h3cty,ptemp,pcondi);
        
        cardDetails.appendChild(divcity);
    }
})

