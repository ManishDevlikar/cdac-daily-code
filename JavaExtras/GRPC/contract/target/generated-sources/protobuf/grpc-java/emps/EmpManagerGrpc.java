package emps;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class EmpManagerGrpc {

  private EmpManagerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "emps.EmpManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<emps.EmpDept.EmployeeInput,
      emps.EmpDept.EmployeeStatus> getInsertEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertEmployee",
      requestType = emps.EmpDept.EmployeeInput.class,
      responseType = emps.EmpDept.EmployeeStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<emps.EmpDept.EmployeeInput,
      emps.EmpDept.EmployeeStatus> getInsertEmployeeMethod() {
    io.grpc.MethodDescriptor<emps.EmpDept.EmployeeInput, emps.EmpDept.EmployeeStatus> getInsertEmployeeMethod;
    if ((getInsertEmployeeMethod = EmpManagerGrpc.getInsertEmployeeMethod) == null) {
      synchronized (EmpManagerGrpc.class) {
        if ((getInsertEmployeeMethod = EmpManagerGrpc.getInsertEmployeeMethod) == null) {
          EmpManagerGrpc.getInsertEmployeeMethod = getInsertEmployeeMethod =
              io.grpc.MethodDescriptor.<emps.EmpDept.EmployeeInput, emps.EmpDept.EmployeeStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emps.EmpDept.EmployeeInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emps.EmpDept.EmployeeStatus.getDefaultInstance()))
              .setSchemaDescriptor(new EmpManagerMethodDescriptorSupplier("InsertEmployee"))
              .build();
        }
      }
    }
    return getInsertEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<emps.EmpDept.DeptInput,
      emps.EmpDept.Employee> getFetchEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchEmployees",
      requestType = emps.EmpDept.DeptInput.class,
      responseType = emps.EmpDept.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<emps.EmpDept.DeptInput,
      emps.EmpDept.Employee> getFetchEmployeesMethod() {
    io.grpc.MethodDescriptor<emps.EmpDept.DeptInput, emps.EmpDept.Employee> getFetchEmployeesMethod;
    if ((getFetchEmployeesMethod = EmpManagerGrpc.getFetchEmployeesMethod) == null) {
      synchronized (EmpManagerGrpc.class) {
        if ((getFetchEmployeesMethod = EmpManagerGrpc.getFetchEmployeesMethod) == null) {
          EmpManagerGrpc.getFetchEmployeesMethod = getFetchEmployeesMethod =
              io.grpc.MethodDescriptor.<emps.EmpDept.DeptInput, emps.EmpDept.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emps.EmpDept.DeptInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emps.EmpDept.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmpManagerMethodDescriptorSupplier("FetchEmployees"))
              .build();
        }
      }
    }
    return getFetchEmployeesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmpManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmpManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmpManagerStub>() {
        @java.lang.Override
        public EmpManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmpManagerStub(channel, callOptions);
        }
      };
    return EmpManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmpManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmpManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmpManagerBlockingStub>() {
        @java.lang.Override
        public EmpManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmpManagerBlockingStub(channel, callOptions);
        }
      };
    return EmpManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmpManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmpManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmpManagerFutureStub>() {
        @java.lang.Override
        public EmpManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmpManagerFutureStub(channel, callOptions);
        }
      };
    return EmpManagerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void insertEmployee(emps.EmpDept.EmployeeInput request,
        io.grpc.stub.StreamObserver<emps.EmpDept.EmployeeStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertEmployeeMethod(), responseObserver);
    }

    /**
     */
    default void fetchEmployees(emps.EmpDept.DeptInput request,
        io.grpc.stub.StreamObserver<emps.EmpDept.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchEmployeesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmpManager.
   */
  public static abstract class EmpManagerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmpManagerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmpManager.
   */
  public static final class EmpManagerStub
      extends io.grpc.stub.AbstractAsyncStub<EmpManagerStub> {
    private EmpManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmpManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmpManagerStub(channel, callOptions);
    }

    /**
     */
    public void insertEmployee(emps.EmpDept.EmployeeInput request,
        io.grpc.stub.StreamObserver<emps.EmpDept.EmployeeStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchEmployees(emps.EmpDept.DeptInput request,
        io.grpc.stub.StreamObserver<emps.EmpDept.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFetchEmployeesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmpManager.
   */
  public static final class EmpManagerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmpManagerBlockingStub> {
    private EmpManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmpManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmpManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public emps.EmpDept.EmployeeStatus insertEmployee(emps.EmpDept.EmployeeInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<emps.EmpDept.Employee> fetchEmployees(
        emps.EmpDept.DeptInput request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFetchEmployeesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmpManager.
   */
  public static final class EmpManagerFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmpManagerFutureStub> {
    private EmpManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmpManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmpManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<emps.EmpDept.EmployeeStatus> insertEmployee(
        emps.EmpDept.EmployeeInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INSERT_EMPLOYEE = 0;
  private static final int METHODID_FETCH_EMPLOYEES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INSERT_EMPLOYEE:
          serviceImpl.insertEmployee((emps.EmpDept.EmployeeInput) request,
              (io.grpc.stub.StreamObserver<emps.EmpDept.EmployeeStatus>) responseObserver);
          break;
        case METHODID_FETCH_EMPLOYEES:
          serviceImpl.fetchEmployees((emps.EmpDept.DeptInput) request,
              (io.grpc.stub.StreamObserver<emps.EmpDept.Employee>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getInsertEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              emps.EmpDept.EmployeeInput,
              emps.EmpDept.EmployeeStatus>(
                service, METHODID_INSERT_EMPLOYEE)))
        .addMethod(
          getFetchEmployeesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              emps.EmpDept.DeptInput,
              emps.EmpDept.Employee>(
                service, METHODID_FETCH_EMPLOYEES)))
        .build();
  }

  private static abstract class EmpManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmpManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return emps.EmpDept.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmpManager");
    }
  }

  private static final class EmpManagerFileDescriptorSupplier
      extends EmpManagerBaseDescriptorSupplier {
    EmpManagerFileDescriptorSupplier() {}
  }

  private static final class EmpManagerMethodDescriptorSupplier
      extends EmpManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EmpManagerMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EmpManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmpManagerFileDescriptorSupplier())
              .addMethod(getInsertEmployeeMethod())
              .addMethod(getFetchEmployeesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
