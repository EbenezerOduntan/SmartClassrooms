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
    comments = "Source: exam.proto")
public final class examGrpc {

  private examGrpc() {}

  public static final String SERVICE_NAME = "exam";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartclassrooms.grpc.Exam.Assignment,
      com.smartclassrooms.grpc.Exam.SubmissionConfirmation> getAssignmentSubmissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "assignmentSubmission",
      requestType = com.smartclassrooms.grpc.Exam.Assignment.class,
      responseType = com.smartclassrooms.grpc.Exam.SubmissionConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartclassrooms.grpc.Exam.Assignment,
      com.smartclassrooms.grpc.Exam.SubmissionConfirmation> getAssignmentSubmissionMethod() {
    io.grpc.MethodDescriptor<com.smartclassrooms.grpc.Exam.Assignment, com.smartclassrooms.grpc.Exam.SubmissionConfirmation> getAssignmentSubmissionMethod;
    if ((getAssignmentSubmissionMethod = examGrpc.getAssignmentSubmissionMethod) == null) {
      synchronized (examGrpc.class) {
        if ((getAssignmentSubmissionMethod = examGrpc.getAssignmentSubmissionMethod) == null) {
          examGrpc.getAssignmentSubmissionMethod = getAssignmentSubmissionMethod = 
              io.grpc.MethodDescriptor.<com.smartclassrooms.grpc.Exam.Assignment, com.smartclassrooms.grpc.Exam.SubmissionConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "exam", "assignmentSubmission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartclassrooms.grpc.Exam.Assignment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartclassrooms.grpc.Exam.SubmissionConfirmation.getDefaultInstance()))
                  .setSchemaDescriptor(new examMethodDescriptorSupplier("assignmentSubmission"))
                  .build();
          }
        }
     }
     return getAssignmentSubmissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartclassrooms.grpc.Exam.StudentRequest,
      com.smartclassrooms.grpc.Exam.Grade> getGetGradesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGrades",
      requestType = com.smartclassrooms.grpc.Exam.StudentRequest.class,
      responseType = com.smartclassrooms.grpc.Exam.Grade.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.smartclassrooms.grpc.Exam.StudentRequest,
      com.smartclassrooms.grpc.Exam.Grade> getGetGradesMethod() {
    io.grpc.MethodDescriptor<com.smartclassrooms.grpc.Exam.StudentRequest, com.smartclassrooms.grpc.Exam.Grade> getGetGradesMethod;
    if ((getGetGradesMethod = examGrpc.getGetGradesMethod) == null) {
      synchronized (examGrpc.class) {
        if ((getGetGradesMethod = examGrpc.getGetGradesMethod) == null) {
          examGrpc.getGetGradesMethod = getGetGradesMethod = 
              io.grpc.MethodDescriptor.<com.smartclassrooms.grpc.Exam.StudentRequest, com.smartclassrooms.grpc.Exam.Grade>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "exam", "getGrades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartclassrooms.grpc.Exam.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartclassrooms.grpc.Exam.Grade.getDefaultInstance()))
                  .setSchemaDescriptor(new examMethodDescriptorSupplier("getGrades"))
                  .build();
          }
        }
     }
     return getGetGradesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static examStub newStub(io.grpc.Channel channel) {
    return new examStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static examBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new examBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static examFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new examFutureStub(channel);
  }

  /**
   */
  public static abstract class examImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Exam.Assignment> assignmentSubmission(
        io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Exam.SubmissionConfirmation> responseObserver) {
      return asyncUnimplementedStreamingCall(getAssignmentSubmissionMethod(), responseObserver);
    }

    /**
     */
    public void getGrades(com.smartclassrooms.grpc.Exam.StudentRequest request,
        io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Exam.Grade> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGradesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAssignmentSubmissionMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.smartclassrooms.grpc.Exam.Assignment,
                com.smartclassrooms.grpc.Exam.SubmissionConfirmation>(
                  this, METHODID_ASSIGNMENT_SUBMISSION)))
          .addMethod(
            getGetGradesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.smartclassrooms.grpc.Exam.StudentRequest,
                com.smartclassrooms.grpc.Exam.Grade>(
                  this, METHODID_GET_GRADES)))
          .build();
    }
  }

  /**
   */
  public static final class examStub extends io.grpc.stub.AbstractStub<examStub> {
    private examStub(io.grpc.Channel channel) {
      super(channel);
    }

    private examStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected examStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new examStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Exam.Assignment> assignmentSubmission(
        io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Exam.SubmissionConfirmation> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAssignmentSubmissionMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getGrades(com.smartclassrooms.grpc.Exam.StudentRequest request,
        io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Exam.Grade> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetGradesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class examBlockingStub extends io.grpc.stub.AbstractStub<examBlockingStub> {
    private examBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private examBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected examBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new examBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.smartclassrooms.grpc.Exam.Grade> getGrades(
        com.smartclassrooms.grpc.Exam.StudentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetGradesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class examFutureStub extends io.grpc.stub.AbstractStub<examFutureStub> {
    private examFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private examFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected examFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new examFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_GRADES = 0;
  private static final int METHODID_ASSIGNMENT_SUBMISSION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final examImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(examImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GRADES:
          serviceImpl.getGrades((com.smartclassrooms.grpc.Exam.StudentRequest) request,
              (io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Exam.Grade>) responseObserver);
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
        case METHODID_ASSIGNMENT_SUBMISSION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.assignmentSubmission(
              (io.grpc.stub.StreamObserver<com.smartclassrooms.grpc.Exam.SubmissionConfirmation>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class examBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    examBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartclassrooms.grpc.Exam.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("exam");
    }
  }

  private static final class examFileDescriptorSupplier
      extends examBaseDescriptorSupplier {
    examFileDescriptorSupplier() {}
  }

  private static final class examMethodDescriptorSupplier
      extends examBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    examMethodDescriptorSupplier(String methodName) {
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
      synchronized (examGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new examFileDescriptorSupplier())
              .addMethod(getAssignmentSubmissionMethod())
              .addMethod(getGetGradesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
