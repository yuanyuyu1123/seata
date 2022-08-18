// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractBranchEndRequest.proto

package io.seata.serializer.protobuf.generated;

public interface AbstractBranchEndRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.seata.protocol.protobuf.AbstractBranchEndRequestProto)
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
   * <pre>
   **
   * The Branch id.
   * </pre>
   *
   * <code>int64 branchId = 3;</code>
   */
  long getBranchId();

  /**
   * <pre>
   **
   * The Branch type.
   * </pre>
   *
   * <code>.io.seata.protocol.protobuf.BranchTypeProto branchType = 4;</code>
   */
  int getBranchTypeValue();
  /**
   * <pre>
   **
   * The Branch type.
   * </pre>
   *
   * <code>.io.seata.protocol.protobuf.BranchTypeProto branchType = 4;</code>
   */
  io.seata.serializer.protobuf.generated.BranchTypeProto getBranchType();

  /**
   * <pre>
   **
   * The Resource id.
   * </pre>
   *
   * <code>string resourceId = 5;</code>
   */
  java.lang.String getResourceId();
  /**
   * <pre>
   **
   * The Resource id.
   * </pre>
   *
   * <code>string resourceId = 5;</code>
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();

  /**
   * <pre>
   **
   * The Application data.
   * </pre>
   *
   * <code>string applicationData = 6;</code>
   */
  java.lang.String getApplicationData();
  /**
   * <pre>
   **
   * The Application data.
   * </pre>
   *
   * <code>string applicationData = 6;</code>
   */
  com.google.protobuf.ByteString
      getApplicationDataBytes();
}
