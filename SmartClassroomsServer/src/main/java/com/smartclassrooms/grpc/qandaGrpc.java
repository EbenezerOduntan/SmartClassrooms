package com.smartclassrooms.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: qanda.proto")
public final class qandaGrpc {

  private qandaGrpc() {}

  public static final String SERVICE_NAME = "qanda";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartclassrooms.grpc.Qanda.Question,
      com.smartclassrooms.grpc.Qanda.Answer> getLiveQandAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "liveQandA",
      requestType = com.smartclassrooms.grpc.Qanda.Question.class,
      responseType = com.smartclassrooms.grpc.Qanda.Answer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartclassrooms.grpc.Qanda.Question,
      com.smartclassrooms.grpc.Qanda.Answer> getLiveQandAMethod() {
    io.grpc.MethodDescriptor<com.smartclassrooms.grpc.Qanda.Question, com.smartclassrooms.grpc.Qanda.Answer> getLiveQandAMethod;
    if ((getLiveQandAMethod = qandaGrpc.getLiveQandAMethod) == null) {
      synchronized (qandaGrpc.class) {
        if ((getLiveQandAMethod = qandaGrpc.getLiveQandAMethod) == null) {
          qandaGrpc.getLiveQandAMethod = getLiveQandAMethod = 
              io.grpc.MethodDescriptor.<com.smartclassrooms.grpc.Qanda.Question, com.smartclassrooms.grpc.Qanda.Answer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "qanda", "liveQandA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartclassrooms.grpc.Qanda.Question.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartclassrooms.grpc.Qanda.Answer.getDefaultInstance()))
                  .setSchemaDescriptor(new qandaMethodDescriptorSupplier("liveQandA"))
                  .build();
          }
        }
     }
     return getLiveQandAMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static qandaStub newStub(io.grpc.Channel channel) {
    return new qandaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static qandaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new qandaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static qandaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new qandaFutureStub(channel);
  }

  /**
   */
  public static abstract class qandaImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Qanda.Question> liveQandA(
        io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Qanda.Answer> responseObserver) {
      return asyncUnimplementedStreamingCall(getLiveQandAMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLiveQandAMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.smartclassrooms.grpc.Qanda.Question,
                com.smartclassrooms.grpc.Qanda.Answer>(
                  this, METHODID_LIVE_QAND_A)))
          .build();
    }
  }

  /**
   */
  public static final class qandaStub extends io.grpc.stub.AbstractStub<qandaStub> {
    private qandaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private qandaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected qandaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new qandaStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Qanda.Question> liveQandA(
        io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Qanda.Answer> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getLiveQandAMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class qandaBlockingStub extends io.grpc.stub.AbstractStub<qandaBlockingStub> {
    private qandaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private qandaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected qandaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new qandaBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class qandaFutureStub extends io.grpc.stub.AbstractStub<qandaFutureStub> {
    private qandaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private qandaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected qandaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new qandaFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_LIVE_QAND_A = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final qandaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(qandaImplBase serviceImpl, int methodId) {
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
        case METHODID_LIVE_QAND_A:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.liveQandA(
              (io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Qanda.Answer>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class qandaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    qandaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartclassrooms.grpc.Qanda.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("qanda");
    }
  }

  private static final class qandaFileDescriptorSupplier
      extends qandaBaseDescriptorSupplier {
    qandaFileDescriptorSupplier() {}
  }

  private static final class qandaMethodDescriptorSupplier
      extends qandaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    qandaMethodDescriptorSupplier(String methodName) {
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
      synchronized (qandaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new qandaFileDescriptorSupplier())
              .addMethod(getLiveQandAMethod())
              .build();
        }
      }
    }
    return result;
  }
}
