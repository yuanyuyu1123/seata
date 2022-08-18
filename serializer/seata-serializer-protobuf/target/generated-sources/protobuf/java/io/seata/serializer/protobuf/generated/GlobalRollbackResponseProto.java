// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalRollbackResponse.proto

package io.seata.serializer.protobuf.generated;

/**
 * Protobuf type {@code io.seata.protocol.protobuf.GlobalRollbackResponseProto}
 */
public  final class GlobalRollbackResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.seata.protocol.protobuf.GlobalRollbackResponseProto)
    GlobalRollbackResponseProtoOrBuilder {
  // Use GlobalRollbackResponseProto.newBuilder() to construct.
  private GlobalRollbackResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GlobalRollbackResponseProto() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GlobalRollbackResponseProto(
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
            io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto.Builder subBuilder = null;
            if (abstractGlobalEndResponse_ != null) {
              subBuilder = abstractGlobalEndResponse_.toBuilder();
            }
            abstractGlobalEndResponse_ = input.readMessage(io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abstractGlobalEndResponse_);
              abstractGlobalEndResponse_ = subBuilder.buildPartial();
            }

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
    return io.seata.serializer.protobuf.generated.GlobalRollbackResponse.internal_static_io_seata_protocol_protobuf_GlobalRollbackResponseProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.seata.serializer.protobuf.generated.GlobalRollbackResponse.internal_static_io_seata_protocol_protobuf_GlobalRollbackResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto.class, io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto.Builder.class);
  }

  public static final int ABSTRACTGLOBALENDRESPONSE_FIELD_NUMBER = 1;
  private io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto abstractGlobalEndResponse_;
  /**
   * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
   */
  public boolean hasAbstractGlobalEndResponse() {
    return abstractGlobalEndResponse_ != null;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
   */
  public io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto getAbstractGlobalEndResponse() {
    return abstractGlobalEndResponse_ == null ? io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto.getDefaultInstance() : abstractGlobalEndResponse_;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
   */
  public io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProtoOrBuilder getAbstractGlobalEndResponseOrBuilder() {
    return getAbstractGlobalEndResponse();
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
    if (abstractGlobalEndResponse_ != null) {
      output.writeMessage(1, getAbstractGlobalEndResponse());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abstractGlobalEndResponse_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAbstractGlobalEndResponse());
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
    if (!(obj instanceof io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto)) {
      return super.equals(obj);
    }
    io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto other = (io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto) obj;

    boolean result = true;
    result = result && (hasAbstractGlobalEndResponse() == other.hasAbstractGlobalEndResponse());
    if (hasAbstractGlobalEndResponse()) {
      result = result && getAbstractGlobalEndResponse()
          .equals(other.getAbstractGlobalEndResponse());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAbstractGlobalEndResponse()) {
      hash = (37 * hash) + ABSTRACTGLOBALENDRESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getAbstractGlobalEndResponse().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parseFrom(
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
  public static Builder newBuilder(io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto prototype) {
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
   * Protobuf type {@code io.seata.protocol.protobuf.GlobalRollbackResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.seata.protocol.protobuf.GlobalRollbackResponseProto)
      io.seata.serializer.protobuf.generated.GlobalRollbackResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.seata.serializer.protobuf.generated.GlobalRollbackResponse.internal_static_io_seata_protocol_protobuf_GlobalRollbackResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.seata.serializer.protobuf.generated.GlobalRollbackResponse.internal_static_io_seata_protocol_protobuf_GlobalRollbackResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto.class, io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto.Builder.class);
    }

    // Construct using io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto.newBuilder()
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
      if (abstractGlobalEndResponseBuilder_ == null) {
        abstractGlobalEndResponse_ = null;
      } else {
        abstractGlobalEndResponse_ = null;
        abstractGlobalEndResponseBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.seata.serializer.protobuf.generated.GlobalRollbackResponse.internal_static_io_seata_protocol_protobuf_GlobalRollbackResponseProto_descriptor;
    }

    public io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto getDefaultInstanceForType() {
      return io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto.getDefaultInstance();
    }

    public io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto build() {
      io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto buildPartial() {
      io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto result = new io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto(this);
      if (abstractGlobalEndResponseBuilder_ == null) {
        result.abstractGlobalEndResponse_ = abstractGlobalEndResponse_;
      } else {
        result.abstractGlobalEndResponse_ = abstractGlobalEndResponseBuilder_.build();
      }
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
      if (other instanceof io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto) {
        return mergeFrom((io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto other) {
      if (other == io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto.getDefaultInstance()) return this;
      if (other.hasAbstractGlobalEndResponse()) {
        mergeAbstractGlobalEndResponse(other.getAbstractGlobalEndResponse());
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
      io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto abstractGlobalEndResponse_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto, io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto.Builder, io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProtoOrBuilder> abstractGlobalEndResponseBuilder_;
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public boolean hasAbstractGlobalEndResponse() {
      return abstractGlobalEndResponseBuilder_ != null || abstractGlobalEndResponse_ != null;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto getAbstractGlobalEndResponse() {
      if (abstractGlobalEndResponseBuilder_ == null) {
        return abstractGlobalEndResponse_ == null ? io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto.getDefaultInstance() : abstractGlobalEndResponse_;
      } else {
        return abstractGlobalEndResponseBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public Builder setAbstractGlobalEndResponse(io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto value) {
      if (abstractGlobalEndResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abstractGlobalEndResponse_ = value;
        onChanged();
      } else {
        abstractGlobalEndResponseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public Builder setAbstractGlobalEndResponse(
        io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto.Builder builderForValue) {
      if (abstractGlobalEndResponseBuilder_ == null) {
        abstractGlobalEndResponse_ = builderForValue.build();
        onChanged();
      } else {
        abstractGlobalEndResponseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public Builder mergeAbstractGlobalEndResponse(io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto value) {
      if (abstractGlobalEndResponseBuilder_ == null) {
        if (abstractGlobalEndResponse_ != null) {
          abstractGlobalEndResponse_ =
            io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto.newBuilder(abstractGlobalEndResponse_).mergeFrom(value).buildPartial();
        } else {
          abstractGlobalEndResponse_ = value;
        }
        onChanged();
      } else {
        abstractGlobalEndResponseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public Builder clearAbstractGlobalEndResponse() {
      if (abstractGlobalEndResponseBuilder_ == null) {
        abstractGlobalEndResponse_ = null;
        onChanged();
      } else {
        abstractGlobalEndResponse_ = null;
        abstractGlobalEndResponseBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto.Builder getAbstractGlobalEndResponseBuilder() {
      
      onChanged();
      return getAbstractGlobalEndResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    public io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProtoOrBuilder getAbstractGlobalEndResponseOrBuilder() {
      if (abstractGlobalEndResponseBuilder_ != null) {
        return abstractGlobalEndResponseBuilder_.getMessageOrBuilder();
      } else {
        return abstractGlobalEndResponse_ == null ?
            io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto.getDefaultInstance() : abstractGlobalEndResponse_;
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractGlobalEndResponseProto abstractGlobalEndResponse = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto, io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto.Builder, io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProtoOrBuilder> 
        getAbstractGlobalEndResponseFieldBuilder() {
      if (abstractGlobalEndResponseBuilder_ == null) {
        abstractGlobalEndResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto, io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProto.Builder, io.seata.serializer.protobuf.generated.AbstractGlobalEndResponseProtoOrBuilder>(
                getAbstractGlobalEndResponse(),
                getParentForChildren(),
                isClean());
        abstractGlobalEndResponse_ = null;
      }
      return abstractGlobalEndResponseBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.seata.protocol.protobuf.GlobalRollbackResponseProto)
  }

  // @@protoc_insertion_point(class_scope:io.seata.protocol.protobuf.GlobalRollbackResponseProto)
  private static final io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto();
  }

  public static io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GlobalRollbackResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<GlobalRollbackResponseProto>() {
    public GlobalRollbackResponseProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GlobalRollbackResponseProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GlobalRollbackResponseProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GlobalRollbackResponseProto> getParserForType() {
    return PARSER;
  }

  public io.seata.serializer.protobuf.generated.GlobalRollbackResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

