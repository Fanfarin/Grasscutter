// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BDOCPDNCIEF.proto

package emu.grasscutter.net.proto;

public final class BDOCPDNCIEFOuterClass {
  private BDOCPDNCIEFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BDOCPDNCIEFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BDOCPDNCIEF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 group_id = 1;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 guid = 2;</code>
     * @return The guid.
     */
    int getGuid();

    /**
     * <code>uint32 MJIANPPECND = 3;</code>
     * @return The mJIANPPECND.
     */
    int getMJIANPPECND();
  }
  /**
   * Protobuf type {@code BDOCPDNCIEF}
   */
  public static final class BDOCPDNCIEF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BDOCPDNCIEF)
      BDOCPDNCIEFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BDOCPDNCIEF.newBuilder() to construct.
    private BDOCPDNCIEF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BDOCPDNCIEF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BDOCPDNCIEF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BDOCPDNCIEF(
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
            case 8: {

              groupId_ = input.readUInt32();
              break;
            }
            case 16: {

              guid_ = input.readUInt32();
              break;
            }
            case 24: {

              mJIANPPECND_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.internal_static_BDOCPDNCIEF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.internal_static_BDOCPDNCIEF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF.class, emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF.Builder.class);
    }

    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private int groupId_;
    /**
     * <code>uint32 group_id = 1;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int GUID_FIELD_NUMBER = 2;
    private int guid_;
    /**
     * <code>uint32 guid = 2;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
    }

    public static final int MJIANPPECND_FIELD_NUMBER = 3;
    private int mJIANPPECND_;
    /**
     * <code>uint32 MJIANPPECND = 3;</code>
     * @return The mJIANPPECND.
     */
    @java.lang.Override
    public int getMJIANPPECND() {
      return mJIANPPECND_;
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
      if (groupId_ != 0) {
        output.writeUInt32(1, groupId_);
      }
      if (guid_ != 0) {
        output.writeUInt32(2, guid_);
      }
      if (mJIANPPECND_ != 0) {
        output.writeUInt32(3, mJIANPPECND_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, groupId_);
      }
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, guid_);
      }
      if (mJIANPPECND_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, mJIANPPECND_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF other = (emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getMJIANPPECND()
          != other.getMJIANPPECND()) return false;
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
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      hash = (37 * hash) + MJIANPPECND_FIELD_NUMBER;
      hash = (53 * hash) + getMJIANPPECND();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF prototype) {
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
     * Protobuf type {@code BDOCPDNCIEF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BDOCPDNCIEF)
        emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.internal_static_BDOCPDNCIEF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.internal_static_BDOCPDNCIEF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF.class, emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF.newBuilder()
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
        groupId_ = 0;

        guid_ = 0;

        mJIANPPECND_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.internal_static_BDOCPDNCIEF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF build() {
        emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF buildPartial() {
        emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF result = new emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF(this);
        result.groupId_ = groupId_;
        result.guid_ = guid_;
        result.mJIANPPECND_ = mJIANPPECND_;
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
        if (other instanceof emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF) {
          return mergeFrom((emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF other) {
        if (other == emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
        }
        if (other.getMJIANPPECND() != 0) {
          setMJIANPPECND(other.getMJIANPPECND());
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
        emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 1;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 1;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int guid_ ;
      /**
       * <code>uint32 guid = 2;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 2;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0;
        onChanged();
        return this;
      }

      private int mJIANPPECND_ ;
      /**
       * <code>uint32 MJIANPPECND = 3;</code>
       * @return The mJIANPPECND.
       */
      @java.lang.Override
      public int getMJIANPPECND() {
        return mJIANPPECND_;
      }
      /**
       * <code>uint32 MJIANPPECND = 3;</code>
       * @param value The mJIANPPECND to set.
       * @return This builder for chaining.
       */
      public Builder setMJIANPPECND(int value) {
        
        mJIANPPECND_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MJIANPPECND = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMJIANPPECND() {
        
        mJIANPPECND_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BDOCPDNCIEF)
    }

    // @@protoc_insertion_point(class_scope:BDOCPDNCIEF)
    private static final emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF();
    }

    public static emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BDOCPDNCIEF>
        PARSER = new com.google.protobuf.AbstractParser<BDOCPDNCIEF>() {
      @java.lang.Override
      public BDOCPDNCIEF parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BDOCPDNCIEF(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BDOCPDNCIEF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BDOCPDNCIEF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BDOCPDNCIEF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BDOCPDNCIEF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BDOCPDNCIEF.proto\"B\n\013BDOCPDNCIEF\022\020\n\010gr" +
      "oup_id\030\001 \001(\r\022\014\n\004guid\030\002 \001(\r\022\023\n\013MJIANPPECN" +
      "D\030\003 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BDOCPDNCIEF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BDOCPDNCIEF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BDOCPDNCIEF_descriptor,
        new java.lang.String[] { "GroupId", "Guid", "MJIANPPECND", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
