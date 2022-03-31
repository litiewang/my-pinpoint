/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2022-03-29")
public class TLongIntIntByteByteStringValue implements org.apache.thrift.TBase<TLongIntIntByteByteStringValue, TLongIntIntByteByteStringValue._Fields>, java.io.Serializable, Cloneable, Comparable<TLongIntIntByteByteStringValue> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLongIntIntByteByteStringValue");

  private static final org.apache.thrift.protocol.TField LONG_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("longValue", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField INT_VALUE1_FIELD_DESC = new org.apache.thrift.protocol.TField("intValue1", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField INT_VALUE2_FIELD_DESC = new org.apache.thrift.protocol.TField("intValue2", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField BYTE_VALUE1_FIELD_DESC = new org.apache.thrift.protocol.TField("byteValue1", org.apache.thrift.protocol.TType.BYTE, (short)4);
  private static final org.apache.thrift.protocol.TField BYTE_VALUE2_FIELD_DESC = new org.apache.thrift.protocol.TField("byteValue2", org.apache.thrift.protocol.TType.BYTE, (short)5);
  private static final org.apache.thrift.protocol.TField STRING_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("stringValue", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TLongIntIntByteByteStringValueStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TLongIntIntByteByteStringValueTupleSchemeFactory();

  private long longValue; // required
  private int intValue1; // required
  private int intValue2; // optional
  private byte byteValue1; // optional
  private byte byteValue2; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String stringValue; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LONG_VALUE((short)1, "longValue"),
    INT_VALUE1((short)2, "intValue1"),
    INT_VALUE2((short)3, "intValue2"),
    BYTE_VALUE1((short)4, "byteValue1"),
    BYTE_VALUE2((short)5, "byteValue2"),
    STRING_VALUE((short)6, "stringValue");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LONG_VALUE
          return LONG_VALUE;
        case 2: // INT_VALUE1
          return INT_VALUE1;
        case 3: // INT_VALUE2
          return INT_VALUE2;
        case 4: // BYTE_VALUE1
          return BYTE_VALUE1;
        case 5: // BYTE_VALUE2
          return BYTE_VALUE2;
        case 6: // STRING_VALUE
          return STRING_VALUE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LONGVALUE_ISSET_ID = 0;
  private static final int __INTVALUE1_ISSET_ID = 1;
  private static final int __INTVALUE2_ISSET_ID = 2;
  private static final int __BYTEVALUE1_ISSET_ID = 3;
  private static final int __BYTEVALUE2_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.INT_VALUE2,_Fields.BYTE_VALUE1,_Fields.BYTE_VALUE2,_Fields.STRING_VALUE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LONG_VALUE, new org.apache.thrift.meta_data.FieldMetaData("longValue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.INT_VALUE1, new org.apache.thrift.meta_data.FieldMetaData("intValue1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INT_VALUE2, new org.apache.thrift.meta_data.FieldMetaData("intValue2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BYTE_VALUE1, new org.apache.thrift.meta_data.FieldMetaData("byteValue1", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.BYTE_VALUE2, new org.apache.thrift.meta_data.FieldMetaData("byteValue2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.STRING_VALUE, new org.apache.thrift.meta_data.FieldMetaData("stringValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLongIntIntByteByteStringValue.class, metaDataMap);
  }

  public TLongIntIntByteByteStringValue() {
  }

  public TLongIntIntByteByteStringValue(
    long longValue,
    int intValue1)
  {
    this();
    this.longValue = longValue;
    setLongValueIsSet(true);
    this.intValue1 = intValue1;
    setIntValue1IsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLongIntIntByteByteStringValue(TLongIntIntByteByteStringValue other) {
    __isset_bitfield = other.__isset_bitfield;
    this.longValue = other.longValue;
    this.intValue1 = other.intValue1;
    this.intValue2 = other.intValue2;
    this.byteValue1 = other.byteValue1;
    this.byteValue2 = other.byteValue2;
    if (other.isSetStringValue()) {
      this.stringValue = other.stringValue;
    }
  }

  public TLongIntIntByteByteStringValue deepCopy() {
    return new TLongIntIntByteByteStringValue(this);
  }

  @Override
  public void clear() {
    setLongValueIsSet(false);
    this.longValue = 0;
    setIntValue1IsSet(false);
    this.intValue1 = 0;
    setIntValue2IsSet(false);
    this.intValue2 = 0;
    setByteValue1IsSet(false);
    this.byteValue1 = 0;
    setByteValue2IsSet(false);
    this.byteValue2 = 0;
    this.stringValue = null;
  }

  public long getLongValue() {
    return this.longValue;
  }

  public void setLongValue(long longValue) {
    this.longValue = longValue;
    setLongValueIsSet(true);
  }

  public void unsetLongValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LONGVALUE_ISSET_ID);
  }

  /** Returns true if field longValue is set (has been assigned a value) and false otherwise */
  public boolean isSetLongValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LONGVALUE_ISSET_ID);
  }

  public void setLongValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LONGVALUE_ISSET_ID, value);
  }

  public int getIntValue1() {
    return this.intValue1;
  }

  public void setIntValue1(int intValue1) {
    this.intValue1 = intValue1;
    setIntValue1IsSet(true);
  }

  public void unsetIntValue1() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INTVALUE1_ISSET_ID);
  }

  /** Returns true if field intValue1 is set (has been assigned a value) and false otherwise */
  public boolean isSetIntValue1() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INTVALUE1_ISSET_ID);
  }

  public void setIntValue1IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INTVALUE1_ISSET_ID, value);
  }

  public int getIntValue2() {
    return this.intValue2;
  }

  public void setIntValue2(int intValue2) {
    this.intValue2 = intValue2;
    setIntValue2IsSet(true);
  }

  public void unsetIntValue2() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INTVALUE2_ISSET_ID);
  }

  /** Returns true if field intValue2 is set (has been assigned a value) and false otherwise */
  public boolean isSetIntValue2() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INTVALUE2_ISSET_ID);
  }

  public void setIntValue2IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INTVALUE2_ISSET_ID, value);
  }

  public byte getByteValue1() {
    return this.byteValue1;
  }

  public void setByteValue1(byte byteValue1) {
    this.byteValue1 = byteValue1;
    setByteValue1IsSet(true);
  }

  public void unsetByteValue1() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BYTEVALUE1_ISSET_ID);
  }

  /** Returns true if field byteValue1 is set (has been assigned a value) and false otherwise */
  public boolean isSetByteValue1() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BYTEVALUE1_ISSET_ID);
  }

  public void setByteValue1IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BYTEVALUE1_ISSET_ID, value);
  }

  public byte getByteValue2() {
    return this.byteValue2;
  }

  public void setByteValue2(byte byteValue2) {
    this.byteValue2 = byteValue2;
    setByteValue2IsSet(true);
  }

  public void unsetByteValue2() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BYTEVALUE2_ISSET_ID);
  }

  /** Returns true if field byteValue2 is set (has been assigned a value) and false otherwise */
  public boolean isSetByteValue2() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BYTEVALUE2_ISSET_ID);
  }

  public void setByteValue2IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BYTEVALUE2_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStringValue() {
    return this.stringValue;
  }

  public void setStringValue(@org.apache.thrift.annotation.Nullable java.lang.String stringValue) {
    this.stringValue = stringValue;
  }

  public void unsetStringValue() {
    this.stringValue = null;
  }

  /** Returns true if field stringValue is set (has been assigned a value) and false otherwise */
  public boolean isSetStringValue() {
    return this.stringValue != null;
  }

  public void setStringValueIsSet(boolean value) {
    if (!value) {
      this.stringValue = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case LONG_VALUE:
      if (value == null) {
        unsetLongValue();
      } else {
        setLongValue((java.lang.Long)value);
      }
      break;

    case INT_VALUE1:
      if (value == null) {
        unsetIntValue1();
      } else {
        setIntValue1((java.lang.Integer)value);
      }
      break;

    case INT_VALUE2:
      if (value == null) {
        unsetIntValue2();
      } else {
        setIntValue2((java.lang.Integer)value);
      }
      break;

    case BYTE_VALUE1:
      if (value == null) {
        unsetByteValue1();
      } else {
        setByteValue1((java.lang.Byte)value);
      }
      break;

    case BYTE_VALUE2:
      if (value == null) {
        unsetByteValue2();
      } else {
        setByteValue2((java.lang.Byte)value);
      }
      break;

    case STRING_VALUE:
      if (value == null) {
        unsetStringValue();
      } else {
        setStringValue((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LONG_VALUE:
      return getLongValue();

    case INT_VALUE1:
      return getIntValue1();

    case INT_VALUE2:
      return getIntValue2();

    case BYTE_VALUE1:
      return getByteValue1();

    case BYTE_VALUE2:
      return getByteValue2();

    case STRING_VALUE:
      return getStringValue();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LONG_VALUE:
      return isSetLongValue();
    case INT_VALUE1:
      return isSetIntValue1();
    case INT_VALUE2:
      return isSetIntValue2();
    case BYTE_VALUE1:
      return isSetByteValue1();
    case BYTE_VALUE2:
      return isSetByteValue2();
    case STRING_VALUE:
      return isSetStringValue();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TLongIntIntByteByteStringValue)
      return this.equals((TLongIntIntByteByteStringValue)that);
    return false;
  }

  public boolean equals(TLongIntIntByteByteStringValue that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_longValue = true;
    boolean that_present_longValue = true;
    if (this_present_longValue || that_present_longValue) {
      if (!(this_present_longValue && that_present_longValue))
        return false;
      if (this.longValue != that.longValue)
        return false;
    }

    boolean this_present_intValue1 = true;
    boolean that_present_intValue1 = true;
    if (this_present_intValue1 || that_present_intValue1) {
      if (!(this_present_intValue1 && that_present_intValue1))
        return false;
      if (this.intValue1 != that.intValue1)
        return false;
    }

    boolean this_present_intValue2 = true && this.isSetIntValue2();
    boolean that_present_intValue2 = true && that.isSetIntValue2();
    if (this_present_intValue2 || that_present_intValue2) {
      if (!(this_present_intValue2 && that_present_intValue2))
        return false;
      if (this.intValue2 != that.intValue2)
        return false;
    }

    boolean this_present_byteValue1 = true && this.isSetByteValue1();
    boolean that_present_byteValue1 = true && that.isSetByteValue1();
    if (this_present_byteValue1 || that_present_byteValue1) {
      if (!(this_present_byteValue1 && that_present_byteValue1))
        return false;
      if (this.byteValue1 != that.byteValue1)
        return false;
    }

    boolean this_present_byteValue2 = true && this.isSetByteValue2();
    boolean that_present_byteValue2 = true && that.isSetByteValue2();
    if (this_present_byteValue2 || that_present_byteValue2) {
      if (!(this_present_byteValue2 && that_present_byteValue2))
        return false;
      if (this.byteValue2 != that.byteValue2)
        return false;
    }

    boolean this_present_stringValue = true && this.isSetStringValue();
    boolean that_present_stringValue = true && that.isSetStringValue();
    if (this_present_stringValue || that_present_stringValue) {
      if (!(this_present_stringValue && that_present_stringValue))
        return false;
      if (!this.stringValue.equals(that.stringValue))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(longValue);

    hashCode = hashCode * 8191 + intValue1;

    hashCode = hashCode * 8191 + ((isSetIntValue2()) ? 131071 : 524287);
    if (isSetIntValue2())
      hashCode = hashCode * 8191 + intValue2;

    hashCode = hashCode * 8191 + ((isSetByteValue1()) ? 131071 : 524287);
    if (isSetByteValue1())
      hashCode = hashCode * 8191 + (int) (byteValue1);

    hashCode = hashCode * 8191 + ((isSetByteValue2()) ? 131071 : 524287);
    if (isSetByteValue2())
      hashCode = hashCode * 8191 + (int) (byteValue2);

    hashCode = hashCode * 8191 + ((isSetStringValue()) ? 131071 : 524287);
    if (isSetStringValue())
      hashCode = hashCode * 8191 + stringValue.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TLongIntIntByteByteStringValue other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetLongValue()).compareTo(other.isSetLongValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longValue, other.longValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIntValue1()).compareTo(other.isSetIntValue1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntValue1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.intValue1, other.intValue1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIntValue2()).compareTo(other.isSetIntValue2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntValue2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.intValue2, other.intValue2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetByteValue1()).compareTo(other.isSetByteValue1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetByteValue1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.byteValue1, other.byteValue1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetByteValue2()).compareTo(other.isSetByteValue2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetByteValue2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.byteValue2, other.byteValue2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStringValue()).compareTo(other.isSetStringValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStringValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stringValue, other.stringValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TLongIntIntByteByteStringValue(");
    boolean first = true;

    sb.append("longValue:");
    sb.append(this.longValue);
    first = false;
    if (!first) sb.append(", ");
    sb.append("intValue1:");
    sb.append(this.intValue1);
    first = false;
    if (isSetIntValue2()) {
      if (!first) sb.append(", ");
      sb.append("intValue2:");
      sb.append(this.intValue2);
      first = false;
    }
    if (isSetByteValue1()) {
      if (!first) sb.append(", ");
      sb.append("byteValue1:");
      sb.append(this.byteValue1);
      first = false;
    }
    if (isSetByteValue2()) {
      if (!first) sb.append(", ");
      sb.append("byteValue2:");
      sb.append(this.byteValue2);
      first = false;
    }
    if (isSetStringValue()) {
      if (!first) sb.append(", ");
      sb.append("stringValue:");
      if (this.stringValue == null) {
        sb.append("null");
      } else {
        sb.append(this.stringValue);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TLongIntIntByteByteStringValueStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TLongIntIntByteByteStringValueStandardScheme getScheme() {
      return new TLongIntIntByteByteStringValueStandardScheme();
    }
  }

  private static class TLongIntIntByteByteStringValueStandardScheme extends org.apache.thrift.scheme.StandardScheme<TLongIntIntByteByteStringValue> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLongIntIntByteByteStringValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LONG_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.longValue = iprot.readI64();
              struct.setLongValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INT_VALUE1
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.intValue1 = iprot.readI32();
              struct.setIntValue1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INT_VALUE2
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.intValue2 = iprot.readI32();
              struct.setIntValue2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BYTE_VALUE1
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.byteValue1 = iprot.readByte();
              struct.setByteValue1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BYTE_VALUE2
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.byteValue2 = iprot.readByte();
              struct.setByteValue2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STRING_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stringValue = iprot.readString();
              struct.setStringValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLongIntIntByteByteStringValue struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LONG_VALUE_FIELD_DESC);
      oprot.writeI64(struct.longValue);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INT_VALUE1_FIELD_DESC);
      oprot.writeI32(struct.intValue1);
      oprot.writeFieldEnd();
      if (struct.isSetIntValue2()) {
        oprot.writeFieldBegin(INT_VALUE2_FIELD_DESC);
        oprot.writeI32(struct.intValue2);
        oprot.writeFieldEnd();
      }
      if (struct.isSetByteValue1()) {
        oprot.writeFieldBegin(BYTE_VALUE1_FIELD_DESC);
        oprot.writeByte(struct.byteValue1);
        oprot.writeFieldEnd();
      }
      if (struct.isSetByteValue2()) {
        oprot.writeFieldBegin(BYTE_VALUE2_FIELD_DESC);
        oprot.writeByte(struct.byteValue2);
        oprot.writeFieldEnd();
      }
      if (struct.stringValue != null) {
        if (struct.isSetStringValue()) {
          oprot.writeFieldBegin(STRING_VALUE_FIELD_DESC);
          oprot.writeString(struct.stringValue);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLongIntIntByteByteStringValueTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TLongIntIntByteByteStringValueTupleScheme getScheme() {
      return new TLongIntIntByteByteStringValueTupleScheme();
    }
  }

  private static class TLongIntIntByteByteStringValueTupleScheme extends org.apache.thrift.scheme.TupleScheme<TLongIntIntByteByteStringValue> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLongIntIntByteByteStringValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLongValue()) {
        optionals.set(0);
      }
      if (struct.isSetIntValue1()) {
        optionals.set(1);
      }
      if (struct.isSetIntValue2()) {
        optionals.set(2);
      }
      if (struct.isSetByteValue1()) {
        optionals.set(3);
      }
      if (struct.isSetByteValue2()) {
        optionals.set(4);
      }
      if (struct.isSetStringValue()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetLongValue()) {
        oprot.writeI64(struct.longValue);
      }
      if (struct.isSetIntValue1()) {
        oprot.writeI32(struct.intValue1);
      }
      if (struct.isSetIntValue2()) {
        oprot.writeI32(struct.intValue2);
      }
      if (struct.isSetByteValue1()) {
        oprot.writeByte(struct.byteValue1);
      }
      if (struct.isSetByteValue2()) {
        oprot.writeByte(struct.byteValue2);
      }
      if (struct.isSetStringValue()) {
        oprot.writeString(struct.stringValue);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLongIntIntByteByteStringValue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.longValue = iprot.readI64();
        struct.setLongValueIsSet(true);
      }
      if (incoming.get(1)) {
        struct.intValue1 = iprot.readI32();
        struct.setIntValue1IsSet(true);
      }
      if (incoming.get(2)) {
        struct.intValue2 = iprot.readI32();
        struct.setIntValue2IsSet(true);
      }
      if (incoming.get(3)) {
        struct.byteValue1 = iprot.readByte();
        struct.setByteValue1IsSet(true);
      }
      if (incoming.get(4)) {
        struct.byteValue2 = iprot.readByte();
        struct.setByteValue2IsSet(true);
      }
      if (incoming.get(5)) {
        struct.stringValue = iprot.readString();
        struct.setStringValueIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

