// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalRollbackResponse.proto

package io.seata.serializer.protobuf.generated;

public final class GlobalRollbackResponse {
  private GlobalRollbackResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_GlobalRollbackResponseProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_GlobalRollbackResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034globalRollbackResponse.proto\022\032io.seata" +
      ".protocol.protobuf\032\037abstractGlobalEndRes" +
      "ponse.proto\"|\n\033GlobalRollbackResponsePro" +
      "to\022]\n\031abstractGlobalEndResponse\030\001 \001(\0132:." +
      "io.seata.protocol.protobuf.AbstractGloba" +
      "lEndResponseProtoBB\n&io.seata.serializer" +
      ".protobuf.generatedB\026GlobalRollbackRespo" +
      "nseP\001b\006proto3"
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
          io.seata.serializer.protobuf.generated.AbstractGlobalEndResponse.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_GlobalRollbackResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_GlobalRollbackResponseProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_GlobalRollbackResponseProto_descriptor,
        new java.lang.String[] { "AbstractGlobalEndResponse", });
    io.seata.serializer.protobuf.generated.AbstractGlobalEndResponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
