console.log("Starting");
$(document).ready(()=>{
    $('button').click(function(){
        var data1 = $('#x1').val();
        var data2 = $('#x2').val();
        var data3 = $('#x3').val();

        var pinCode = /^[1-9][0-9][0-9][0-9][0-9][0-9]$/; // -> [] indicates 1 character
        var mobileNumber = /^[1-9][0-9]{9}$/;  // {} -> range characters
        var panCard = /^([a-zA-Z]{5})([0-9]{4})([a-ZA-Z])$/;  // {} -> range characters

       let res1=pinCode.test(data1);
       let res2=mobileNumber.test(data2);
       let res3=panCard.test(data3);

       if(!res1) {
        // alert('Please enter a valid ghar ka thikana')
        $('p').html(`<b>invalid pincode</b>`) 
        console.log("dd");
    } else if(!res2) {
        // alert('Teri crush ka number kyu daal raha h?')
        $('p').html(`<b>invalid pincode</b>`) 
    } 
    else if(!res3) {
        // alert('bhai aadhar aur pan card link kar')
        $('p').html(`<b>invalid pincode</b>`) 
       } 
       else 
       $('p').html(`<b>success</b>`) 

    })
})