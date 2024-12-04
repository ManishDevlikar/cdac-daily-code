"use strict";
let P = document.getElementById("f1").value;
let C = document.getElementById("f2").value;
let M = document.getElementById("f3").value;
// document.getElementById('btn').onclick = () => {
//     if (P == "" || C == "" || M == "") {
//         alert("There are empty fields!")
//     } else if (isNaN(P) || isNaN(C) || isNaN(M)) {
//         alert("Only numbers are allowed")
//     } else if (P < 0 || C < 0 || M < 0) {
//         alert("Negative numbers are not allowed")
//     } else {
//         P = parseFloat(P)
//         C = parseFloat(C)
//         M = parseFloat(M)

//         var result = P + C + M
//         let total = 300
//         let percentage = (result / total) * 100;

//         document.getElementById("r1").innerHTML = result
//         document.getElementById("r2").innerHTML = percentage
//     }
// }

document.getElementById("btn").addEventListener("click",()=>{


        if (P == "" || C == "" || M == "") {
            alert("There are empty fields!")
        } else if (isNaN(P) || isNaN(C) || isNaN(M)) {
            alert("Only numbers are allowed")
        } else if (P < 0 || C < 0 || M < 0) {
            alert("Negative numbers are not allowed")
        } else {
            P = parseFloat(P)
            C = parseFloat(C)
            M = parseFloat(M)
    
            var result = P + C + M
            let total = 300
            let percentage = (result / total) * 100;
            percentage= percentage.toFixed(2);
    
            document.getElementById("r1").innerHTML = result
            document.getElementById("r2").innerHTML = percentage
        }

        Highcharts.chart('container', {
            chart: {
                type: 'pie'
            },
            title: {
                text: 'Dont take up computer science'
            },
            tooltip: {
                valueSuffix: '%'
            },
            subtitle: {
                text:
                'Source:<a href="https://www.mdpi.com/2072-6643/11/3/684/htm" target="_default">MDPI</a>'
            },
            plotOptions: {
                series: {
                    allowPointSelect: true,
                    cursor: 'pointer',
                    dataLabels: [{
                        enabled: true,
                        distance: 20
                    }, {
                        enabled: true,
                        distance: -40,
                        format: '{point.percentage:.1f}%',
                        style: {
                            fontSize: '1.2em',
                            textOutline: 'none',
                            opacity: 0.7
                        },
                        filter: {
                            operator: '>',
                            property: 'percentage',
                            value: 10
                        }
                    }]
                }
            },
            series: [
                {
                    name: 'Percentage',
                    colorByPoint: true,
                    data: [
                        {
                            name: 'Physics',
                            y: P
                        },
                        {
                            name: 'Chemistry',
                            sliced: true,
                            selected: true,
                            y: C
                        },
                        {
                            name: 'Maths',
                            y: M
                        }
                    ]
                }
            ]
        });
        
});