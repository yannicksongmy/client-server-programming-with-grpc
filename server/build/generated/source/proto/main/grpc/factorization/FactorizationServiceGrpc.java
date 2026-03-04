package factorization;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Définition du service Factorization
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.1)",
    comments = "Source: factorization.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FactorizationServiceGrpc {

  private FactorizationServiceGrpc() {}

  public static final String SERVICE_NAME = "factorization.FactorizationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<factorization.Factorization.FactorRequest,
      factorization.Factorization.FactorResponse> getFactorizeStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FactorizeStream",
      requestType = factorization.Factorization.FactorRequest.class,
      responseType = factorization.Factorization.FactorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<factorization.Factorization.FactorRequest,
      factorization.Factorization.FactorResponse> getFactorizeStreamMethod() {
    io.grpc.MethodDescriptor<factorization.Factorization.FactorRequest, factorization.Factorization.FactorResponse> getFactorizeStreamMethod;
    if ((getFactorizeStreamMethod = FactorizationServiceGrpc.getFactorizeStreamMethod) == null) {
      synchronized (FactorizationServiceGrpc.class) {
        if ((getFactorizeStreamMethod = FactorizationServiceGrpc.getFactorizeStreamMethod) == null) {
          FactorizationServiceGrpc.getFactorizeStreamMethod = getFactorizeStreamMethod =
              io.grpc.MethodDescriptor.<factorization.Factorization.FactorRequest, factorization.Factorization.FactorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FactorizeStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  factorization.Factorization.FactorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  factorization.Factorization.FactorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FactorizationServiceMethodDescriptorSupplier("FactorizeStream"))
              .build();
        }
      }
    }
    return getFactorizeStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FactorizationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FactorizationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FactorizationServiceStub>() {
        @java.lang.Override
        public FactorizationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FactorizationServiceStub(channel, callOptions);
        }
      };
    return FactorizationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FactorizationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FactorizationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FactorizationServiceBlockingStub>() {
        @java.lang.Override
        public FactorizationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FactorizationServiceBlockingStub(channel, callOptions);
        }
      };
    return FactorizationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FactorizationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FactorizationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FactorizationServiceFutureStub>() {
        @java.lang.Override
        public FactorizationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FactorizationServiceFutureStub(channel, callOptions);
        }
      };
    return FactorizationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Définition du service Factorization
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Mode flux bidirectionnel
     * </pre>
     */
    default io.grpc.stub.StreamObserver<factorization.Factorization.FactorRequest> factorizeStream(
        io.grpc.stub.StreamObserver<factorization.Factorization.FactorResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFactorizeStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FactorizationService.
   * <pre>
   * Définition du service Factorization
   * </pre>
   */
  public static abstract class FactorizationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FactorizationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FactorizationService.
   * <pre>
   * Définition du service Factorization
   * </pre>
   */
  public static final class FactorizationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FactorizationServiceStub> {
    private FactorizationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorizationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FactorizationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Mode flux bidirectionnel
     * </pre>
     */
    public io.grpc.stub.StreamObserver<factorization.Factorization.FactorRequest> factorizeStream(
        io.grpc.stub.StreamObserver<factorization.Factorization.FactorResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFactorizeStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FactorizationService.
   * <pre>
   * Définition du service Factorization
   * </pre>
   */
  public static final class FactorizationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FactorizationServiceBlockingStub> {
    private FactorizationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorizationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FactorizationServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FactorizationService.
   * <pre>
   * Définition du service Factorization
   * </pre>
   */
  public static final class FactorizationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FactorizationServiceFutureStub> {
    private FactorizationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorizationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FactorizationServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FACTORIZE_STREAM = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FACTORIZE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.factorizeStream(
              (io.grpc.stub.StreamObserver<factorization.Factorization.FactorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFactorizeStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              factorization.Factorization.FactorRequest,
              factorization.Factorization.FactorResponse>(
                service, METHODID_FACTORIZE_STREAM)))
        .build();
  }

  private static abstract class FactorizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FactorizationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return factorization.Factorization.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FactorizationService");
    }
  }

  private static final class FactorizationServiceFileDescriptorSupplier
      extends FactorizationServiceBaseDescriptorSupplier {
    FactorizationServiceFileDescriptorSupplier() {}
  }

  private static final class FactorizationServiceMethodDescriptorSupplier
      extends FactorizationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FactorizationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FactorizationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FactorizationServiceFileDescriptorSupplier())
              .addMethod(getFactorizeStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
