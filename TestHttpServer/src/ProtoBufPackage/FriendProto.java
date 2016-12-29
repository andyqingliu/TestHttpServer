// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: friend.proto

package ProtoBufPackage;

public final class FriendProto {
  private FriendProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface C2S_GetFriendList_messageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Xsjm.Logic.Protocols.C2S_GetFriendList_message)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional int32 result = 1;</code>
     */
    boolean hasResult();
    /**
     * <code>optional int32 result = 1;</code>
     */
    int getResult();

    /**
     * <code>optional .Xsjm.Logic.Protocols.Person p = 2;</code>
     */
    boolean hasP();
    /**
     * <code>optional .Xsjm.Logic.Protocols.Person p = 2;</code>
     */
    ProtoBufPackage.PersonProto.Person getP();
  }
  /**
   * Protobuf type {@code Xsjm.Logic.Protocols.C2S_GetFriendList_message}
   */
  public static final class C2S_GetFriendList_message extends
      com.google.protobuf.GeneratedMessageLite implements
      // @@protoc_insertion_point(message_implements:Xsjm.Logic.Protocols.C2S_GetFriendList_message)
      C2S_GetFriendList_messageOrBuilder {
    // Use C2S_GetFriendList_message.newBuilder() to construct.
    private C2S_GetFriendList_message(com.google.protobuf.GeneratedMessageLite.Builder builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private C2S_GetFriendList_message(boolean noInit) { this.unknownFields = com.google.protobuf.ByteString.EMPTY;}

    private static final C2S_GetFriendList_message defaultInstance;
    public static C2S_GetFriendList_message getDefaultInstance() {
      return defaultInstance;
    }

    public C2S_GetFriendList_message getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.ByteString unknownFields;
    private C2S_GetFriendList_message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.ByteString.Output unknownFieldsOutput =
          com.google.protobuf.ByteString.newOutput();
      com.google.protobuf.CodedOutputStream unknownFieldsCodedOutput =
          com.google.protobuf.CodedOutputStream.newInstance(
              unknownFieldsOutput);
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              result_ = input.readInt32();
              break;
            }
            case 18: {
              ProtoBufPackage.PersonProto.Person.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = p_.toBuilder();
              }
              p_ = input.readMessage(ProtoBufPackage.PersonProto.Person.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(p_);
                p_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        try {
          unknownFieldsCodedOutput.flush();
        } catch (java.io.IOException e) {
        // Should not happen
        } finally {
          unknownFields = unknownFieldsOutput.toByteString();
        }
        makeExtensionsImmutable();
      }
    }
    public static com.google.protobuf.Parser<C2S_GetFriendList_message> PARSER =
        new com.google.protobuf.AbstractParser<C2S_GetFriendList_message>() {
      public C2S_GetFriendList_message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new C2S_GetFriendList_message(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<C2S_GetFriendList_message> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;
    /**
     * <code>optional int32 result = 1;</code>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 result = 1;</code>
     */
    public int getResult() {
      return result_;
    }

    public static final int P_FIELD_NUMBER = 2;
    private ProtoBufPackage.PersonProto.Person p_;
    /**
     * <code>optional .Xsjm.Logic.Protocols.Person p = 2;</code>
     */
    public boolean hasP() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .Xsjm.Logic.Protocols.Person p = 2;</code>
     */
    public ProtoBufPackage.PersonProto.Person getP() {
      return p_;
    }

    private void initFields() {
      result_ = 0;
      p_ = ProtoBufPackage.PersonProto.Person.getDefaultInstance();
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
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, result_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, p_);
      }
      output.writeRawBytes(unknownFields);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, result_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, p_);
      }
      size += unknownFields.size();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ProtoBufPackage.FriendProto.C2S_GetFriendList_message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoBufPackage.FriendProto.C2S_GetFriendList_message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoBufPackage.FriendProto.C2S_GetFriendList_message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoBufPackage.FriendProto.C2S_GetFriendList_message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoBufPackage.FriendProto.C2S_GetFriendList_message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ProtoBufPackage.FriendProto.C2S_GetFriendList_message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ProtoBufPackage.FriendProto.C2S_GetFriendList_message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ProtoBufPackage.FriendProto.C2S_GetFriendList_message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ProtoBufPackage.FriendProto.C2S_GetFriendList_message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ProtoBufPackage.FriendProto.C2S_GetFriendList_message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ProtoBufPackage.FriendProto.C2S_GetFriendList_message prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    /**
     * Protobuf type {@code Xsjm.Logic.Protocols.C2S_GetFriendList_message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ProtoBufPackage.FriendProto.C2S_GetFriendList_message, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:Xsjm.Logic.Protocols.C2S_GetFriendList_message)
        ProtoBufPackage.FriendProto.C2S_GetFriendList_messageOrBuilder {
      // Construct using ProtoBufPackage.FriendProto.C2S_GetFriendList_message.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        result_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        p_ = ProtoBufPackage.PersonProto.Person.getDefaultInstance();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public ProtoBufPackage.FriendProto.C2S_GetFriendList_message getDefaultInstanceForType() {
        return ProtoBufPackage.FriendProto.C2S_GetFriendList_message.getDefaultInstance();
      }

      public ProtoBufPackage.FriendProto.C2S_GetFriendList_message build() {
        ProtoBufPackage.FriendProto.C2S_GetFriendList_message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ProtoBufPackage.FriendProto.C2S_GetFriendList_message buildPartial() {
        ProtoBufPackage.FriendProto.C2S_GetFriendList_message result = new ProtoBufPackage.FriendProto.C2S_GetFriendList_message(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.result_ = result_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.p_ = p_;
        result.bitField0_ = to_bitField0_;
        return result;
      }

      public Builder mergeFrom(ProtoBufPackage.FriendProto.C2S_GetFriendList_message other) {
        if (other == ProtoBufPackage.FriendProto.C2S_GetFriendList_message.getDefaultInstance()) return this;
        if (other.hasResult()) {
          setResult(other.getResult());
        }
        if (other.hasP()) {
          mergeP(other.getP());
        }
        setUnknownFields(
            getUnknownFields().concat(other.unknownFields));
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ProtoBufPackage.FriendProto.C2S_GetFriendList_message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ProtoBufPackage.FriendProto.C2S_GetFriendList_message) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int result_ ;
      /**
       * <code>optional int32 result = 1;</code>
       */
      public boolean hasResult() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 result = 1;</code>
       */
      public int getResult() {
        return result_;
      }
      /**
       * <code>optional int32 result = 1;</code>
       */
      public Builder setResult(int value) {
        bitField0_ |= 0x00000001;
        result_ = value;
        
        return this;
      }
      /**
       * <code>optional int32 result = 1;</code>
       */
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000001);
        result_ = 0;
        
        return this;
      }

      private ProtoBufPackage.PersonProto.Person p_ = ProtoBufPackage.PersonProto.Person.getDefaultInstance();
      /**
       * <code>optional .Xsjm.Logic.Protocols.Person p = 2;</code>
       */
      public boolean hasP() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .Xsjm.Logic.Protocols.Person p = 2;</code>
       */
      public ProtoBufPackage.PersonProto.Person getP() {
        return p_;
      }
      /**
       * <code>optional .Xsjm.Logic.Protocols.Person p = 2;</code>
       */
      public Builder setP(ProtoBufPackage.PersonProto.Person value) {
        if (value == null) {
          throw new NullPointerException();
        }
        p_ = value;

        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Xsjm.Logic.Protocols.Person p = 2;</code>
       */
      public Builder setP(
          ProtoBufPackage.PersonProto.Person.Builder builderForValue) {
        p_ = builderForValue.build();

        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Xsjm.Logic.Protocols.Person p = 2;</code>
       */
      public Builder mergeP(ProtoBufPackage.PersonProto.Person value) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            p_ != ProtoBufPackage.PersonProto.Person.getDefaultInstance()) {
          p_ =
            ProtoBufPackage.PersonProto.Person.newBuilder(p_).mergeFrom(value).buildPartial();
        } else {
          p_ = value;
        }

        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Xsjm.Logic.Protocols.Person p = 2;</code>
       */
      public Builder clearP() {
        p_ = ProtoBufPackage.PersonProto.Person.getDefaultInstance();

        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Xsjm.Logic.Protocols.C2S_GetFriendList_message)
    }

    static {
      defaultInstance = new C2S_GetFriendList_message(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Xsjm.Logic.Protocols.C2S_GetFriendList_message)
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
