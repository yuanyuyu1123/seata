// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractIdentifyRequest.proto

package io.seata.serializer.protobuf.generated;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf type {@code io.seata.protocol.protobuf.AbstractIdentifyRequestProto}
 */
public  final class AbstractIdentifyRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.seata.protocol.protobuf.AbstractIdentifyRequestProto)
    AbstractIdentifyRequestProtoOrBuilder {
  // Use AbstractIdentifyRequestProto.newBuilder() to construct.
  private AbstractIdentifyRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AbstractIdentifyRequestProto() {
    version_ = "";
    applicationId_ = "";
    transactionServiceGroup_ = "";
    extraData_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AbstractIdentifyRequestProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            io.seata.serializer.protobuf.generated.AbstractMessageProto.Builder subBuilder = null;
            if (abstractMessage_ != null) {
              subBuilder = abstractMessage_.toBuilder();
            }
            abstractMessage_ = input.readMessage(io.seata.serializer.protobuf.generated.AbstractMessageProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abstractMessage_);
              abstractMessage_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            applicationId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            transactionServiceGroup_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            extraData_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.seata.serializer.protobuf.generated.AbstractIdentifyRequest.internal_static_io_seata_protocol_protobuf_AbstractIdentifyRequestProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.seata.serializer.protobuf.generated.AbstractIdentifyRequest.internal_static_io_seata_protocol_protobuf_AbstractIdentifyRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.class, io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.Builder.class);
  }

  public static final int ABSTRACTMESSAGE_FIELD_NUMBER = 1;
  private io.seata.serializer.protobuf.generated.AbstractMessageProto abstractMessage_;
  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
   */
  public boolean hasAbstractMessage() {
    return abstractMessage_ != null;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
   */
  public io.seata.serializer.protobuf.generated.AbstractMessageProto getAbstractMessage() {
    return abstractMessage_ == null ? io.seata.serializer.protobuf.generated.AbstractMessageProto.getDefaultInstance() : abstractMessage_;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
   */
  public io.seata.serializer.protobuf.generated.AbstractMessageProtoOrBuilder getAbstractMessageOrBuilder() {
    return getAbstractMessage();
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   * <code>string version = 2;</code>
   */
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <code>string version = 2;</code>
   */
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPLICATIONID_FIELD_NUMBER = 3;
  private volatile java.lang.Object applicationId_;
  /**
   * <code>string applicationId = 3;</code>
   */
  public java.lang.String getApplicationId() {
    java.lang.Object ref = applicationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      applicationId_ = s;
      return s;
    }
  }
  /**
   * <code>string applicationId = 3;</code>
   */
  public com.google.protobuf.ByteString
      getApplicationIdBytes() {
    java.lang.Object ref = applicationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      applicationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTIONSERVICEGROUP_FIELD_NUMBER = 4;
  private volatile java.lang.Object transactionServiceGroup_;
  /**
   * <code>string transactionServiceGroup = 4;</code>
   */
  public java.lang.String getTransactionServiceGroup() {
    java.lang.Object ref = transactionServiceGroup_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transactionServiceGroup_ = s;
      return s;
    }
  }
  /**
   * <code>string transactionServiceGroup = 4;</code>
   */
  public com.google.protobuf.ByteString
      getTransactionServiceGroupBytes() {
    java.lang.Object ref = transactionServiceGroup_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transactionServiceGroup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTRADATA_FIELD_NUMBER = 5;
  private volatile java.lang.Object extraData_;
  /**
   * <code>string extraData = 5;</code>
   */
  public java.lang.String getExtraData() {
    java.lang.Object ref = extraData_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extraData_ = s;
      return s;
    }
  }
  /**
   * <code>string extraData = 5;</code>
   */
  public com.google.protobuf.ByteString
      getExtraDataBytes() {
    java.lang.Object ref = extraData_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      extraData_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (abstractMessage_ != null) {
      output.writeMessage(1, getAbstractMessage());
    }
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (!getApplicationIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, applicationId_);
    }
    if (!getTransactionServiceGroupBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, transactionServiceGroup_);
    }
    if (!getExtraDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, extraData_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abstractMessage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAbstractMessage());
    }
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (!getApplicationIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, applicationId_);
    }
    if (!getTransactionServiceGroupBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, transactionServiceGroup_);
    }
    if (!getExtraDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, extraData_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto)) {
      return super.equals(obj);
    }
    io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto other = (io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto) obj;

    boolean result = true;
    result = result && (hasAbstractMessage() == other.hasAbstractMessage());
    if (hasAbstractMessage()) {
      result = result && getAbstractMessage()
          .equals(other.getAbstractMessage());
    }
    result = result && getVersion()
        .equals(other.getVersion());
    result = result && getApplicationId()
        .equals(other.getApplicationId());
    result = result && getTransactionServiceGroup()
        .equals(other.getTransactionServiceGroup());
    result = result && getExtraData()
        .equals(other.getExtraData());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAbstractMessage()) {
      hash = (37 * hash) + ABSTRACTMESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getAbstractMessage().hashCode();
    }
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + APPLICATIONID_FIELD_NUMBER;
    hash = (53 * hash) + getApplicationId().hashCode();
    hash = (37 * hash) + TRANSACTIONSERVICEGROUP_FIELD_NUMBER;
    hash = (53 * hash) + getTransactionServiceGroup().hashCode();
    hash = (37 * hash) + EXTRADATA_FIELD_NUMBER;
    hash = (53 * hash) + getExtraData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * PublishRequest is a publish request.
   * </pre>
   *
   * Protobuf type {@code io.seata.protocol.protobuf.AbstractIdentifyRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.seata.protocol.protobuf.AbstractIdentifyRequestProto)
      io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.seata.serializer.protobuf.generated.AbstractIdentifyRequest.internal_static_io_seata_protocol_protobuf_AbstractIdentifyRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.seata.serializer.protobuf.generated.AbstractIdentifyRequest.internal_static_io_seata_protocol_protobuf_AbstractIdentifyRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.class, io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.Builder.class);
    }

    // Construct using io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (abstractMessageBuilder_ == null) {
        abstractMessage_ = null;
      } else {
        abstractMessage_ = null;
        abstractMessageBuilder_ = null;
      }
      version_ = "";

      applicationId_ = "";

      transactionServiceGroup_ = "";

      extraData_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.seata.serializer.protobuf.generated.AbstractIdentifyRequest.internal_static_io_seata_protocol_protobuf_AbstractIdentifyRequestProto_descriptor;
    }

    public io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto getDefaultInstanceForType() {
      return io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.getDefaultInstance();
    }

    public io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto build() {
      io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto buildPartial() {
      io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto result = new io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto(this);
      if (abstractMessageBuilder_ == null) {
        result.abstractMessage_ = abstractMessage_;
      } else {
        result.abstractMessage_ = abstractMessageBuilder_.build();
      }
      result.version_ = version_;
      result.applicationId_ = applicationId_;
      result.transactionServiceGroup_ = transactionServiceGroup_;
      result.extraData_ = extraData_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto) {
        return mergeFrom((io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto other) {
      if (other == io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.getDefaultInstance()) return this;
      if (other.hasAbstractMessage()) {
        mergeAbstractMessage(other.getAbstractMessage());
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (!other.getApplicationId().isEmpty()) {
        applicationId_ = other.applicationId_;
        onChanged();
      }
      if (!other.getTransactionServiceGroup().isEmpty()) {
        transactionServiceGroup_ = other.transactionServiceGroup_;
        onChanged();
      }
      if (!other.getExtraData().isEmpty()) {
        extraData_ = other.extraData_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.seata.serializer.protobuf.generated.AbstractMessageProto abstractMessage_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.seata.serializer.protobuf.generated.AbstractMessageProto, io.seata.serializer.protobuf.generated.AbstractMessageProto.Builder, io.seata.serializer.protobuf.generated.AbstractMessageProtoOrBuilder> abstractMessageBuilder_;
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public boolean hasAbstractMessage() {
      return abstractMessageBuilder_ != null || abstractMessage_ != null;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public io.seata.serializer.protobuf.generated.AbstractMessageProto getAbstractMessage() {
      if (abstractMessageBuilder_ == null) {
        return abstractMessage_ == null ? io.seata.serializer.protobuf.generated.AbstractMessageProto.getDefaultInstance() : abstractMessage_;
      } else {
        return abstractMessageBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public Builder setAbstractMessage(io.seata.serializer.protobuf.generated.AbstractMessageProto value) {
      if (abstractMessageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abstractMessage_ = value;
        onChanged();
      } else {
        abstractMessageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public Builder setAbstractMessage(
        io.seata.serializer.protobuf.generated.AbstractMessageProto.Builder builderForValue) {
      if (abstractMessageBuilder_ == null) {
        abstractMessage_ = builderForValue.build();
        onChanged();
      } else {
        abstractMessageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public Builder mergeAbstractMessage(io.seata.serializer.protobuf.generated.AbstractMessageProto value) {
      if (abstractMessageBuilder_ == null) {
        if (abstractMessage_ != null) {
          abstractMessage_ =
            io.seata.serializer.protobuf.generated.AbstractMessageProto.newBuilder(abstractMessage_).mergeFrom(value).buildPartial();
        } else {
          abstractMessage_ = value;
        }
        onChanged();
      } else {
        abstractMessageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public Builder clearAbstractMessage() {
      if (abstractMessageBuilder_ == null) {
        abstractMessage_ = null;
        onChanged();
      } else {
        abstractMessage_ = null;
        abstractMessageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public io.seata.serializer.protobuf.generated.AbstractMessageProto.Builder getAbstractMessageBuilder() {
      
      onChanged();
      return getAbstractMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    public io.seata.serializer.protobuf.generated.AbstractMessageProtoOrBuilder getAbstractMessageOrBuilder() {
      if (abstractMessageBuilder_ != null) {
        return abstractMessageBuilder_.getMessageOrBuilder();
      } else {
        return abstractMessage_ == null ?
            io.seata.serializer.protobuf.generated.AbstractMessageProto.getDefaultInstance() : abstractMessage_;
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractMessageProto abstractMessage = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.seata.serializer.protobuf.generated.AbstractMessageProto, io.seata.serializer.protobuf.generated.AbstractMessageProto.Builder, io.seata.serializer.protobuf.generated.AbstractMessageProtoOrBuilder> 
        getAbstractMessageFieldBuilder() {
      if (abstractMessageBuilder_ == null) {
        abstractMessageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.seata.serializer.protobuf.generated.AbstractMessageProto, io.seata.serializer.protobuf.generated.AbstractMessageProto.Builder, io.seata.serializer.protobuf.generated.AbstractMessageProtoOrBuilder>(
                getAbstractMessage(),
                getParentForChildren(),
                isClean());
        abstractMessage_ = null;
      }
      return abstractMessageBuilder_;
    }

    private java.lang.Object version_ = "";
    /**
     * <code>string version = 2;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string version = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string version = 2;</code>
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string version = 2;</code>
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string version = 2;</code>
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object applicationId_ = "";
    /**
     * <code>string applicationId = 3;</code>
     */
    public java.lang.String getApplicationId() {
      java.lang.Object ref = applicationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        applicationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string applicationId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getApplicationIdBytes() {
      java.lang.Object ref = applicationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applicationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string applicationId = 3;</code>
     */
    public Builder setApplicationId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      applicationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string applicationId = 3;</code>
     */
    public Builder clearApplicationId() {
      
      applicationId_ = getDefaultInstance().getApplicationId();
      onChanged();
      return this;
    }
    /**
     * <code>string applicationId = 3;</code>
     */
    public Builder setApplicationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      applicationId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object transactionServiceGroup_ = "";
    /**
     * <code>string transactionServiceGroup = 4;</code>
     */
    public java.lang.String getTransactionServiceGroup() {
      java.lang.Object ref = transactionServiceGroup_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transactionServiceGroup_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string transactionServiceGroup = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTransactionServiceGroupBytes() {
      java.lang.Object ref = transactionServiceGroup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transactionServiceGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string transactionServiceGroup = 4;</code>
     */
    public Builder setTransactionServiceGroup(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      transactionServiceGroup_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string transactionServiceGroup = 4;</code>
     */
    public Builder clearTransactionServiceGroup() {
      
      transactionServiceGroup_ = getDefaultInstance().getTransactionServiceGroup();
      onChanged();
      return this;
    }
    /**
     * <code>string transactionServiceGroup = 4;</code>
     */
    public Builder setTransactionServiceGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      transactionServiceGroup_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object extraData_ = "";
    /**
     * <code>string extraData = 5;</code>
     */
    public java.lang.String getExtraData() {
      java.lang.Object ref = extraData_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extraData_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string extraData = 5;</code>
     */
    public com.google.protobuf.ByteString
        getExtraDataBytes() {
      java.lang.Object ref = extraData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        extraData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string extraData = 5;</code>
     */
    public Builder setExtraData(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      extraData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string extraData = 5;</code>
     */
    public Builder clearExtraData() {
      
      extraData_ = getDefaultInstance().getExtraData();
      onChanged();
      return this;
    }
    /**
     * <code>string extraData = 5;</code>
     */
    public Builder setExtraDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      extraData_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.seata.protocol.protobuf.AbstractIdentifyRequestProto)
  }

  // @@protoc_insertion_point(class_scope:io.seata.protocol.protobuf.AbstractIdentifyRequestProto)
  private static final io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto();
  }

  public static io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AbstractIdentifyRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<AbstractIdentifyRequestProto>() {
    public AbstractIdentifyRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbstractIdentifyRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AbstractIdentifyRequestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AbstractIdentifyRequestProto> getParserForType() {
    return PARSER;
  }

  public io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

