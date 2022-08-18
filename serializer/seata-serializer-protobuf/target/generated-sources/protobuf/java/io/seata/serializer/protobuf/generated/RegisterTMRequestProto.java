// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registerTMRequest.proto

package io.seata.serializer.protobuf.generated;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf type {@code io.seata.protocol.protobuf.RegisterTMRequestProto}
 */
public  final class RegisterTMRequestProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.seata.protocol.protobuf.RegisterTMRequestProto)
    RegisterTMRequestProtoOrBuilder {
  // Use RegisterTMRequestProto.newBuilder() to construct.
  private RegisterTMRequestProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterTMRequestProto() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RegisterTMRequestProto(
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
            io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.Builder subBuilder = null;
            if (abstractIdentifyRequest_ != null) {
              subBuilder = abstractIdentifyRequest_.toBuilder();
            }
            abstractIdentifyRequest_ = input.readMessage(io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(abstractIdentifyRequest_);
              abstractIdentifyRequest_ = subBuilder.buildPartial();
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
    return io.seata.serializer.protobuf.generated.RegisterTMRequest.internal_static_io_seata_protocol_protobuf_RegisterTMRequestProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.seata.serializer.protobuf.generated.RegisterTMRequest.internal_static_io_seata_protocol_protobuf_RegisterTMRequestProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.seata.serializer.protobuf.generated.RegisterTMRequestProto.class, io.seata.serializer.protobuf.generated.RegisterTMRequestProto.Builder.class);
  }

  public static final int ABSTRACTIDENTIFYREQUEST_FIELD_NUMBER = 1;
  private io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto abstractIdentifyRequest_;
  /**
   * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
   */
  public boolean hasAbstractIdentifyRequest() {
    return abstractIdentifyRequest_ != null;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
   */
  public io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto getAbstractIdentifyRequest() {
    return abstractIdentifyRequest_ == null ? io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.getDefaultInstance() : abstractIdentifyRequest_;
  }
  /**
   * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
   */
  public io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProtoOrBuilder getAbstractIdentifyRequestOrBuilder() {
    return getAbstractIdentifyRequest();
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
    if (abstractIdentifyRequest_ != null) {
      output.writeMessage(1, getAbstractIdentifyRequest());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (abstractIdentifyRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAbstractIdentifyRequest());
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
    if (!(obj instanceof io.seata.serializer.protobuf.generated.RegisterTMRequestProto)) {
      return super.equals(obj);
    }
    io.seata.serializer.protobuf.generated.RegisterTMRequestProto other = (io.seata.serializer.protobuf.generated.RegisterTMRequestProto) obj;

    boolean result = true;
    result = result && (hasAbstractIdentifyRequest() == other.hasAbstractIdentifyRequest());
    if (hasAbstractIdentifyRequest()) {
      result = result && getAbstractIdentifyRequest()
          .equals(other.getAbstractIdentifyRequest());
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
    if (hasAbstractIdentifyRequest()) {
      hash = (37 * hash) + ABSTRACTIDENTIFYREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getAbstractIdentifyRequest().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto parseFrom(
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
  public static Builder newBuilder(io.seata.serializer.protobuf.generated.RegisterTMRequestProto prototype) {
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
   * Protobuf type {@code io.seata.protocol.protobuf.RegisterTMRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.seata.protocol.protobuf.RegisterTMRequestProto)
      io.seata.serializer.protobuf.generated.RegisterTMRequestProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.seata.serializer.protobuf.generated.RegisterTMRequest.internal_static_io_seata_protocol_protobuf_RegisterTMRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.seata.serializer.protobuf.generated.RegisterTMRequest.internal_static_io_seata_protocol_protobuf_RegisterTMRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.seata.serializer.protobuf.generated.RegisterTMRequestProto.class, io.seata.serializer.protobuf.generated.RegisterTMRequestProto.Builder.class);
    }

    // Construct using io.seata.serializer.protobuf.generated.RegisterTMRequestProto.newBuilder()
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
      if (abstractIdentifyRequestBuilder_ == null) {
        abstractIdentifyRequest_ = null;
      } else {
        abstractIdentifyRequest_ = null;
        abstractIdentifyRequestBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.seata.serializer.protobuf.generated.RegisterTMRequest.internal_static_io_seata_protocol_protobuf_RegisterTMRequestProto_descriptor;
    }

    public io.seata.serializer.protobuf.generated.RegisterTMRequestProto getDefaultInstanceForType() {
      return io.seata.serializer.protobuf.generated.RegisterTMRequestProto.getDefaultInstance();
    }

    public io.seata.serializer.protobuf.generated.RegisterTMRequestProto build() {
      io.seata.serializer.protobuf.generated.RegisterTMRequestProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.seata.serializer.protobuf.generated.RegisterTMRequestProto buildPartial() {
      io.seata.serializer.protobuf.generated.RegisterTMRequestProto result = new io.seata.serializer.protobuf.generated.RegisterTMRequestProto(this);
      if (abstractIdentifyRequestBuilder_ == null) {
        result.abstractIdentifyRequest_ = abstractIdentifyRequest_;
      } else {
        result.abstractIdentifyRequest_ = abstractIdentifyRequestBuilder_.build();
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
      if (other instanceof io.seata.serializer.protobuf.generated.RegisterTMRequestProto) {
        return mergeFrom((io.seata.serializer.protobuf.generated.RegisterTMRequestProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.seata.serializer.protobuf.generated.RegisterTMRequestProto other) {
      if (other == io.seata.serializer.protobuf.generated.RegisterTMRequestProto.getDefaultInstance()) return this;
      if (other.hasAbstractIdentifyRequest()) {
        mergeAbstractIdentifyRequest(other.getAbstractIdentifyRequest());
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
      io.seata.serializer.protobuf.generated.RegisterTMRequestProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.seata.serializer.protobuf.generated.RegisterTMRequestProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto abstractIdentifyRequest_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto, io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.Builder, io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProtoOrBuilder> abstractIdentifyRequestBuilder_;
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
     */
    public boolean hasAbstractIdentifyRequest() {
      return abstractIdentifyRequestBuilder_ != null || abstractIdentifyRequest_ != null;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
     */
    public io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto getAbstractIdentifyRequest() {
      if (abstractIdentifyRequestBuilder_ == null) {
        return abstractIdentifyRequest_ == null ? io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.getDefaultInstance() : abstractIdentifyRequest_;
      } else {
        return abstractIdentifyRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
     */
    public Builder setAbstractIdentifyRequest(io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto value) {
      if (abstractIdentifyRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        abstractIdentifyRequest_ = value;
        onChanged();
      } else {
        abstractIdentifyRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
     */
    public Builder setAbstractIdentifyRequest(
        io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.Builder builderForValue) {
      if (abstractIdentifyRequestBuilder_ == null) {
        abstractIdentifyRequest_ = builderForValue.build();
        onChanged();
      } else {
        abstractIdentifyRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
     */
    public Builder mergeAbstractIdentifyRequest(io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto value) {
      if (abstractIdentifyRequestBuilder_ == null) {
        if (abstractIdentifyRequest_ != null) {
          abstractIdentifyRequest_ =
            io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.newBuilder(abstractIdentifyRequest_).mergeFrom(value).buildPartial();
        } else {
          abstractIdentifyRequest_ = value;
        }
        onChanged();
      } else {
        abstractIdentifyRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
     */
    public Builder clearAbstractIdentifyRequest() {
      if (abstractIdentifyRequestBuilder_ == null) {
        abstractIdentifyRequest_ = null;
        onChanged();
      } else {
        abstractIdentifyRequest_ = null;
        abstractIdentifyRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
     */
    public io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.Builder getAbstractIdentifyRequestBuilder() {
      
      onChanged();
      return getAbstractIdentifyRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
     */
    public io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProtoOrBuilder getAbstractIdentifyRequestOrBuilder() {
      if (abstractIdentifyRequestBuilder_ != null) {
        return abstractIdentifyRequestBuilder_.getMessageOrBuilder();
      } else {
        return abstractIdentifyRequest_ == null ?
            io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.getDefaultInstance() : abstractIdentifyRequest_;
      }
    }
    /**
     * <code>.io.seata.protocol.protobuf.AbstractIdentifyRequestProto abstractIdentifyRequest = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto, io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.Builder, io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProtoOrBuilder> 
        getAbstractIdentifyRequestFieldBuilder() {
      if (abstractIdentifyRequestBuilder_ == null) {
        abstractIdentifyRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto, io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProto.Builder, io.seata.serializer.protobuf.generated.AbstractIdentifyRequestProtoOrBuilder>(
                getAbstractIdentifyRequest(),
                getParentForChildren(),
                isClean());
        abstractIdentifyRequest_ = null;
      }
      return abstractIdentifyRequestBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.seata.protocol.protobuf.RegisterTMRequestProto)
  }

  // @@protoc_insertion_point(class_scope:io.seata.protocol.protobuf.RegisterTMRequestProto)
  private static final io.seata.serializer.protobuf.generated.RegisterTMRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.seata.serializer.protobuf.generated.RegisterTMRequestProto();
  }

  public static io.seata.serializer.protobuf.generated.RegisterTMRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterTMRequestProto>
      PARSER = new com.google.protobuf.AbstractParser<RegisterTMRequestProto>() {
    public RegisterTMRequestProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegisterTMRequestProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterTMRequestProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterTMRequestProto> getParserForType() {
    return PARSER;
  }

  public io.seata.serializer.protobuf.generated.RegisterTMRequestProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

