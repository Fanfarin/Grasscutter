// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MarkEntityInMinMapNotify.proto

package emu.grasscutter.net.proto;

public final class MarkEntityInMinMapNotifyOuterClass {
  private MarkEntityInMinMapNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MarkEntityInMinMapNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MarkEntityInMinMapNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 9;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.Vector position = 13;</code>
     * @return Whether the position field is set.
     */
    boolean hasPosition();
    /**
     * <code>.Vector position = 13;</code>
     * @return The position.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPosition();
    /**
     * <code>.Vector position = 13;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder();

    /**
     * <code>uint32 monster_id = 8;</code>
     * @return The monsterId.
     */
    int getMonsterId();
  }
  /**
   * <pre>
   * CmdId: 315
   * Obf: LHECKPDNFHN
   * </pre>
   *
   * Protobuf type {@code MarkEntityInMinMapNotify}
   */
  public static final class MarkEntityInMinMapNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MarkEntityInMinMapNotify)
      MarkEntityInMinMapNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MarkEntityInMinMapNotify.newBuilder() to construct.
    private MarkEntityInMinMapNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MarkEntityInMinMapNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MarkEntityInMinMapNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MarkEntityInMinMapNotify(
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
            case 64: {

              monsterId_ = input.readUInt32();
              break;
            }
            case 72: {

              entityId_ = input.readUInt32();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (position_ != null) {
                subBuilder = position_.toBuilder();
              }
              position_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(position_);
                position_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.internal_static_MarkEntityInMinMapNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.internal_static_MarkEntityInMinMapNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.class, emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 9;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 9;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int POSITION_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector position_;
    /**
     * <code>.Vector position = 13;</code>
     * @return Whether the position field is set.
     */
    @java.lang.Override
    public boolean hasPosition() {
      return position_ != null;
    }
    /**
     * <code>.Vector position = 13;</code>
     * @return The position.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPosition() {
      return position_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
    }
    /**
     * <code>.Vector position = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
      return getPosition();
    }

    public static final int MONSTER_ID_FIELD_NUMBER = 8;
    private int monsterId_;
    /**
     * <code>uint32 monster_id = 8;</code>
     * @return The monsterId.
     */
    @java.lang.Override
    public int getMonsterId() {
      return monsterId_;
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
      if (monsterId_ != 0) {
        output.writeUInt32(8, monsterId_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(9, entityId_);
      }
      if (position_ != null) {
        output.writeMessage(13, getPosition());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (monsterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, monsterId_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, entityId_);
      }
      if (position_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getPosition());
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
      if (!(obj instanceof emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify other = (emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasPosition() != other.hasPosition()) return false;
      if (hasPosition()) {
        if (!getPosition()
            .equals(other.getPosition())) return false;
      }
      if (getMonsterId()
          != other.getMonsterId()) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasPosition()) {
        hash = (37 * hash) + POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getPosition().hashCode();
      }
      hash = (37 * hash) + MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify prototype) {
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
     * CmdId: 315
     * Obf: LHECKPDNFHN
     * </pre>
     *
     * Protobuf type {@code MarkEntityInMinMapNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MarkEntityInMinMapNotify)
        emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.internal_static_MarkEntityInMinMapNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.internal_static_MarkEntityInMinMapNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.class, emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.newBuilder()
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
        entityId_ = 0;

        if (positionBuilder_ == null) {
          position_ = null;
        } else {
          position_ = null;
          positionBuilder_ = null;
        }
        monsterId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.internal_static_MarkEntityInMinMapNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify build() {
        emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify buildPartial() {
        emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify result = new emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify(this);
        result.entityId_ = entityId_;
        if (positionBuilder_ == null) {
          result.position_ = position_;
        } else {
          result.position_ = positionBuilder_.build();
        }
        result.monsterId_ = monsterId_;
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
        if (other instanceof emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify other) {
        if (other == emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasPosition()) {
          mergePosition(other.getPosition());
        }
        if (other.getMonsterId() != 0) {
          setMonsterId(other.getMonsterId());
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
        emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 9;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 9;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector position_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> positionBuilder_;
      /**
       * <code>.Vector position = 13;</code>
       * @return Whether the position field is set.
       */
      public boolean hasPosition() {
        return positionBuilder_ != null || position_ != null;
      }
      /**
       * <code>.Vector position = 13;</code>
       * @return The position.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPosition() {
        if (positionBuilder_ == null) {
          return position_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        } else {
          return positionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector position = 13;</code>
       */
      public Builder setPosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          position_ = value;
          onChanged();
        } else {
          positionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector position = 13;</code>
       */
      public Builder setPosition(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (positionBuilder_ == null) {
          position_ = builderForValue.build();
          onChanged();
        } else {
          positionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector position = 13;</code>
       */
      public Builder mergePosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (position_ != null) {
            position_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(position_).mergeFrom(value).buildPartial();
          } else {
            position_ = value;
          }
          onChanged();
        } else {
          positionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector position = 13;</code>
       */
      public Builder clearPosition() {
        if (positionBuilder_ == null) {
          position_ = null;
          onChanged();
        } else {
          position_ = null;
          positionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector position = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPositionBuilder() {
        
        onChanged();
        return getPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector position = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilder();
        } else {
          return position_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        }
      }
      /**
       * <code>.Vector position = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPosition(),
                  getParentForChildren(),
                  isClean());
          position_ = null;
        }
        return positionBuilder_;
      }

      private int monsterId_ ;
      /**
       * <code>uint32 monster_id = 8;</code>
       * @return The monsterId.
       */
      @java.lang.Override
      public int getMonsterId() {
        return monsterId_;
      }
      /**
       * <code>uint32 monster_id = 8;</code>
       * @param value The monsterId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterId(int value) {
        
        monsterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterId() {
        
        monsterId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MarkEntityInMinMapNotify)
    }

    // @@protoc_insertion_point(class_scope:MarkEntityInMinMapNotify)
    private static final emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify();
    }

    public static emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MarkEntityInMinMapNotify>
        PARSER = new com.google.protobuf.AbstractParser<MarkEntityInMinMapNotify>() {
      @java.lang.Override
      public MarkEntityInMinMapNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MarkEntityInMinMapNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MarkEntityInMinMapNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MarkEntityInMinMapNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MarkEntityInMinMapNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MarkEntityInMinMapNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036MarkEntityInMinMapNotify.proto\032\014Vector" +
      ".proto\"\\\n\030MarkEntityInMinMapNotify\022\021\n\ten" +
      "tity_id\030\t \001(\r\022\031\n\010position\030\r \001(\0132\007.Vector" +
      "\022\022\n\nmonster_id\030\010 \001(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_MarkEntityInMinMapNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MarkEntityInMinMapNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MarkEntityInMinMapNotify_descriptor,
        new java.lang.String[] { "EntityId", "Position", "MonsterId", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
