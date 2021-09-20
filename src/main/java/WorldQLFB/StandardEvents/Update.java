// automatically generated by the FlatBuffers compiler, do not modify

package WorldQLFB.StandardEvents;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Update extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static Update getRootAsUpdate(ByteBuffer _bb) { return getRootAsUpdate(_bb, new Update()); }
  public static Update getRootAsUpdate(ByteBuffer _bb, Update obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Update __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String instruction() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer instructionAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer instructionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public WorldQLFB.StandardEvents.Vec3 position() { return position(new WorldQLFB.StandardEvents.Vec3()); }
  public WorldQLFB.StandardEvents.Vec3 position(WorldQLFB.StandardEvents.Vec3 obj) { int o = __offset(6); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public String name() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public String uuid() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer uuidAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer uuidInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public float pitch() { int o = __offset(12); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public float yaw() { int o = __offset(14); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public String entityactions(int j) { int o = __offset(16); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int entityactionsLength() { int o = __offset(16); return o != 0 ? __vector_len(o) : 0; }
  public StringVector entityactionsVector() { return entityactionsVector(new StringVector()); }
  public StringVector entityactionsVector(StringVector obj) { int o = __offset(16); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String params(int j) { int o = __offset(18); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int paramsLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }
  public StringVector paramsVector() { return paramsVector(new StringVector()); }
  public StringVector paramsVector(StringVector obj) { int o = __offset(18); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public float numericalParams(int j) { int o = __offset(20); return o != 0 ? bb.getFloat(__vector(o) + j * 4) : 0; }
  public int numericalParamsLength() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }
  public FloatVector numericalParamsVector() { return numericalParamsVector(new FloatVector()); }
  public FloatVector numericalParamsVector(FloatVector obj) { int o = __offset(20); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer numericalParamsAsByteBuffer() { return __vector_as_bytebuffer(20, 4); }
  public ByteBuffer numericalParamsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 20, 4); }
  public String worldName() { int o = __offset(22); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer worldNameAsByteBuffer() { return __vector_as_bytebuffer(22, 1); }
  public ByteBuffer worldNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 22, 1); }
  public String commands(int j) { int o = __offset(24); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int commandsLength() { int o = __offset(24); return o != 0 ? __vector_len(o) : 0; }
  public StringVector commandsVector() { return commandsVector(new StringVector()); }
  public StringVector commandsVector(StringVector obj) { int o = __offset(24); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public int senderid() { int o = __offset(26); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public WorldQLFB.StandardEvents.Record records(int j) { return records(new WorldQLFB.StandardEvents.Record(), j); }
  public WorldQLFB.StandardEvents.Record records(WorldQLFB.StandardEvents.Record obj, int j) { int o = __offset(28); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int recordsLength() { int o = __offset(28); return o != 0 ? __vector_len(o) : 0; }
  public WorldQLFB.StandardEvents.Record.Vector recordsVector() { return recordsVector(new WorldQLFB.StandardEvents.Record.Vector()); }
  public WorldQLFB.StandardEvents.Record.Vector recordsVector(WorldQLFB.StandardEvents.Record.Vector obj) { int o = __offset(28); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static void startUpdate(FlatBufferBuilder builder) { builder.startTable(13); }
  public static void addInstruction(FlatBufferBuilder builder, int instructionOffset) { builder.addOffset(0, instructionOffset, 0); }
  public static void addPosition(FlatBufferBuilder builder, int positionOffset) { builder.addStruct(1, positionOffset, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(2, nameOffset, 0); }
  public static void addUuid(FlatBufferBuilder builder, int uuidOffset) { builder.addOffset(3, uuidOffset, 0); }
  public static void addPitch(FlatBufferBuilder builder, float pitch) { builder.addFloat(4, pitch, 0.0f); }
  public static void addYaw(FlatBufferBuilder builder, float yaw) { builder.addFloat(5, yaw, 0.0f); }
  public static void addEntityactions(FlatBufferBuilder builder, int entityactionsOffset) { builder.addOffset(6, entityactionsOffset, 0); }
  public static int createEntityactionsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startEntityactionsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addParams(FlatBufferBuilder builder, int paramsOffset) { builder.addOffset(7, paramsOffset, 0); }
  public static int createParamsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startParamsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addNumericalParams(FlatBufferBuilder builder, int numericalParamsOffset) { builder.addOffset(8, numericalParamsOffset, 0); }
  public static int createNumericalParamsVector(FlatBufferBuilder builder, float[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addFloat(data[i]); return builder.endVector(); }
  public static void startNumericalParamsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addWorldName(FlatBufferBuilder builder, int worldNameOffset) { builder.addOffset(9, worldNameOffset, 0); }
  public static void addCommands(FlatBufferBuilder builder, int commandsOffset) { builder.addOffset(10, commandsOffset, 0); }
  public static int createCommandsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startCommandsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addSenderid(FlatBufferBuilder builder, int senderid) { builder.addInt(11, senderid, 0); }
  public static void addRecords(FlatBufferBuilder builder, int recordsOffset) { builder.addOffset(12, recordsOffset, 0); }
  public static int createRecordsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startRecordsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endUpdate(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishUpdateBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedUpdateBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Update get(int j) { return get(new Update(), j); }
    public Update get(Update obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

