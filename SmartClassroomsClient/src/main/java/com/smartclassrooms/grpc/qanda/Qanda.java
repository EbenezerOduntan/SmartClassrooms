// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qanda.proto

package com.smartclassrooms.grpc.qanda;

public final class Qanda {
  private Qanda() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Question_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Question_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Answer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Answer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013qanda.proto\"3\n\010Question\022\020\n\010username\030\001 " +
      "\001(\t\022\025\n\rquestion_text\030\002 \001(\t\"/\n\006Answer\022\020\n\010" +
      "username\030\001 \001(\t\022\023\n\013answer_text\030\002 \001(\t2,\n\005q" +
      "anda\022#\n\tliveQandA\022\t.Question\032\007.Answer(\0010" +
      "\001B\"\n\036com.smartclassrooms.grpc.qandaP\001b\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Question_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Question_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Question_descriptor,
        new java.lang.String[] { "Username", "QuestionText", });
    internal_static_Answer_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Answer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Answer_descriptor,
        new java.lang.String[] { "Username", "AnswerText", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
