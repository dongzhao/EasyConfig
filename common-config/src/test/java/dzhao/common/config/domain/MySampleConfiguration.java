package dzhao.common.config.domain;

import dzhao.common.config.api.annotation.ConfigFieldInfo;
import dzhao.common.config.api.annotation.ConfigInfo;
import dzhao.common.config.api.domain.ConfigObject;

import java.util.List;

@ConfigInfo(prefix = "config")
public class MySampleConfiguration implements ConfigObject {

    // primitive types
    @ConfigFieldInfo(prefix = "string.key")
    private String testStringKey;
    @ConfigFieldInfo(prefix = "int.key")
    private int testIntKey;
    @ConfigFieldInfo(prefix = "boolean.key")
    private boolean testBooleanKey;
    @ConfigFieldInfo(prefix = "char.key")
    private char testCharKey;
    @ConfigFieldInfo(prefix = "long.key")
    private long testLongKey;
    @ConfigFieldInfo(prefix = "double.key")
    private double testDoubleKey;
    @ConfigFieldInfo(prefix = "float.key")
    private float testFloatKey;
    @ConfigFieldInfo(prefix = "byte.key")
    private byte testByteKey;
    @ConfigFieldInfo(prefix = "short.key")
    private short testShortKey;
    @ConfigFieldInfo(prefix = "array.key")
    private String[] testArrayKey;

    // Object type
    @ConfigFieldInfo(prefix = "int.object.key")
    private Integer testIntObjectKey;
    @ConfigFieldInfo(prefix = "boolean.object.key")
    private Boolean testBooleanObjectKey;
    @ConfigFieldInfo(prefix = "float.object.key")
    private Float testFloatObjectKey;
    @ConfigFieldInfo(prefix = "double.object.key")
    private Double testDoubleObjectKey;
    @ConfigFieldInfo(prefix = "long.object.key")
    private Long testLongObjectKey;
    @ConfigFieldInfo(prefix = "byte.object.key")
    private Byte testByteObjectKey;
    @ConfigFieldInfo(prefix = "list.object.key")
    private List<String> testListObjectKey;
    @ConfigFieldInfo(prefix = "short.object.key")
    private Short testShortObjectKey;

    public String getTestStringKey() {
        return testStringKey;
    }

    public void setTestStringKey(String testStringKey) {
        this.testStringKey = testStringKey;
    }

    public int getTestIntKey() {
        return testIntKey;
    }

    public void setTestIntKey(int testIntKey) {
        this.testIntKey = testIntKey;
    }

    public Integer getTestIntObjectKey() {
        return testIntObjectKey;
    }

    public void setTestIntObjectKey(Integer testIntObjectKey) {
        this.testIntObjectKey = testIntObjectKey;
    }

    public boolean isTestBooleanKey() {
        return testBooleanKey;
    }

    public void setTestBooleanKey(boolean testBooleanKey) {
        this.testBooleanKey = testBooleanKey;
    }

    public Boolean getTestBooleanObjectKey() {
        return testBooleanObjectKey;
    }

    public void setTestBooleanObjectKey(Boolean testBooleanObjectKey) {
        this.testBooleanObjectKey = testBooleanObjectKey;
    }

    public char getTestCharKey() {
        return testCharKey;
    }

    public void setTestCharKey(char testCharKey) {
        this.testCharKey = testCharKey;
    }

    public long getTestLongKey() {
        return testLongKey;
    }

    public void setTestLongKey(long testLongKey) {
        this.testLongKey = testLongKey;
    }

    public double getTestDoubleKey() {
        return testDoubleKey;
    }

    public void setTestDoubleKey(double testDoubleKey) {
        this.testDoubleKey = testDoubleKey;
    }

    public float getTestFloatKey() {
        return testFloatKey;
    }

    public void setTestFloatKey(float testFloatKey) {
        this.testFloatKey = testFloatKey;
    }

    public String[] getTestArrayKey() {
        return testArrayKey;
    }

    public void setTestArrayKey(String[] testArrayKey) {
        this.testArrayKey = testArrayKey;
    }

    public byte getTestByteKey() {
        return testByteKey;
    }

    public void setTestByteKey(byte testByteKey) {
        this.testByteKey = testByteKey;
    }

    public Byte getTestByteObjectKey() {
        return testByteObjectKey;
    }

    public void setTestByteObjectKey(Byte testByteObjectKey) {
        this.testByteObjectKey = testByteObjectKey;
    }

    public Long getTestLongObjectKey() {
        return testLongObjectKey;
    }

    public void setTestLongObjectKey(Long testLongObjectKey) {
        this.testLongObjectKey = testLongObjectKey;
    }

    public Double getTestDoubleObjectKey() {
        return testDoubleObjectKey;
    }

    public void setTestDoubleObjectKey(Double testDoubleObjectKey) {
        this.testDoubleObjectKey = testDoubleObjectKey;
    }

    public Float getTestFloatObjectKey() {
        return testFloatObjectKey;
    }

    public void setTestFloatObjectKey(Float testFloatObjectKey) {
        this.testFloatObjectKey = testFloatObjectKey;
    }

    public short getTestShortKey() {
        return testShortKey;
    }

    public void setTestShortKey(short testShortKey) {
        this.testShortKey = testShortKey;
    }

    public Short getTestShortObjectKey() {
        return testShortObjectKey;
    }

    public void setTestShortObjectKey(Short testShortObjectKey) {
        this.testShortObjectKey = testShortObjectKey;
    }

    public List<String> getTestListObjectKey() {
        return testListObjectKey;
    }

    public void setTestListObjectKey(List<String> testListObjectKey) {
        this.testListObjectKey = testListObjectKey;
    }
}
