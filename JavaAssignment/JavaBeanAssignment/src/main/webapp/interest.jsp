<jsp:useBean id="si" class="app.components.SIBean" scope="page" />
<jsp:setProperty name="si" property="*" />
<html>

<head>
    <title>Simple Interest Calculator</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <h1>Enter the below details</h1>
    <div class="container">
        <form class="straight" method="post">
            <div>
                <b>Principle:</b>
                <input type="number" name="principle" />
            </div>
            <div>
                <b>Rate of Interest:</b>
                <input type="number" step="0.01" name="rate">
            </div>
            <div>
                <b>No of months:</b>
                <input type="number" name="months">
            </div>

            <div class="neeche">
                <input type="submit" value="Calculate" />
            </div>

            <div class="jawab">
                <b>Your Simple interest is:</b>${si.calculateInterest}
            </div>

        </form>
    </div>

</body>

</html>