// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exam.proto

package com.smartclassrooms.grpc.exam;

public final class Exam {
  private Exam() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Assignment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Assignment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SubmissionConfirmation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SubmissionConfirmation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Grade_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Grade_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nexam.proto\"2\n\nAssignment\022\020\n\010username\030\001" +
      " \001(\t\022\022\n\ncoursename\030\002 \001(\t\"J\n\026SubmissionCo" +
      "nfirmation\022\032\n\022submissionresponse\030\001 \001(\t\022\024" +
      "\n\014responseCode\030\002 \001(\005\"\"\n\016StudentRequest\022\020" +
      "\n\010username\030\001 \001(\t\".\n\005Grade\022\r\n\005grade\030\001 \001(\005" +
      "\022\026\n\016assignmentname\030\002 \001(\t2r\n\004exam\022@\n\024assi" +
      "gnmentSubmission\022\013.Assignment\032\027.Submissi" +
      "onConfirmation\"\000(\001\022(\n\tgetGrades\022\017.Studen" +
      "tRequest\032\006.Grade\"\0000\001B!\n\035com.smartclassro" +
      "oms.grpc.examP\001b\006proto3"
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
    internal_static_Assignment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Assignment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Assignment_descriptor,
        new java.lang.String[] { "Username", "Coursename", });
    internal_static_SubmissionConfirmation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SubmissionConfirmation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SubmissionConfirmation_descriptor,
        new java.lang.String[] { "Submissionresponse", "ResponseCode", });
    internal_static_StudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_StudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StudentRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_Grade_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Grade_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Grade_descriptor,
        new java.lang.String[] { "Grade", "Assignmentname", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
