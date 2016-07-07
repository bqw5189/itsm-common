package com.itsm.platform.common.model;

import java.util.Map;

public class EquipmentModel {

    /**
     * 厂商
     */
    private String vendor;
    /**
     * 厂商设备型号
     */
    private String model;
    /**
     * 设备描述
     */
    private String description;
    /**
     * 采集数据方式的类型
     */
    private String collectorType;
    /**
     * 面向对象类名
     */
    private String className;
    /**
     * 私有属性map
     */
    private Map privateProperties;
    /**
     * 公有属性map
     */
    private Map attributes;


    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCollectorType() {
        return collectorType;
    }

    public void setCollectorType(String collectorType) {
        this.collectorType = collectorType;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Map getPrivateProperties() {
        return privateProperties;
    }

    public void setPrivateProperties(Map privateProperties) {
        this.privateProperties = privateProperties;
    }

    public Map getAttributes() {
        return attributes;
    }

    public void setAttributes(Map attributes) {
        this.attributes = attributes;
    }


}
