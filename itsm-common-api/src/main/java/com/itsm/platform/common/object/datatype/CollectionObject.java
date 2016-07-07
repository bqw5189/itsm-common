package com.itsm.platform.common.object.datatype;

import com.itsm.platform.common.model.Value;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合值对象.
 */
@XmlRootElement
public class CollectionObject extends Value {

    /**
     * 集合数据.
     */
    private Collection collection = null;

    /**
     * 值生成时间.
     */
    private long time;

    /**
     * 从设备上获取值的时间.
     */
    private long deviceTime;

    /**
     * 是否是正确的值.
     */
    private boolean isCorrect = true;

    /**
     * 状态.
     */
    private int status;

    /**
     * 描述.
     */
    private String description;

    /**
     * 初始化集合值对象.
     */
    public CollectionObject() {

    }

    /**
     * 初始化集合值对象.
     *
     * @param collection 集合对象
     */
    public CollectionObject(Collection collection) {
        this.collection = collection;
        if (this.collection == null) this.collection = new HashSet();
    }

    /**
     * 增加集合元素.
     *
     * @param obj 元素
     */
    public void add(Object obj) {
        if (this.collection != null)
            this.collection.add(obj);
    }


    public int getType() {
        return Value.TYPE_COLLECTION;
    }


    public Collection toCollection() {
        return this.collection;
    }


    public long toLongValue() {
        return -1;
    }

    public String toStringValue() {
        return null;
    }

    public AbstractTable toTable() {
        return null;
    }


    public String toString() {
        super.toString();
        if (this.collection != null)
            return this.collection.toString();
        else {
            return null;
        }
    }


    public boolean isCorrectValue() {
        return this.isCorrect;
    }

    /**
     * 设定正确性.
     *
     * @param isCorrect 是否正确
     */
    public void setCorrectValue(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }


    public long getTimestamp() {
        return this.time;
    }


    public Object getValue() {
        return this.collection;
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
     * 设定状态.
     *
     * @param status 状态值
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

    /**
     * 获取集合对象.
     *
     * @return 集合对象
     */
    public Collection getCollection() {
        return collection;
    }

    /**
     * 设定集合对象.
     *
     * @param collection 集合对象
     */
    public void setCollection(Collection collection) {
        this.collection = collection;
    }
}
