/**
 *
 */
package com.itsm.platform.common.object.datatype;

import com.itsm.platform.common.model.Value;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;

/**
 * 整型值对象.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "integerObject")
public class IntegerObject extends Value {

    /**
     * The is correct.
     */
    private boolean isCorrect = true;

    /**
     * The time.
     */
    private long time;

    /**
     * The device time.
     */
    private long deviceTime;

    /**
     * The value.
     */
    @XmlElement(name = "intValue")
    private long value = -1;

    /**
     * The status.
     */
    @XmlElement
    private int status;

    /**
     * The description.
     */
    @XmlElement
    private String description;

    /**
     * 构造整型值对象.
     */
    public IntegerObject() {

    }


    /**
     * 构造整型值对象.
     *
     * @param value 值
     */
    public IntegerObject(long value) {
        this.value = value;
    }

    public int getType() {
        return Value.TYPE_INTEGER;
    }

    public long toLongValue() {
        return value;
    }

    public Long getValue() {
        return this.value;
    }

    /**
     * 设置值.
     *
     * @param value 值
     */
    public void setValue(long value) {
        this.value = value;
    }

    public String toStringValue() {
        return null;
    }

    public AbstractTable toTable() {
        return null;
    }

    public Collection toCollection() {
        return null;
    }

    public String toString() {
        super.toString();
        return "" + this.value;
    }

    public boolean isCorrectValue() {
        return this.isCorrect;
    }

    /**
     * 设置值正确性.
     *
     * @param isCorrect 值是否正确
     */
    public void setCorrectValue(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public long getTimestamp() {
        return this.time;
    }

    public void setTimestamp(long time) {
        this.time = time;
    }

    public long getDeviceTimestamp() {
        return this.deviceTime;
    }

    public void setDeviceTimestamp(long time) {
        this.deviceTime = time;
    }

    public int getValueStatus() {
        return this.status;
    }

    /**
     * 设定值状态.
     *
     * @param status 状态
     */
    public void setStatus(int status) {
        this.status = status;
    }

    public String getValueDescription() {
        return this.description;
    }

    public void setValueDescription(String desc) {
        this.description = desc;
    }
}
