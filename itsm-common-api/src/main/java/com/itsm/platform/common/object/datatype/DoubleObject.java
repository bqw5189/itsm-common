package com.itsm.platform.common.object.datatype;

import com.itsm.platform.common.model.Value;

import java.util.Collection;

/**
 * 双精度值对象.
 */
public class DoubleObject extends Value {

    /**
     * 初始化双精度值对象.
     */
    public DoubleObject() {
        this.value = 0;
    }

    /**
     * 初始化双精度值对象.
     *
     * @param value 值
     */
    public DoubleObject(double value) {
        this.value = value;
    }

    /**
     * The value.
     */
    private double value;

    @Override
    public long getDeviceTimestamp() {
        return 0;
    }

    /**
     * 设定值.
     *
     * @param value 新值
     */
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public long getTimestamp() {
        return 0;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public String getValueDescription() {
        return null;
    }

    @Override
    public int getValueStatus() {
        return 0;
    }

    @Override
    public boolean isCorrectValue() {
        return false;
    }

    @Override
    public void setDeviceTimestamp(long time) {

    }

    @Override
    public void setTimestamp(long time) {

    }

    @Override
    public void setValueDescription(String desc) {

    }

    @Override
    public Collection toCollection() {
        return null;
    }


    @Override
    public long toLongValue() {
        return 0;
    }


    @Override
    public String toStringValue() {
        return null;
    }

    @Override
    public AbstractTable toTable() {
        return null;
    }

}
