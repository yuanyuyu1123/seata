// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractBranchEndResponse.proto

package io.seata.serializer.protobuf.generated;

public interface AbstractBranchEndResponseProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.AbstractBranchEndResponseProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionResponseProto abstractTransactionResponse = 1;</code>
   */
  boolean hasAbstractTransactionResponse();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionResponseProto abstractTransactionResponse = 1;</code>
   */
  io.seata.serializer.protobuf.generated.AbstractTransactionResponseProto getAbstractTransactionResponse();
  /**
   * <code>.io.seata.protocol.protobuf.AbstractTransactionResponseProto abstractTransactionResponse = 1;</code>
   */
  io.seata.serializer.protobuf.generated.AbstractTransactionResponseProtoOrBuilder getAbstractTransactionResponseOrBuilder();

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
   * <code>int64 branchId = 3;</code>
   */
  long getBranchId();

  /**
   * <code>.io.seata.protocol.protobuf.BranchStatusProto branchStatus = 4;</code>
   */
  int getBranchStatusValue();
  /**
   * <code>.io.seata.protocol.protobuf.BranchStatusProto branchStatus = 4;</code>
   */
  io.seata.serializer.protobuf.generated.BranchStatusProto getBranchStatus();
}
