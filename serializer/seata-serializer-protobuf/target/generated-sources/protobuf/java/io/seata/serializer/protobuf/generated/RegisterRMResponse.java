// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registerRMResponse.proto

package io.seata.serializer.protobuf.generated;

public final class RegisterRMResponse {
  private RegisterRMResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_RegisterRMResponseProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_RegisterRMResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030registerRMResponse.proto\022\032io.seata.pro" +
      "tocol.protobuf\032\036abstractIdentifyResponse" +
      ".proto\"v\n\027RegisterRMResponseProto\022[\n\030abs" +
      "tractIdentifyResponse\030\001 \001(\01329.io.seata.p" +
      "rotocol.protobuf.AbstractIdentifyRespons" +
      "eProtoB>\n&io.seata.serializer.protobuf.g" +
      "eneratedB\022RegisterRMResponseP\001b\006proto3"
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
          io.seata.serializer.protobuf.generated.AbstractIdentifyResponse.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_RegisterRMResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_RegisterRMResponseProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_RegisterRMResponseProto_descriptor,
        new java.lang.String[] { "AbstractIdentifyResponse", });
    io.seata.serializer.protobuf.generated.AbstractIdentifyResponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}