namespace DemoApp.Services;

public class Greeting
{
    public static async Task Welcome(HttpResponse response)
    {
        await response.WriteAsync(
            $"""
            <html>
                <head>
                    <title>DemoApp</title>
                </head>
                <body>
                    <h1>Welcome Visitor</h1>
                    <p>
                        <b>Current Time: </b>{DateTime.Now}
                    </p>
                    <form method="POST" action="Simple">
                        <b>Principle:</b>
                        <input type="text" name="principle"/>
                                                <b>rate:</b>
                        <input type="text" name="rate"/>
                        <b>time:</b>
                        <input type="text" name="time"/>
                        <input type="submit" value="Calculate"/>
                    </form>
                </body>
            </html>
            """);
    }

    public static async Task Hello(HttpRequest request, HttpResponse response, IInterest interest)
    {
        double principle = double.Parse(request.Form["principle"]);
        double rate = double.Parse(request.Form["rate"]);
        double time = double.Parse(request.Form["time"]);
        double Interest = interest.GetInterest(principle, rate, time);
        await response.WriteAsync(
            $"""
            <html>
                <head>
                    <title>DemoApp</title>
                </head>
                <body>
                    <h1>The interest for Principle{principle} Rate {rate} and Time {time} is magicccccccc
                    </h1>
                    <p>
                        <b>SI: </b>{Interest}
                    </p>
                </body>
            </html> 
            """
        );
    }

    //  public static async Task CompoundForm(HttpResponse response)
    // {
    //     await response.WriteAsync(
    //         $"""
    //         <html>
    //             <head>
    //                 <title>DemoApp</title>
    //             </head>
    //             <body>
    //                 <h1>Welcome Visitor</h1>
    //                 <p>
    //                     <b>Current Time: </b>{DateTime.Now}
    //                 </p>
    //                 <form method="POST" action="Compound">
    //                     <b>Principle:</b>
    //                     <input type="text" name="principle"/>
    //                                             <b>rate:</b>
    //                     <input type="text" name="rate"/>
    //                     <b>time:</b>
    //                     <input type="text" name="time"/>
    //                     <input type="submit" value="Calculate"/>
    //                 </form>
    //             </body>
    //         </html>
    //         """);
    // }
    // public static async Task Compound(HttpRequest request, HttpResponse response)
    // {
    //     double principal = double.Parse(request.Form["principle"]);
    //     double rate = double.Parse(request.Form["rate"]);
    //     double time = double.Parse(request.Form["time"]);
    //     double compoundInterest = principal * Math.Pow(1 + rate / 100, time);
    //     await response.WriteAsync(
    //         $"""
    //         <html>
    //             <head>
    //                 <title>DemoApp</title>
    //             </head>
    //             <body>
    //                 <h1>The compound interest for Principle{principal} Rate {rate} and Time {time} is magicccccccc
    //                 </h1>
    //                 <p>
    //                     <b>CI: </b>{compoundInterest - principal}
    //                 </p>
    //             </body>
    //         </html> 
    //         """
    //     );
    // }
}


