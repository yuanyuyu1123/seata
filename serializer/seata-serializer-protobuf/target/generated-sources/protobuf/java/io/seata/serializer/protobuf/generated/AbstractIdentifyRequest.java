// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractIdentifyRequest.proto

package io.seata.serializer.protobuf.generated;

public final class AbstractIdentifyRequest {
  private AbstractIdentifyRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_AbstractIdentifyRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_AbstractIdentifyRequestProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035abstractIdentifyRequest.proto\022\032io.seat" +
      "a.protocol.protobuf\032\025abstractMessage.pro" +
      "to\"\305\001\n\034AbstractIdentifyRequestProto\022I\n\017a" +
      "bstractMessage\030\001 \001(\01320.io.seata.protocol" +
      ".protobuf.AbstractMessageProto\022\017\n\007versio" +
      "n\030\002 \001(\t\022\025\n\rapplicationId\030\003 \001(\t\022\037\n\027transa" +
      "ctionServiceGroup\030\004 \001(\t\022\021\n\textraData\030\005 \001" +
      "(\tBC\n&io.seata.serializer.protobuf.gener" +
      "atedB\027AbstractIdentifyRequestP\001b\006proto3"
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
          io.seata.serializer.protobuf.generated.AbstractMessage.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_AbstractIdentifyRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_AbstractIdentifyRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_AbstractIdentifyRequestProto_descriptor,
        new java.lang.String[] { "AbstractMessage", "Version", "ApplicationId", "TransactionServiceGroup", "ExtraData", });
    io.seata.serializer.protobuf.generated.AbstractMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
