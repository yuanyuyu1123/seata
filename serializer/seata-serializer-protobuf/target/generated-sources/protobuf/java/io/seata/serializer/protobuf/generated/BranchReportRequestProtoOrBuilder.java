// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: branchReportRequest.proto

package io.seata.serializer.protobuf.generated;

public interface BranchReportRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.BranchReportRequestProto)
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
   * <code>int64 branchId = 3;</code>
   */
  long getBranchId();

  /**
   * <code>string resourceId = 4;</code>
   */
  java.lang.String getResourceId();
  /**
   * <code>string resourceId = 4;</code>
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();

  /**
   * <code>.io.seata.protocol.protobuf.BranchStatusProto status = 5;</code>
   */
  int getStatusValue();
  /**
   * <code>.io.seata.protocol.protobuf.BranchStatusProto status = 5;</code>
   */
  io.seata.serializer.protobuf.generated.BranchStatusProto getStatus();

  /**
   * <code>string applicationData = 6;</code>
   */
  java.lang.String getApplicationData();
  /**
   * <code>string applicationData = 6;</code>
   */
  com.google.protobuf.ByteString
      getApplicationDataBytes();

  /**
   * <code>.io.seata.protocol.protobuf.BranchTypeProto branchType = 7;</code>
   */
  int getBranchTypeValue();
  /**
   * <code>.io.seata.protocol.protobuf.BranchTypeProto branchType = 7;</code>
   */
  io.seata.serializer.protobuf.generated.BranchTypeProto getBranchType();
}
