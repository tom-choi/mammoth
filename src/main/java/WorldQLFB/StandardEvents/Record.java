// automatically generated by the FlatBuffers compiler, do not modify

package WorldQLFB.StandardEvents;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Record extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static Record getRootAsRecord(ByteBuffer _bb) { return getRootAsRecord(_bb, new Record()); }
  public static Record getRootAsRecord(ByteBuffer _bb, Record obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Record __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public WorldQLFB.StandardEvents.Vec3 position() { return position(new WorldQLFB.StandardEvents.Vec3()); }
  public WorldQLFB.StandardEvents.Vec3 position(WorldQLFB.StandardEvents.Vec3 obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public String data() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer dataAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer dataInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String metadata() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer metadataAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer metadataInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public String jsondata() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer jsondataAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer jsondataInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }

  public static void startRecord(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addPosition(FlatBufferBuilder builder, int positionOffset) { builder.addStruct(0, positionOffset, 0); }
  public static void addData(FlatBufferBuilder builder, int dataOffset) { builder.addOffset(1, dataOffset, 0); }
  public static void addMetadata(FlatBufferBuilder builder, int metadataOffset) { builder.addOffset(2, metadataOffset, 0); }
  public static void addJsondata(FlatBufferBuilder builder, int jsondataOffset) { builder.addOffset(3, jsondataOffset, 0); }
  public static int endRecord(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Record get(int j) { return get(new Record(), j); }
    public Record get(Record obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

