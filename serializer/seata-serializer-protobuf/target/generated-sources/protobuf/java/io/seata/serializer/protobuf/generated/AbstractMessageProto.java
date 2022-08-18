// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractMessage.proto

package io.seata.serializer.protobuf.generated;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf type {@code io.seata.protocol.protobuf.AbstractMessageProto}
 */
public  final class AbstractMessageProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.seata.protocol.protobuf.AbstractMessageProto)
    AbstractMessageProtoOrBuilder {
  // Use AbstractMessageProto.newBuilder() to construct.
  private AbstractMessageProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AbstractMessageProto() {
    messageType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AbstractMessageProto(
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
          case 8: {
            int rawValue = input.readEnum();

            messageType_ = rawValue;
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
    return io.seata.serializer.protobuf.generated.AbstractMessage.internal_static_io_seata_protocol_protobuf_AbstractMessageProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.seata.serializer.protobuf.generated.AbstractMessage.internal_static_io_seata_protocol_protobuf_AbstractMessageProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.seata.serializer.protobuf.generated.AbstractMessageProto.class, io.seata.serializer.protobuf.generated.AbstractMessageProto.Builder.class);
  }

  public static final int MESSAGETYPE_FIELD_NUMBER = 1;
  private int messageType_;
  /**
   * <code>.io.seata.protocol.protobuf.MessageTypeProto messageType = 1;</code>
   */
  public int getMessageTypeValue() {
    return messageType_;
  }
  /**
   * <code>.io.seata.protocol.protobuf.MessageTypeProto messageType = 1;</code>
   */
  public io.seata.serializer.protobuf.generated.MessageTypeProto getMessageType() {
    io.seata.serializer.protobuf.generated.MessageTypeProto result = io.seata.serializer.protobuf.generated.MessageTypeProto.valueOf(messageType_);
    return result == null ? io.seata.serializer.protobuf.generated.MessageTypeProto.UNRECOGNIZED : result;
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
    if (messageType_ != io.seata.serializer.protobuf.generated.MessageTypeProto.TYPE_GLOBAL_PRESERVED.getNumber()) {
      output.writeEnum(1, messageType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageType_ != io.seata.serializer.protobuf.generated.MessageTypeProto.TYPE_GLOBAL_PRESERVED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, messageType_);
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
    if (!(obj instanceof io.seata.serializer.protobuf.generated.AbstractMessageProto)) {
      return super.equals(obj);
    }
    io.seata.serializer.protobuf.generated.AbstractMessageProto other = (io.seata.serializer.protobuf.generated.AbstractMessageProto) obj;

    boolean result = true;
    result = result && messageType_ == other.messageType_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGETYPE_FIELD_NUMBER;
    hash = (53 * hash) + messageType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.seata.serializer.protobuf.generated.AbstractMessageProto parseFrom(
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
  public static Builder newBuilder(io.seata.serializer.protobuf.generated.AbstractMessageProto prototype) {
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
   * Protobuf type {@code io.seata.protocol.protobuf.AbstractMessageProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.seata.protocol.protobuf.AbstractMessageProto)
      io.seata.serializer.protobuf.generated.AbstractMessageProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.seata.serializer.protobuf.generated.AbstractMessage.internal_static_io_seata_protocol_protobuf_AbstractMessageProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.seata.serializer.protobuf.generated.AbstractMessage.internal_static_io_seata_protocol_protobuf_AbstractMessageProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.seata.serializer.protobuf.generated.AbstractMessageProto.class, io.seata.serializer.protobuf.generated.AbstractMessageProto.Builder.class);
    }

    // Construct using io.seata.serializer.protobuf.generated.AbstractMessageProto.newBuilder()
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
      messageType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.seata.serializer.protobuf.generated.AbstractMessage.internal_static_io_seata_protocol_protobuf_AbstractMessageProto_descriptor;
    }

    public io.seata.serializer.protobuf.generated.AbstractMessageProto getDefaultInstanceForType() {
      return io.seata.serializer.protobuf.generated.AbstractMessageProto.getDefaultInstance();
    }

    public io.seata.serializer.protobuf.generated.AbstractMessageProto build() {
      io.seata.serializer.protobuf.generated.AbstractMessageProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.seata.serializer.protobuf.generated.AbstractMessageProto buildPartial() {
      io.seata.serializer.protobuf.generated.AbstractMessageProto result = new io.seata.serializer.protobuf.generated.AbstractMessageProto(this);
      result.messageType_ = messageType_;
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
      if (other instanceof io.seata.serializer.protobuf.generated.AbstractMessageProto) {
        return mergeFrom((io.seata.serializer.protobuf.generated.AbstractMessageProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.seata.serializer.protobuf.generated.AbstractMessageProto other) {
      if (other == io.seata.serializer.protobuf.generated.AbstractMessageProto.getDefaultInstance()) return this;
      if (other.messageType_ != 0) {
        setMessageTypeValue(other.getMessageTypeValue());
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
      io.seata.serializer.protobuf.generated.AbstractMessageProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.seata.serializer.protobuf.generated.AbstractMessageProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int messageType_ = 0;
    /**
     * <code>.io.seata.protocol.protobuf.MessageTypeProto messageType = 1;</code>
     */
    public int getMessageTypeValue() {
      return messageType_;
    }
    /**
     * <code>.io.seata.protocol.protobuf.MessageTypeProto messageType = 1;</code>
     */
    public Builder setMessageTypeValue(int value) {
      messageType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.MessageTypeProto messageType = 1;</code>
     */
    public io.seata.serializer.protobuf.generated.MessageTypeProto getMessageType() {
      io.seata.serializer.protobuf.generated.MessageTypeProto result = io.seata.serializer.protobuf.generated.MessageTypeProto.valueOf(messageType_);
      return result == null ? io.seata.serializer.protobuf.generated.MessageTypeProto.UNRECOGNIZED : result;
    }
    /**
     * <code>.io.seata.protocol.protobuf.MessageTypeProto messageType = 1;</code>
     */
    public Builder setMessageType(io.seata.serializer.protobuf.generated.MessageTypeProto value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      messageType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.io.seata.protocol.protobuf.MessageTypeProto messageType = 1;</code>
     */
    public Builder clearMessageType() {
      
      messageType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:io.seata.protocol.protobuf.AbstractMessageProto)
  }

  // @@protoc_insertion_point(class_scope:io.seata.protocol.protobuf.AbstractMessageProto)
  private static final io.seata.serializer.protobuf.generated.AbstractMessageProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.seata.serializer.protobuf.generated.AbstractMessageProto();
  }

  public static io.seata.serializer.protobuf.generated.AbstractMessageProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AbstractMessageProto>
      PARSER = new com.google.protobuf.AbstractParser<AbstractMessageProto>() {
    public AbstractMessageProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbstractMessageProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AbstractMessageProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AbstractMessageProto> getParserForType() {
    return PARSER;
  }

  public io.seata.serializer.protobuf.generated.AbstractMessageProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

