// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package alluxio.grpc;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_BlockInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_BlockInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_BlockLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_BlockLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_LocalityTier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_LocalityTier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_TieredIdentity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_TieredIdentity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_WorkerNetAddress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_WorkerNetAddress_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\022\014alluxio.grpc\"\\\n\tBlockInf" +
      "o\022\017\n\007blockId\030\001 \001(\003\022\016\n\006length\030\002 \001(\003\022.\n\tlo" +
      "cations\030\003 \003(\0132\033.alluxio.grpc.BlockLocati" +
      "on\"k\n\rBlockLocation\022\020\n\010workerId\030\001 \001(\003\0225\n" +
      "\rworkerAddress\030\002 \001(\0132\036.alluxio.grpc.Work" +
      "erNetAddress\022\021\n\ttierAlias\030\003 \001(\t\"/\n\014Local" +
      "ityTier\022\020\n\010tierName\030\001 \001(\t\022\r\n\005value\030\002 \001(\t" +
      "\";\n\016TieredIdentity\022)\n\005tiers\030\001 \003(\0132\032.allu" +
      "xio.grpc.LocalityTier\"\244\001\n\020WorkerNetAddre" +
      "ss\022\014\n\004host\030\001 \001(\t\022\017\n\007rpcPort\030\002 \001(\005\022\020\n\010dat" +
      "aPort\030\003 \001(\005\022\017\n\007webPort\030\004 \001(\005\022\030\n\020domainSo" +
      "cketPath\030\005 \001(\t\0224\n\016tieredIdentity\030\006 \001(\0132\034" +
      ".alluxio.grpc.TieredIdentity*!\n\tTtlActio" +
      "n\022\n\n\006DELETE\020\000\022\010\n\004FREE\020\001B\035\n\014alluxio.grpcB" +
      "\013CommonProtoP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_alluxio_grpc_BlockInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_alluxio_grpc_BlockInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_BlockInfo_descriptor,
        new java.lang.String[] { "BlockId", "Length", "Locations", });
    internal_static_alluxio_grpc_BlockLocation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_alluxio_grpc_BlockLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_BlockLocation_descriptor,
        new java.lang.String[] { "WorkerId", "WorkerAddress", "TierAlias", });
    internal_static_alluxio_grpc_LocalityTier_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_alluxio_grpc_LocalityTier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_LocalityTier_descriptor,
        new java.lang.String[] { "TierName", "Value", });
    internal_static_alluxio_grpc_TieredIdentity_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_alluxio_grpc_TieredIdentity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_TieredIdentity_descriptor,
        new java.lang.String[] { "Tiers", });
    internal_static_alluxio_grpc_WorkerNetAddress_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_alluxio_grpc_WorkerNetAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_WorkerNetAddress_descriptor,
        new java.lang.String[] { "Host", "RpcPort", "DataPort", "WebPort", "DomainSocketPath", "TieredIdentity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
