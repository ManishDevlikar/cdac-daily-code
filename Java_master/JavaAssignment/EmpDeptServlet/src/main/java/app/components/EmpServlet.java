package app.components;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import app.data.Employee;
import app.model.EmployeeModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/emp")
public class EmpServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees = EmployeeModel.getEmployees();
        req.setAttribute("employees", employees);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ename = req.getParameter("ename");
        String job = req.getParameter("job");
        int mgr = Integer.parseInt(req.getParameter("mgr"));
        double sal = Double.parseDouble(req.getParameter("sal"));
        double comm = Double.parseDouble(req.getParameter("comm"));
        int deptno = Integer.parseInt(req.getParameter("deptno"));
        Employee employee = new Employee();
        employee.setEname(ename);
        employee.setJob(job);
        employee.setMgr(mgr);
        employee.setHiredate(new Date());
        employee.setComm(comm);
        employee.setSal(sal);

        EmployeeModel.saveEmployee(employee,deptno);
        List<Employee> employees = EmployeeModel.getEmployees();
        req.setAttribute("employees", employees);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
        
    }

    
    
}
