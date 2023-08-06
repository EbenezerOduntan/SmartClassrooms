// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.smartclassrooms.grpc.user;

/**
 * Protobuf type {@code APIResponse}
 */
public  final class APIResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:APIResponse)
    APIResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use APIResponse.newBuilder() to construct.
  private APIResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private APIResponse() {
    responsemessage_ = "";
    responseCode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private APIResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            responsemessage_ = s;
            break;
          }
          case 16: {

            responseCode_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.smartclassrooms.grpc.user.User.internal_static_APIResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.smartclassrooms.grpc.user.User.internal_static_APIResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.smartclassrooms.grpc.user.APIResponse.class, com.smartclassrooms.grpc.user.APIResponse.Builder.class);
  }

  public static final int RESPONSEMESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object responsemessage_;
  /**
   * <code>string responsemessage = 1;</code>
   */
  public java.lang.String getResponsemessage() {
    java.lang.Object ref = responsemessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responsemessage_ = s;
      return s;
    }
  }
  /**
   * <code>string responsemessage = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResponsemessageBytes() {
    java.lang.Object ref = responsemessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      responsemessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESPONSECODE_FIELD_NUMBER = 2;
  private int responseCode_;
  /**
   * <code>int32 responseCode = 2;</code>
   */
  public int getResponseCode() {
    return responseCode_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getResponsemessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, responsemessage_);
    }
    if (responseCode_ != 0) {
      output.writeInt32(2, responseCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResponsemessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, responsemessage_);
    }
    if (responseCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, responseCode_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.smartclassrooms.grpc.user.APIResponse)) {
      return super.equals(obj);
    }
    com.smartclassrooms.grpc.user.APIResponse other = (com.smartclassrooms.grpc.user.APIResponse) obj;

    boolean result = true;
    result = result && getResponsemessage()
        .equals(other.getResponsemessage());
    result = result && (getResponseCode()
        == other.getResponseCode());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESPONSEMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getResponsemessage().hashCode();
    hash = (37 * hash) + RESPONSECODE_FIELD_NUMBER;
    hash = (53 * hash) + getResponseCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.smartclassrooms.grpc.user.APIResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartclassrooms.grpc.user.APIResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartclassrooms.grpc.user.APIResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartclassrooms.grpc.user.APIResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartclassrooms.grpc.user.APIResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smartclassrooms.grpc.user.APIResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smartclassrooms.grpc.user.APIResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smartclassrooms.grpc.user.APIResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smartclassrooms.grpc.user.APIResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.smartclassrooms.grpc.user.APIResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smartclassrooms.grpc.user.APIResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smartclassrooms.grpc.user.APIResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.smartclassrooms.grpc.user.APIResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code APIResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:APIResponse)
      com.smartclassrooms.grpc.user.APIResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.smartclassrooms.grpc.user.User.internal_static_APIResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.smartclassrooms.grpc.user.User.internal_static_APIResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.smartclassrooms.grpc.user.APIResponse.class, com.smartclassrooms.grpc.user.APIResponse.Builder.class);
    }

    // Construct using com.smartclassrooms.grpc.user.APIResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      responsemessage_ = "";

      responseCode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.smartclassrooms.grpc.user.User.internal_static_APIResponse_descriptor;
    }

    @java.lang.Override
    public com.smartclassrooms.grpc.user.APIResponse getDefaultInstanceForType() {
      return com.smartclassrooms.grpc.user.APIResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.smartclassrooms.grpc.user.APIResponse build() {
      com.smartclassrooms.grpc.user.APIResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.smartclassrooms.grpc.user.APIResponse buildPartial() {
      com.smartclassrooms.grpc.user.APIResponse result = new com.smartclassrooms.grpc.user.APIResponse(this);
      result.responsemessage_ = responsemessage_;
      result.responseCode_ = responseCode_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.smartclassrooms.grpc.user.APIResponse) {
        return mergeFrom((com.smartclassrooms.grpc.user.APIResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.smartclassrooms.grpc.user.APIResponse other) {
      if (other == com.smartclassrooms.grpc.user.APIResponse.getDefaultInstance()) return this;
      if (!other.getResponsemessage().isEmpty()) {
        responsemessage_ = other.responsemessage_;
        onChanged();
      }
      if (other.getResponseCode() != 0) {
        setResponseCode(other.getResponseCode());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.smartclassrooms.grpc.user.APIResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.smartclassrooms.grpc.user.APIResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object responsemessage_ = "";
    /**
     * <code>string responsemessage = 1;</code>
     */
    public java.lang.String getResponsemessage() {
      java.lang.Object ref = responsemessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responsemessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string responsemessage = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResponsemessageBytes() {
      java.lang.Object ref = responsemessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responsemessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string responsemessage = 1;</code>
     */
    public Builder setResponsemessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      responsemessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string responsemessage = 1;</code>
     */
    public Builder clearResponsemessage() {
      
      responsemessage_ = getDefaultInstance().getResponsemessage();
      onChanged();
      return this;
    }
    /**
     * <code>string responsemessage = 1;</code>
     */
    public Builder setResponsemessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      responsemessage_ = value;
      onChanged();
      return this;
    }

    private int responseCode_ ;
    /**
     * <code>int32 responseCode = 2;</code>
     */
    public int getResponseCode() {
      return responseCode_;
    }
    /**
     * <code>int32 responseCode = 2;</code>
     */
    public Builder setResponseCode(int value) {
      
      responseCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 responseCode = 2;</code>
     */
    public Builder clearResponseCode() {
      
      responseCode_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:APIResponse)
  }

  // @@protoc_insertion_point(class_scope:APIResponse)
  private static final com.smartclassrooms.grpc.user.APIResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.smartclassrooms.grpc.user.APIResponse();
  }

  public static com.smartclassrooms.grpc.user.APIResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<APIResponse>
      PARSER = new com.google.protobuf.AbstractParser<APIResponse>() {
    @java.lang.Override
    public APIResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new APIResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<APIResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<APIResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.smartclassrooms.grpc.user.APIResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

