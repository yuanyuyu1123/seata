// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registerRMRequest.proto

package io.seata.serializer.protobuf.generated;

public final class RegisterRMRequest {
  private RegisterRMRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_RegisterRMRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_RegisterRMRequestProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027registerRMRequest.proto\022\032io.seata.prot" +
      "ocol.protobuf\032\035abstractIdentifyRequest.p" +
      "roto\"\210\001\n\026RegisterRMRequestProto\022Y\n\027abstr" +
      "actIdentifyRequest\030\001 \001(\01328.io.seata.prot" +
      "ocol.protobuf.AbstractIdentifyRequestPro" +
      "to\022\023\n\013resourceIds\030\002 \001(\tB=\n&io.seata.seri" +
      "alizer.protobuf.generatedB\021RegisterRMReq" +
      "uestP\001b\006proto3"
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
          io.seata.serializer.protobuf.generated.AbstractIdentifyRequest.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_RegisterRMRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_RegisterRMRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_RegisterRMRequestProto_descriptor,
        new java.lang.String[] { "AbstractIdentifyRequest", "ResourceIds", });
    io.seata.serializer.protobuf.generated.AbstractIdentifyRequest.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}