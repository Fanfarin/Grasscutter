// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketStoreUnlockSlotReq.proto

package emu.grasscutter.net.proto;

public final class VintageMarketStoreUnlockSlotReqOuterClass {
  private VintageMarketStoreUnlockSlotReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketStoreUnlockSlotReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketStoreUnlockSlotReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 store_id = 13;</code>
     * @return The storeId.
     */
    int getStoreId();
  }
  /**
   * <pre>
   * CmdId: 7473
   * Obf: HBODEEHHNIJ
   * </pre>
   *
   * Protobuf type {@code VintageMarketStoreUnlockSlotReq}
   */
  public static final class VintageMarketStoreUnlockSlotReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketStoreUnlockSlotReq)
      VintageMarketStoreUnlockSlotReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketStoreUnlockSlotReq.newBuilder() to construct.
    private VintageMarketStoreUnlockSlotReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketStoreUnlockSlotReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketStoreUnlockSlotReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageMarketStoreUnlockSlotReq(
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
            case 104: {

              storeId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.internal_static_VintageMarketStoreUnlockSlotReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.internal_static_VintageMarketStoreUnlockSlotReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq.class, emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq.Builder.class);
    }

    public static final int STORE_ID_FIELD_NUMBER = 13;
    private int storeId_;
    /**
     * <code>uint32 store_id = 13;</code>
     * @return The storeId.
     */
    @java.lang.Override
    public int getStoreId() {
      return storeId_;
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
      if (storeId_ != 0) {
        output.writeUInt32(13, storeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (storeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, storeId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq other = (emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq) obj;

      if (getStoreId()
          != other.getStoreId()) return false;
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
      hash = (37 * hash) + STORE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStoreId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq prototype) {
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
     * CmdId: 7473
     * Obf: HBODEEHHNIJ
     * </pre>
     *
     * Protobuf type {@code VintageMarketStoreUnlockSlotReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketStoreUnlockSlotReq)
        emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.internal_static_VintageMarketStoreUnlockSlotReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.internal_static_VintageMarketStoreUnlockSlotReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq.class, emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq.newBuilder()
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
        storeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.internal_static_VintageMarketStoreUnlockSlotReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq build() {
        emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq buildPartial() {
        emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq result = new emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq(this);
        result.storeId_ = storeId_;
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
        if (other instanceof emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq) {
          return mergeFrom((emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq other) {
        if (other == emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq.getDefaultInstance()) return this;
        if (other.getStoreId() != 0) {
          setStoreId(other.getStoreId());
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
        emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int storeId_ ;
      /**
       * <code>uint32 store_id = 13;</code>
       * @return The storeId.
       */
      @java.lang.Override
      public int getStoreId() {
        return storeId_;
      }
      /**
       * <code>uint32 store_id = 13;</code>
       * @param value The storeId to set.
       * @return This builder for chaining.
       */
      public Builder setStoreId(int value) {
        
        storeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 store_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreId() {
        
        storeId_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:VintageMarketStoreUnlockSlotReq)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketStoreUnlockSlotReq)
    private static final emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq();
    }

    public static emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketStoreUnlockSlotReq>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketStoreUnlockSlotReq>() {
      @java.lang.Override
      public VintageMarketStoreUnlockSlotReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageMarketStoreUnlockSlotReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageMarketStoreUnlockSlotReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketStoreUnlockSlotReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageMarketStoreUnlockSlotReqOuterClass.VintageMarketStoreUnlockSlotReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketStoreUnlockSlotReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketStoreUnlockSlotReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%VintageMarketStoreUnlockSlotReq.proto\"" +
      "3\n\037VintageMarketStoreUnlockSlotReq\022\020\n\010st" +
      "ore_id\030\r \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageMarketStoreUnlockSlotReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketStoreUnlockSlotReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketStoreUnlockSlotReq_descriptor,
        new java.lang.String[] { "StoreId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
