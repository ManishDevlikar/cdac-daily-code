<%@ page import="java.util.List, app.data.Employee" %>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
    </head>

    <body>
        <h1>Employees</h1>
        <table border="1px">
            <thead>
                <tr>
                    <td>EMPNO</td>
                    <td>ENAME</td>
                    <td>JOB</td>
                    <td>MGR</td>
                    <td>HIREDATE</td>
                    <td>SALARY</td>
                    <td>COMM</td>
                    <td>DEPTNO</td>
                </tr>
            </thead>
            <tbody>
                <% 
                    List<Employee> employeeList = (List<Employee>) request.getAttribute("employees");
                    if(employeeList != null)
                    {
                        for (Employee employee : employeeList)
                        {
                %>
                            <tr>
                                <td><%= employee.getEmpno() %></td>
                                <td><%= employee.getEname() %></td>
                                <td><%= employee.getJob() %></td>
                                <td><%= employee.getMgr() %></td>
                                <td><%= employee.getHiredate() %></td>
                                <td><%= employee.getSal() %></td>
                                <td><%= employee.getComm() %></td>
                                <td><%= employee.getDepartment().getDeptno() %></td>
                            </tr>
                <% 
                        } 
                    }else{
                %>
                <tr>
                    <td colspan="8">No employee found</td>
                </tr>
                <%
                }
                %>    
            </tbody>
        </table>
<div id="form-div">
    <form action="/emp" method="post">
        <h3>Enter employee details to insert</h3>
        <div>
            <label for="ename">Employee Name:</label>
            <input type="text" id="ename" name="ename" required>
        </div>
        <div>
            <label for="job">Employee Job:</label>
            <input type="text" id="job" name="job" required>
        </div>
        <div>
            <label for="mgr">Employee mgr:</label>
            <input type="number" id="mgr" name="mgr" required>
        </div>
        <div>
            <label for="sal">sal:</label>
            <input type="number" id="sal" name="sal" required>
        </div>
        <div>
            <label for="comm">comm:</label>
            <input type="number" id="comm" name="comm" required>
        </div>
        <div>
            <label for="deptno">deptno:</label>
            <input type="number" id="deptno" name="deptno" required>
        </div>
        <div id="center-btn-div">
            <input type="submit" value="submit">
        </div>
        </form>
    </div>
    </body>
    </html>