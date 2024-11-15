<html>
    <head>

    </head>

    <body>
        <h1>Hello MF's</h1>

        <form method="post" action="/si">
            <div>
                <label for="principle">Principle</label>
                <input type="number" id="principle" name="principle">
            </div>
            <div>
                <label for="rate">Rate</label>
                <input type="number" id="rate" name="rate">
            </div>
            <div>
                <label for="time">Time</label>
                <input type="number" id="time" name="time">
            </div>
            <div>
                <input type="submit" value="submit">
            </div>
        </form>

        <h1>Your Simple Interest is: ${simpleInterest}</h1>
    </body>
</html>