package com.itsm.platform.common.constraints;

/**
 * 服务信息常量表.
 */
public class ServiceConstraints {

    /**
     * 管理对象模块名.
     */
    public final static String ManagedObjectServiceName = "itsm-platform:/ssc/ManagedObjectService";

    /**
     * 报表模块名.
     */
    public final static String ReportServiceName = "itsm-platform:/ssc/ReportService";

    /**
     * 日志管理模块名.
     */
    public final static String LogManagementServiceName = "itsm-platform:/ssc/LogManagementService";

    /**
     * 故障模块名.
     */
    public final static String FaultServiceName = "itsm-platform:/ssc/FaultService";

    /**
     * 性能模块名.
     */
    public final static String PerformanceServiceName = "itsm-platform:/ssc/PerfService";

    /**
     * 拓扑模块名.
     */
    public final static String TopologyServiceName = "itsm-platform:/ssc/TopologyService";

    /**
     * 视图模块名.
     */
    public final static String TopologyViewServiceName = "itsm-platform:/ssc/TopologyViewService";

    /**
     * 采集器调度模块名.
     */
    public final static String CollectorDispatcherServiceName = "itsm-platform:/ssc/CollectorDispatcherService";

    /**
     * 配置模块名.
     */
    public final static String ConfigServiceName = "itsm-platform:/ssc/ConfigurationService";

    /**
     * 用户管理模块名.
     */
    public final static String UserManageServiceName = "itsm-platform:/ssc/UserManageService";

    /**
     * 设备配置文件管理模块名.
     */
    public final static String DeviceConfManageServiceName = "itsm-platform:/ssc/DeviceConfManageService";

    /**
     * 外部事件管理模块名.
     */
    public final static String EthernalEventManageServiceName = "itsm-platform:/ssc/EthernalEventManageService";

    /**
     * 网管工具模块名.
     */
    public final static String NetManageToolsService = "itsm-platform:/ssc/NetManageToolsService";

    /**
     * 设备管理模块名.
     */
    public final static String DeviceManageServiceName = "itsm-platform:/ssc/DeviceManageServiceName";

    /**
     * 数据汇聚模块名.
     */
    public final static String DataAggregationService = "itsm-platform:/ssc/DataAggregationService";

    /**
     * 应用管理模块名.
     */
    public final static String AppMonitorServiceName = "itsm-platform:/ssc/AppMonitorService";

    /**
     * 进程组模块名  --add by xuchao(20101102)
     */
    public final static String ProcessGroupServiceName = "itsm-platform:/ssc/ProcessGroupService";

    /**
     * 异步事件管理模块.
     */
    public final static String AsynMsgManageServiceName = "itsm-platform:/ssc/AsynMsgManageService";

    public final static String SecurityDomainManageServiceName = "itsm-platform:/ssc/SecurityDomainManageService";

    public final static String AppHealthMonServiceName = "itsm-platform:/ssc/AppHealthMonService";

    public final static String IntegrationManageServiceName = "itsm-platform:/ssc/IntegrationManageService";

    /**
     * 采集器工厂名.
     */
    public static final String CollectorFactoryName = "COLLECTOR";

    /**
     * 系统定时器服务名.
     */
    public static final String SystemTimerServiceName = "SystemTimerServiceBean";

    /**
     * 性能数据压缩定时器名.
     */
    public static final String PerfCompressDataTimerServiceName = "DellCompressDataBean";

    /**
     * 实时定时器名.
     */
    public static final String HeartBeatTimerServiceName = "RealTimerServiceBean";

    public static final String ExportPerformanceTimerServiceName = "PerfExportTimmingServiceBean";
    /**
     * 性能采集任务定时器名.
     */
    public static final String PerfCollectingTaskTimerServiceName = "TimerServiceBean";

    /**
     * 报表定时器名.
     */
    public static final String StatReportTimerServiceName = "TransferDataBean";

    public static final String DogLicenseServiceName = "itsm-platform:/ssc/DogLicenseService";


    /**
     * 配置定时器名.
     */
    public static final String CONFIG_TIMER_SERVICE = "itsm-platform:/netinsight/ConfigTimerService";

    /**
     * 分级网管模块名.
     */
    public static final String MULTILEVELSERVICENAME = "itsm-platform:/ssc/MultilevelService";

    /**
     * 管理对象服务对象名.
     */
    public static final String ManagedObjectServiceObjectName = "jboss.j2ee:jar=managedobject.jar,name=ManagedObjectSessionBean,service=EJB3";

    /**
     * 设备管理服务对象名.
     */
    public static final String DeviceManageServiceObjectName = "jboss.j2ee:jar=DeviceManageSessionBeanService.jar,name=DeviceManageSessionBean,service=EJB3";

}
