package com.itsm.platform.common.constraints;

/**
 * 采集机常量.
 */
public class CollectorConstraints {

    /**
     * 模型名称.
     */
    public static final String PARAM_CLASSNAME = "className";

    /**
     * 协议参数.
     */
    public static final String PARAM_PROTOCOLPARAMETERS = "ProtocolParameters";

    /**
     * 父实例的标识值.
     */
    public static final String PARAM_PARENTPRIVATE = "parentPrivate";

    /**
     * 采集目标.
     */
    public static final String PARAM_TARGET = "Target";

    /**
     * 标识.
     */
    public static final String PARAM_PRIVATEPROPERTIES = "PrivateProperties";

    /**
     * 属性.
     */
    public static final String PARAM_PUBLICPROPERTIES = "PublicProperties";

    /**
     * 模型.
     */
    public static final String PARAM_INFOCLASS = "Infoclass";

    /**
     * 操作类型.
     */
    public static final String PARAM_OPERATION = "Operation";

    /**
     * 管理对象.
     */
    public static final String PARAM_INFOINSTANCE = "Infoinstances";

    /**
     * 设备配置对象.
     */
    public static final String PARAM_EQUIPMENT = "Equipment";

    /**
     * 设备型号.
     */
    public static final String PARAM_EQUIPMENT_MODEL_NUMBER = "ModelNubmer";


    /**
     * 操作.
     */
    public static final String OPERATION = "Operation";

    /**
     * 取值操作.
     */
    public static final String OPERATION_GETVALUE = "getValue";

    /**
     * 初始化操作.
     */
    public static final String OPERATION_INITINSTANCE = "InitInstance";

    /**
     * 设置操作.
     */
    public static final String OPERATION_SETVALUE = "setValue";

    /**
     * 批量取值操作.
     */
    public static final String OPERATION_GETVALUESBATCH = "getValuesBatch";

    /**
     * 管理对象助手类.
     */
    public static final String ASSISTANT_JAVA_CLASS_PATH = "cn.com.ruijie.ssc.netinsight.server.collector.impl.collectors.extend.object.";

    /**
     * 管理对象助手类后缀.
     */
    public static final String ASSISTANT_JAVA_CLASS_SUFFIX = "Assistant";


    /**
     * 取值操作.
     */
    public static final int Operation_GET = 0;

    /**
     * 设置操作.
     */
    public static final int Operation_SET = 1;
}
