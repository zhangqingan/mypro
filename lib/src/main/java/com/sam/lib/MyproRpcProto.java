// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mypro.proto

package com.sam.lib;

public final class MyproRpcProto {
  private MyproRpcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GrpcStringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GrpcStringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GrpcStringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GrpcStringResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013mypro.proto\" \n\021GrpcStringRequest\022\013\n\003st" +
      "r\030\001 \001(\t\"!\n\022GrpcStringResponse\022\013\n\003str\030\001 \001" +
      "(\t2G\n\017MyproRpcService\0224\n\007getUser\022\022.GrpcS" +
      "tringRequest\032\023.GrpcStringResponse\"\000B\036\n\013c" +
      "om.sam.libB\rMyproRpcProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GrpcStringRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GrpcStringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GrpcStringRequest_descriptor,
        new java.lang.String[] { "Str", });
    internal_static_GrpcStringResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GrpcStringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GrpcStringResponse_descriptor,
        new java.lang.String[] { "Str", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
