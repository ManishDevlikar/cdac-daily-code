package app;
import app.services.EmployeeService;
import io.grpc.ServerBuilder;

public class Program {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Service started on http://localhost:4030");
        ServerBuilder.forPort(4030)
            .addService(new EmployeeService())
            .build()
            .start()
            .awaitTermination();
    }
}

