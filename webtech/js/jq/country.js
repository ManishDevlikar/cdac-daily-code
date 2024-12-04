// console.log($("#btn"));

$(document).ready(function(){
    // console.log($("#btn"));
    $("#btn").click(function(){
        var data = $("#txt").val();
        // console.log(data);
        
        if(data == ""){
            var apiPath = 'https://restcountries.com/v3.1/all'
        }
        else{
            var apiPath = `https://restcountries.com/v3.1/name/${data}`;
        }
        console.log(apiPath);

        $.ajax({
            type:"GET",
            url:apiPath,
            success:function(response){
                console.log(response);
                
                $(".row").html("");
                $.each(response, function(i , val){
                    console.log(val);
                    console.log(val.flags.png , val.name.common);
                   
                    $(".row").append(`
                        <div  class='col-3 text-center'>
                            <img src="${val.flags.png}" class="img-fluid" />
                            <h4>${val.name.common}</h4>
                        </div>    
                    `)
                });
            },
            error:function(message){
                console.log(message);
                
            },
        })
        
    });
})
