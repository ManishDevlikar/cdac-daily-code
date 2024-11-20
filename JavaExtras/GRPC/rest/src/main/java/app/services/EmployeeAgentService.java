package app.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.google.rpc.context.AttributeContext;

import emps.EmpDept;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/employees")
public class EmployeeAgentService {
    
    @GET
    @Path("/{deptno}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployeeListByDept(@PathParam("deptno") double deptno){
        List<WorkforceHero> heroes = new ArrayList<>();
        try(var remote = new EmployeeManagerClient()) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            var request=EmpDept.DeptInput.newBuilder()
                        .setDeptId(deptno)
                        .build();

            var reply = remote.stub().fetchEmployees(request);
            reply.forEachRemaining(msg->{
                WorkforceHero hero = new WorkforceHero();
                hero.empno=msg.getEmpno();
                hero.ename=msg.getEname();
                hero.sal=msg.getSal();
                hero.comm=msg.getComm();
                hero.job=msg.getJob();
                hero.mgr=msg.getMgr();
                hero.deptno=msg.getDeptno();
                try {
                    hero.hiredate=formatter.parse(msg.getHiredate());
                } catch (ParseException ex) {
                }
                heroes.add(hero);
            });
        } catch (Exception ex) {
        } 
        return heroes.size()>0 ? Response.ok(heroes).build()
                                   : Response.status(400).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployee(){
        return Response.ok("success").build();
    }
}
