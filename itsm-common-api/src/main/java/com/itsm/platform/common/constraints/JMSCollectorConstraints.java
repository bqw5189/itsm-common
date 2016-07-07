package com.itsm.platform.common.constraints;

/**
 * JMS常量表.
 */
public class JMSCollectorConstraints {

    /**
     * 消息目标类型.
     */
    public static final String ActivationConfigPropertyName_DestinationType = "destinationType";

    /**
     * Topic类名.
     */
    public static final String ActivationConfigPropertyValue_Topic = "javax.jms.Topic";

    /**
     * 目标.
     */
    public static final String ActivationConfigPropertyName_Destination = "destination";


    /**
     * 默认队列名.
     */
    public static final String DestinationName_Default = "topic/bmcTopic";

    /**
     * 配置实用的队列名.
     */
    public static final String DestinationName_Topic_For_Polling = "topic/bmcTopicForConfig";

    public static final String DestinationName_Topic_AsynBmc = "topic/asynBmcTopic";

    /**
     * 测试用队列名（Topic）.
     */
    public static final String Destinationname_Topic_Test = "topics/test";

    /**
     * 测试用队列名（Queue）.
     */
    public static final String Destinationname_Queue_Test = "queue/test";

    /**
     * IPMAC绑定功能使用队列名.
     */
    public static final String Destinationname_Topic_IPMACTopic = "topic/IPMACTopic";

    /**
     * 测试用队列名.
     */
    public static final String Destinationname_Topic_TestTopic = "topic/testTopic";

    /**
     * 告警模块使用队列名.
     */
    public static final String Destinationname_Topic_ForFault = "topic/bmcTopicForAlarm";

    /**
     * 扩展队列名.
     */
    public static final String Destinationname_Topic_ExtendTopic = "topic/bmcExtendTopic";

    /**
     * 连接工厂名.
     */
    public static final String ConnectionFactoryName_Default = "ConnectionFactory";
//	public static final String ConnectionFactoryName_Default = "java:/JmsXA";

    public static final String ConnectionFactoryName_XA = "java:/JmsXA";
    public static final String ConnectionFactoryName_MQ = "ConnectionFactory";


    /**
     * 原始告警类型.
     */
    public static final String JMSType_Alarm_Original = "alarm_original";

    /**
     * 视图告警类型.
     */
    public static final String JMSType_View_Alarm = "view_alarm";

    /**
     * 前台告警类型.
     */
    public static final String JMSType_Alarm_Web = "alarm_web";

    /**
     * 告警处理器告警类型.
     */
    public static final String JMSType_Fault_Handling = "alarm_handling";

    /**
     * 发现告警类型.
     */
    public static final String JMSType_Discovery = "discovery";

    /**
     * 轮询告警类型.
     */
    public static final String JMSType_PollingObject_MSG = "PollingInstance";

    /**
     * 可用性轮询告警类型.
     */
    public static final String JMSType_Accessibility_Polling_Tsk_MSG = "PollingAvailabilityTasks";


    /**
     * 创建管理对象告警类型.
     */
    public static final String JMSType_ManagedObject_Created = "InfoInstancesCreated";

    /**
     * 删除管理对象告警类型.
     */
    public static final String JMSType_ManagedObject_Deleted = "InfoInstancesDeleted";

    /**
     * 修改管理对象告警类型.
     */
    public static final String JMSType_ManagedObject_Adjusted = "InfoInstancesUpdated";

    /**
     * 管理对象彻底删除告警类型.
     */
    public static final String JMSType_ManagedObject_Deleted_Assuredly = "RealInfoInstancesDeleted";

    /**
     * 进程删除告警类型.
     */
    public static final String JMSType_Process_Deleted = "SoftwareChangedNeIds";

    /**
     * 进程状态改变告警类型.
     */
    public static final String JMSType_Collector_Adjusted = "ProtocolModified";

    /**
     * 采集器删除告警类型.
     */
    public static final String JMSType_Collector_Deleted = "ProtocolDeleted";

    /**
     * 采集器告警类型.
     */
    public static final String JMSType_CollectorDispatcher_MSG = "Adapter";

    /**
     * 性能告警类型.
     */
    public static final String JMSType_Performance_MSG = "PERF";

    /**
     * 实时告警类型.
     */
    public static final String JMSType_Real_MSG = "REAL";

    /**
     * 视图性能告警类型.
     */
    public static final String JMSType_View_Performance = "view_perf";

    /**
     * 缓存更新告警类型.
     */
    public static final String JMSType_UpdateCache = "UpdateCache";

    /**
     * 任务删除告警类型.
     */
    public static final String JMSType_DeleteTask = "DeleteTask";

    /**
     * IPMac绑定告警类型.
     */
    public static final String JMSType_IpMacPort = "IpMacPort";

    /**
     * 模型创建告警类型.
     */
    public static final String JMSType_MObjectModel_Created = "InfoClassCreated";

    /**
     * 模型修改告警类型.
     */
    public static final String JMSType_MObjectModel_Adjusted = "InfoClassUpdated";

    /**
     * 模型删除告警类型.
     */
    public static final String JMSType_MObjectModel_Deleted = "InfoClassRemoved";

    /**
     * 网元创建告警类型.
     */
    public static final String JMSType_NetElement_Created = "NetElmentCreated";

    /**
     * 网元删除告警类型.
     */
    public static final String JMSType_NetElement_Deleted = "NetElementRemoved";


    /**
     * 接口创建告警类型.
     */
    public static final String JMSType_Port_Created = "PortCreated";

    /**
     * 接口删除告警类型.
     */
    public static final String JMSType_Port_Deleted = "PortRemoved";


    /**
     * 新增链路告警.
     */
    public static final String JMSType_Link_Created = "createLink";

    /**
     * 删除链路告警.
     */
    public static final String JMSType_Link_Deleted = "delLink";

    /**
     * 链路更新告警.
     */
    public static final String JMSType_Link_Updated = "upLink";

    /**
     * 接口索引更新告警.
     */
    public static final String JMSType_Interface_Index_Update = "DEVICE_UPDATED";
    /**
     * 视图布局发生变化操作.
     */
    public static final String JMSType_View_Layout_Alter = "viewLayoutAlter";

    /**
     * 视图资源发生变化.
     */
    public static final String JMSType_View_Resource_Alter = "viewResourceAlter";

    public static final String JMSType_FreshData = "FreshDataMessage";

    public static final String JMSType_Detection_Start = "topo_detection_start";

    public static final String JMSType_Detection_End = "topo_detection_end";

    public static final String JMSType_TOPO_DATA_CHANGE_FOR_HIERARCHY = "topo_data_change_for_hierarchy";


    /**
     * 视图ID.
     */
    public static final String JMSName_ViewId = "viewId";

    /**
     * 视图新增资源.
     */
    public static final String JMSName_AddedResourceIds = "addResourceIds";

    /**
     * 视图删除资源.
     */
    public static final String JMSName_DelResourcedIds = "delResourceIds";

    /**
     * 告警类型属性.
     */
    public static final String JMSName_Alarm_Web_TypeId = "typeId";

    /**
     * 告警分类属性.
     */
    public static final String JMSName_Alarm_Web_ClassId = "classId";

    /**
     * 源地址属性.
     */
    public static final String JMSName_Alarm_Web_SourceAddress = "sourceAddress";

    /**
     * 告警来源类型属性.
     */
    public static final String JMSName_Alarm_Web_SourceType = "sourceType";

    /**
     * 告警来源域属性.
     */
    public static final String JMSName_Alarm_Web_SourceDomain = "sourceDomain";

    /**
     * 告警附加地址属性.
     */
    public static final String JMSName_Alarm_Web_AttachAddress = "attachAddress";

    /**
     * 告警数量属性.
     */
    public static final String JMSName_Alarm_Web_Count = "count";

    /**
     * 告警状态属性.
     */
    public static final String JMSName_Alarm_Web_Status = "status";

    /**
     * 告警接受时间属性.
     */
    public static final String JMSName_Alarm_Web_ReceiveTime = "receiveTime";

    /**
     * 告警发生时间属性.
     */
    public static final String JMSName_Alarm_Web_OccurTime = "occurTime";

    public static final String JMSName_Alarm_Web_ResPriorty = "resPriority";

    /**
     * 是否历史告警属性.
     */
    public static final String JMSName_Alarm_Web_IsHisMsg = "isHisMsg";

    /**
     * 告警关联网元id属性.
     */
    public static final String JMSName_Alarm_Web_NeId = "neId";

    /**
     * 清除告警属性.
     */
    public static final String JMSName_Alarm_Web_Clean = "clean";

    /**
     * 告警详细信息属性.
     */
    public static final String JMSName_Alarm_Web_Detail = "detail";

    /**
     * 告警关联管理对象属性.
     */
    public static final String JMSName_Alarm_Web_ManagedObjectID = "infoInstanceId";

    /**
     * 自动升级告警属性.
     */
    public static final String JMSName_Alarm_Web_Auto = "auto";

    /**
     * 告警级别属性.
     */
    public static final String JMSName_Alarm_Web_LevelId = "levelId";

    /**
     * 父实例id属性.
     */
    public static final String JMSName_Alarm_Web_ParentIds = "parentIds";

    /**
     * 告警id属性.
     */
    public static final String JMSName_Alarm_Web_AlarmId = "alarmId";

    /**
     * 性能指标属性.
     */
    public static final String JMSName_Alarm_Web_ItemId = "itemId";

    /**
     * 升级操作关联管理对象id属性.
     */
    public static final String JMSName_Alarm_Web_UpgradeInfoInstanceIds = "upgradeInfoInstanceIds";

    /**
     * 清除操作关联管理对象属性.
     */
    public static final String JMSName_Alarm_Web_CleanInfoInstanceIds = "cleanInfoInstanceIds";

    /**
     * 升级告警属性.
     */
    public static final String JMSName_Alarm_Web_Upgrade = "upgrade";

    /**
     * 处理优先级.
     */
    public static final String JMSName_Alarm_Web_Priority = "Priority";

    /**
     * 自动升级.
     */
    public static final String JMSValue_Alarm_Web_Auto_1 = "1";

    /**
     * 没有关联管理对象.
     */
    public static final String JMSValue_Alarm_Web_ManagedObjectID_0 = "0";

    /**
     * 没有关联管理对象.
     */
    public static final String JMSValue_Alarm_Web_ManagedObjectID_N1 = "-1";

    /**
     * 没有关联管理对象.
     */
    public static final String JMSValue_Alarm_Web_managedObjectID_N2 = "-2";


    /**
     * 视图告警业务对象id属性.
     */
    public static final String JMSName_View_Alarm_Bid = "bid";

    /**
     * 视图告警级别属性.
     */
    public static final String JMSName_View_Alarm_LevelId = JMSName_Alarm_Web_LevelId;

    /**
     * 视图告警颜色属性.
     */
    public static final String JMSName_View_Alarm_AlarmColor = "alarmColor";

    /**
     * 视图告警id属性.
     */
    public static final String JMSName_View_Alarm_AlarmId = JMSName_Alarm_Web_AlarmId;

    /**
     * 视图告警性能指标属性.
     */
    public static final String JMSName_View_Alarm_ItemId = JMSName_Alarm_Web_ItemId;


    /**
     * 原始告警类型属性.
     */
    public static final String JMSName_Alarm_Original_TypeId = "typeId";

    /**
     * 原始告警关联管理对象实例id属性.
     */
    public static final String JMSName_Alarm_Original_MObjectId = "infoInstanceId";

    /**
     * 原始告警来源地址属性.
     */
    public static final String JMSName_Alarm_Original_SourceAddress = "sourceAddress";

    /**
     * 原始告警来源类型属性.
     */
    public static final String JMSName_Alarm_Original_SourceType = "sourceType";

    /**
     * 原始告警设备类型属性.
     */
    public static final String JMSName_Alarm_Original_NeCatory = "deviceType";

    /**
     * 原始告警来源域属性.
     */
    public static final String JMSName_Alarm_Original_SourceDomain = "sourceDomain";

    /**
     * 原始告警发生时间属性.
     */
    public static final String JMSName_Alarm_Original_OccurTime = "occurTime";

    /**
     * 原始告警附加地址属性.
     */
    public static final String JMSName_Alarm_Original_AttachAddress = "attachAddress";

    /**
     * 原始告警详细信息属性.
     */
    public static final String JMSName_Alarm_Original_Detail = "detail";

    /**
     * 原始告警Syslog属性.
     */
    public static final String JMSName_Alarm_Original_Syslog = "syslog";

    /**
     * 原始告警性能指标属性.
     */
    public static final String JMSName_Alarm_Original_TargetId = "itemId";

    /**
     * 原始告警级别属性.
     */
    public static final String JMSName_Alarm_Original_LevelId = "levelId";


    /**
     * 原始告警网元不可达类型.
     */
    public static final String JMSValue_Alarm_Original_TypeId_Inaccessible = "NeNotAccessible"; //设备不可管理

    /**
     * 原始告警网元可达类型.
     */
    public static final String JMSValue_Alarm_Original_TypeId_Accessible = "NeAccessible";//设备恢复为可管理

    /**
     * 原始告警设备掉线.
     */
    public static final String JMSValue_Alarm_Original_TypeId_NeOffline = "OfflineNe";//设备掉线
    /**
     * 原始告警设备上线.
     */
    public static final String JMSValue_Alarm_Original_TypeId_NeOnline = "OnlineNe";//设备掉线

    /**
     * 原始告警进程关闭类型.
     */
    public static final String JMSValue_Alarm_Original_TypeId_ProcessDown = "ProcessDown";

    /**
     * 原始告警进程重启类型.
     */
    public static final String JMSValue_Alarm_Original_TypeId_ProcessUp = "ProcessUp";

    /**
     * 原始告警WebLogic初始化类型.
     */
    public static final String JMSValue_Alarm_Original_TypeId_Weblogic_Startup = "WebLogic_Initializing";

    /**
     * 原始告警WebLogic挂起类型.
     */
    public static final String JMSValue_Alarm_Original_TypeId_WebLogic_Suspended = "WebLogic_Suspended";

    /**
     * 原始告警WebLogic关闭类型.
     */
    public static final String JMSValue_Alarm_Original_TypeId_WebLogic_ShutDown = "WebLogic_ShuttingDown";

    /**
     * 原始告警接口关闭类型.
     */
    public static final String JMSValue_Alarm_Original_TypeId_Interface_ShutDown = "ConfPortClose";

    /**
     * 原始告警接口在线类型.
     */
    public static final String JMSValue_Alarm_Original_TypeId_Interface_Online = "ConfPortOnLine";

    /**
     * 原始告警接口短线类型.
     */
    public static final String JMSValue_Alarm_Original_TypeId_Interface_Offline = "ConfPortOffLine";

    /**
     * 原始告警接口不可访问类型.
     */
    public static final String JMSValue_Alarm_Original_TypeId_Interface_Inactive = "ConfPortNotActive";


    /**
     * 采集事件指标名称属性.
     */
    public static final String JMSName_CollectingData_TargetValue = "itemValue";

    /**
     * 年采集属性.
     */
    public static final String JMSName_CollectingData_Year = "year";

    /**
     * 月采集属性.
     */
    public static final String JMSName_CollectingData_Month = "month";

    /**
     * 日采集属性.
     */
    public static final String JMSName_CollectingData_Day = "day";

    /**
     * 时采集属性.
     */
    public static final String JMSName_CollectingData_Hour = "hour";

    /**
     * 分钟采集属性.
     */
    public static final String JMSName_CollectingData_Minute = "minute";

    /**
     * 秒采集属性.
     */
    public static final String JMSName_CollectingData_Second = "second";

    /**
     * 采集状态属性.
     */
    public static final String JMSName_CollectingData_State = "state";

    /**
     * 采集关联的管理对象id属性.
     */
    public static final String JMSName_CollectingData_MObjectId = "instanceId";

    /**
     * 采集指标属性.
     */
    public static final String JMSName_CollectingData_TargetId = "itemId";


    /**
     * 流出率属性.
     */
    public static final String JMSName_View_Performance_OutFlowRatio = "OutFlowRatio";

    /**
     * 流入率属性.
     */
    public static final String JMSName_View_Performance_InFlowRatio = "InFlowRatio";

    /**
     * From属性.
     */
    public static final String JMSName_View_Performance_From = "From";

    /**
     * To属性.
     */
    public static final String JMSName_View_Performance_To = "To";


    /**
     * 任务id属性.
     */
    public static final String JMSName_DeleteTask_TaskId = "TaskId";


    /**
     * 网元id属性.
     */
    public static final String JMSName_Performance_NetElementId = "NetElementId";

    /**
     * IPMac绑定消息内容属性.
     */
    public static final String JMSName_IpMacPort_Message = "message";

    /**
     * IPMac绑定进度属性.
     */
    public static final String JMSName_IpMacPort_Progress = "progress";

    /**
     * 发现消息内容属性.
     */
    public static final String JMSName_Discovery_Message = "message";

    /**
     * 发现进度属性.
     */
    public static final String JMSName_Discovery_Progress = "progress";

    /**
     * 用户名属性.
     */
    public static final String USER = "guest";

    /**
     * 密码属性.
     */
    public static final String PASS = "guest";


}
