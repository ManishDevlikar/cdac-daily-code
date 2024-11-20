package app.services;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import emps.EmpManagerGrpc.EmpManagerBlockingStub;
import emps.EmpManagerGrpc;


public class EmployeeManagerClient implements AutoCloseable{

    private final ManagedChannel channel = ManagedChannelBuilder
            .forAddress("localhost", 4030)
            .usePlaintext()
            .build();

    public EmpManagerBlockingStub stub(){
        return EmpManagerGrpc.newBlockingStub(channel);
    }

    @Override
    public void close() throws Exception {
        channel.shutdown();
    }

}
