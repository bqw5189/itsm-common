package com.itsm.platform.common.util.hashmap;

import javax.xml.bind.annotation.XmlAttribute;
import java.io.Serializable;

/**
 * HashMap元素对象.
 */
public class HashMapItem implements Serializable {

    /**
     * 名.
     */
    @XmlAttribute
    public String key;
    /**
     * 值.
     */
    @XmlAttribute
    public String value;

    /**
     * 构造HashMap元素对象.
     */
    public HashMapItem() {

    }

    /**
     * 构造HashMap元素对象.
     *
     * @param key   名
     * @param value 值
     */
    public HashMapItem(String key, String value) {
        this.key = key;
        this.value = value;
    }

}
