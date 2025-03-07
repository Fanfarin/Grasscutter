// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomePlantFieldNotify.proto

package emu.grasscutter.net.proto;

public final class HomePlantFieldNotifyOuterClass {
  private HomePlantFieldNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomePlantFieldNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomePlantFieldNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomePlantFieldData field = 5;</code>
     * @return Whether the field field is set.
     */
    boolean hasField();
    /**
     * <code>.HomePlantFieldData field = 5;</code>
     * @return The field.
     */
    emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData getField();
    /**
     * <code>.HomePlantFieldData field = 5;</code>
     */
    emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder getFieldOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 5595
   * Obf: BKLCBHHMEOM
   * </pre>
   *
   * Protobuf type {@code HomePlantFieldNotify}
   */
  public static final class HomePlantFieldNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomePlantFieldNotify)
      HomePlantFieldNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomePlantFieldNotify.newBuilder() to construct.
    private HomePlantFieldNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomePlantFieldNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomePlantFieldNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomePlantFieldNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 42: {
              emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder subBuilder = null;
              if (field_ != null) {
                subBuilder = field_.toBuilder();
              }
              field_ = input.readMessage(emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(field_);
                field_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.internal_static_HomePlantFieldNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.internal_static_HomePlantFieldNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify.class, emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify.Builder.class);
    }

    public static final int FIELD_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData field_;
    /**
     * <code>.HomePlantFieldData field = 5;</code>
     * @return Whether the field field is set.
     */
    @java.lang.Override
    public boolean hasField() {
      return field_ != null;
    }
    /**
     * <code>.HomePlantFieldData field = 5;</code>
     * @return The field.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData getField() {
      return field_ == null ? emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.getDefaultInstance() : field_;
    }
    /**
     * <code>.HomePlantFieldData field = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder getFieldOrBuilder() {
      return getField();
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
      if (field_ != null) {
        output.writeMessage(5, getField());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (field_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getField());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify other = (emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify) obj;

      if (hasField() != other.hasField()) return false;
      if (hasField()) {
        if (!getField()
            .equals(other.getField())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasField()) {
        hash = (37 * hash) + FIELD_FIELD_NUMBER;
        hash = (53 * hash) + getField().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify prototype) {
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
     * <pre>
     * CmdId: 5595
     * Obf: BKLCBHHMEOM
     * </pre>
     *
     * Protobuf type {@code HomePlantFieldNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomePlantFieldNotify)
        emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.internal_static_HomePlantFieldNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.internal_static_HomePlantFieldNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify.class, emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify.newBuilder()
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
        if (fieldBuilder_ == null) {
          field_ = null;
        } else {
          field_ = null;
          fieldBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.internal_static_HomePlantFieldNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify build() {
        emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify buildPartial() {
        emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify result = new emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify(this);
        if (fieldBuilder_ == null) {
          result.field_ = field_;
        } else {
          result.field_ = fieldBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify other) {
        if (other == emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify.getDefaultInstance()) return this;
        if (other.hasField()) {
          mergeField(other.getField());
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
        emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData field_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> fieldBuilder_;
      /**
       * <code>.HomePlantFieldData field = 5;</code>
       * @return Whether the field field is set.
       */
      public boolean hasField() {
        return fieldBuilder_ != null || field_ != null;
      }
      /**
       * <code>.HomePlantFieldData field = 5;</code>
       * @return The field.
       */
      public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData getField() {
        if (fieldBuilder_ == null) {
          return field_ == null ? emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.getDefaultInstance() : field_;
        } else {
          return fieldBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomePlantFieldData field = 5;</code>
       */
      public Builder setField(emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData value) {
        if (fieldBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          field_ = value;
          onChanged();
        } else {
          fieldBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomePlantFieldData field = 5;</code>
       */
      public Builder setField(
          emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder builderForValue) {
        if (fieldBuilder_ == null) {
          field_ = builderForValue.build();
          onChanged();
        } else {
          fieldBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomePlantFieldData field = 5;</code>
       */
      public Builder mergeField(emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData value) {
        if (fieldBuilder_ == null) {
          if (field_ != null) {
            field_ =
              emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.newBuilder(field_).mergeFrom(value).buildPartial();
          } else {
            field_ = value;
          }
          onChanged();
        } else {
          fieldBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomePlantFieldData field = 5;</code>
       */
      public Builder clearField() {
        if (fieldBuilder_ == null) {
          field_ = null;
          onChanged();
        } else {
          field_ = null;
          fieldBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomePlantFieldData field = 5;</code>
       */
      public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder getFieldBuilder() {
        
        onChanged();
        return getFieldFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomePlantFieldData field = 5;</code>
       */
      public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder getFieldOrBuilder() {
        if (fieldBuilder_ != null) {
          return fieldBuilder_.getMessageOrBuilder();
        } else {
          return field_ == null ?
              emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.getDefaultInstance() : field_;
        }
      }
      /**
       * <code>.HomePlantFieldData field = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> 
          getFieldFieldBuilder() {
        if (fieldBuilder_ == null) {
          fieldBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder>(
                  getField(),
                  getParentForChildren(),
                  isClean());
          field_ = null;
        }
        return fieldBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HomePlantFieldNotify)
    }

    // @@protoc_insertion_point(class_scope:HomePlantFieldNotify)
    private static final emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify();
    }

    public static emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomePlantFieldNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomePlantFieldNotify>() {
      @java.lang.Override
      public HomePlantFieldNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomePlantFieldNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomePlantFieldNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomePlantFieldNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomePlantFieldNotifyOuterClass.HomePlantFieldNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomePlantFieldNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomePlantFieldNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032HomePlantFieldNotify.proto\032\030HomePlantF" +
      "ieldData.proto\":\n\024HomePlantFieldNotify\022\"" +
      "\n\005field\030\005 \001(\0132\023.HomePlantFieldDataB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.getDescriptor(),
        });
    internal_static_HomePlantFieldNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomePlantFieldNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomePlantFieldNotify_descriptor,
        new java.lang.String[] { "Field", });
    emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
