// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractGlobalEndRequest.proto

package io.seata.serializer.protobuf.generated;

public interface AbstractGlobalEndRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.AbstractGlobalEndRequestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  boolean hasAbstractTransactionRequest();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  io.seata.serializer.protobuf.generated.AbstractTransactionRequestProto getAbstractTransactionRequest();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionRequestProto abstractTransactionRequest = 1;</code>
   */
  io.seata.serializer.protobuf.generated.AbstractTransactionRequestProtoOrBuilder getAbstractTransactionRequestOrBuilder();

  /**
   * <code>string xid = 2;</code>
   */
  java.lang.String getXid();
  /**
   * <code>string xid = 2;</code>
   */
  com.google.protobuf.ByteString
      getXidBytes();

  /**
   * <code>string extraData = 3;</code>
   */
  java.lang.String getExtraData();
  /**
   * <code>string extraData = 3;</code>
   */
  com.google.protobuf.ByteString
      getExtraDataBytes();
}
