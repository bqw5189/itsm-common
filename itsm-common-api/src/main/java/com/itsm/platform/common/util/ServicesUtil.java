package com.itsm.platform.common.util;

/**
 * 服务工具类.
 */
public class ServicesUtil {
//
//    /**
//     * The Constant JNDIDEFAULTPORT.
//     */
//    private final static int JNDIDEFAULTPORT = 1099;
//    /**
//     * The context.
//     */
//    private static Context context = null;
//
//    /**
//     * Inits the context.
//     */
//    private synchronized static void initContext() {
//        if (context == null) { // 如果已经被初始化,就不用再执行初始化的过程�???
//            try {
//
//                context = new InitialContext();
//            } catch (NamingException e) {
////				e.printStackTrace();
//                context = null;
//            }
//        }
//    }
//
//    /**
//     * 获取管理对象模块服务对象.
//     *
//     * @param JNDIHost JNDI服务器信息
//     *
//     * @return 管理对象模块服务对象
//     */
////	public static ManagedObjectService getInfoModelServiceOnce(String JNDIHost) {
////		return getInfoModelServiceOnce(JNDIHost, JNDIDEFAULTPORT);
////	}
//
//    /**
//     * 获取管理对象模块服务对象.
//     *
//     * @param JNDIHost JNDI服务器信息
//     * @param JNDIPort JNDI服务器端口
//     *
//     * @return 管理对象模块服务对象
//     */
////	public static ManagedObjectService getInfoModelServiceOnce(
////			String JNDIHost, int JNDIPort) {
////		ManagedObjectService infoModel = null;
////		Context context = getContextOnce(JNDIHost, JNDIPort);
////		if (context != null) {
////			try {
////				infoModel = (ManagedObjectService) context
////						.lookup(ServiceConstraints.ManagedObjectServiceName);
////			} catch (Exception e) {
////				e.printStackTrace();
////			} finally {
////
////				try {
////					context.close();
////				} catch (NamingException e) {
////					e.printStackTrace();
////				}
////			}
////		}
////		return infoModel;
////	}
//
//    /**
//     * 返回管理对象模块服务.
//     *
//     * @return 管理对象模块服务
//     */
//    public static ManagedObjectService getManagedObjectService() {
//        ManagedObjectService infoModel = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            infoModel = (ManagedObjectService) context
//                    .lookup(ServiceConstraints.ManagedObjectServiceName);
//        } catch (Exception e) {
////			e.printStackTrace();
//        }
//
//        return infoModel;
//    }
//
//    /**
//     * 获取报表模块服务.
//     *
//     * @param JNDIHost JNDI服务器信息
//     *
//     * @return t报表模块服务
//     */
////	public static ReportService getReportServiceOnce(String JNDIHost) {
////		return getReportServiceOnce(JNDIHost, JNDIDEFAULTPORT);
////	}
//
//    /**
//     * 获取报表模块服务.
//     *
//     * @param JNDIHost JNDI服务器信息
//     * @param JNDIPort JNDI服务器端口
//     *
//     * @return 报表模块服务
//     */
////	public static ReportService getReportServiceOnce(String JNDIHost,
////			int JNDIPort) {
////		ReportService report = null;
////		Context context = getContextOnce(JNDIHost, JNDIPort);
////		if (context != null) {
////			try {
////				report = (ReportService) context
////						.lookup(ServiceConstraints.ReportServiceName);
////			} catch (Exception e) {
////				e.printStackTrace();
////			} finally {
////				try {
////					context.close();
////				} catch (NamingException e) {
////					e.printStackTrace();
////				}
////			}
////		}
////		return report;
////	}
//
//    /**
//     * 获取报表模块服务.
//     *
//     * @return 报表模块服务
//     */
//    public static ReportService getReportService() {
//        ReportService report = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            report = (ReportService) context.lookup(ServiceConstraints.ReportServiceName);
//        } catch (Exception e) {
////			e.printStackTrace();
//        } finally {
//
//        }
//
//        return report;
//    }
//
//    /**
//     * 获取日志管理模块服务.
//     *
//     * @param JNDIHost JNDI服务器信息
//     *
//     * @return 管理对象模块服务
//     */
////	public static LogManagementService getSystemServiceOnce(String JNDIHost) {
////		return getSystemServiceOnce(JNDIHost, JNDIDEFAULTPORT);
////	}
//
//    /**
//     * 获取日志管理模块服务.
//     *
//     * @param JNDIHost JNDI服务器信息
//     * @param JNDIPort JNDI服务器端口
//     *
//     * @return 日志管理模块服务
//     */
////	public static LogManagementService getSystemServiceOnce(String JNDIHost,
////			int JNDIPort) {
////		LogManagementService system = null;
////		Context context = getContextOnce(JNDIHost, JNDIPort);
////		if (context != null) {
////			try {
////				system = (LogManagementService) context
////						.lookup(ServiceConstraints.LogManagementServiceName);
////			} catch (Exception e) {
////				e.printStackTrace();
////			} finally {
////				try {
////					context.close();
////				} catch (NamingException e) {
////					e.printStackTrace();
////				}
////			}
////		}
////
////		return system;
////	}
//
//    /**
//     * 获取日志管理模块服务.
//     *
//     * @return 日志管理模块服务
//     */
//    public static LogManagementService getSystemService() {
//        LogManagementService system = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            system = (LogManagementService) context.lookup(ServiceConstraints.LogManagementServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return system;
//    }
//
//    /**
//     * 获取用户管理模块服务.
//     *
//     * @return 日志管理模块服务
//     */
//    public static UserManageService getUserManageService() {
//        UserManageService system = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            system = (UserManageService) context.lookup(ServiceConstraints.UserManageServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return system;
//    }
//
//    public static LogManagementService getLogManageService() {
//        LogManagementService log = null;
//        if (context == null)
//            initContext();
//
//        try {
//            log = (LogManagementService) context.lookup(ServiceConstraints.LogManagementServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return log;
//    }
//
//    /**
//     * Gets the alarm service once.
//     *
//     * @param JNDIHost the jNDI host
//     *
//     * @return the alarm service once
//     */
////	public static FaultService getAlarmServiceOnce(String JNDIHost) {
////		return getAlarmServiceOnce(JNDIHost, JNDIDEFAULTPORT);
////	}
//
//    /**
//     * Gets the alarm service once.
//     *
//     * @param JNDIHost the jNDI host
//     * @param JNDIPort the jNDI port
//     *
//     * @return the alarm service once
//     */
////	public static FaultService getAlarmServiceOnce(String JNDIHost, int JNDIPort) {
////		String host = JNDIHost;
////		int port = JNDIPort;
////		if (host == null || host.equalsIgnoreCase("")) {
////			host = "127.0.0.1";
////		}
////		if (port <= 0) {
////			port = JNDIDEFAULTPORT;
////		}
////		FaultService alarm = null;
////		Context context = getContextOnce(JNDIHost, JNDIPort);
////		if (context != null) {
////			try {
////				alarm = (FaultService) context.lookup(ServiceConstraints.FaultServiceName);
////			} catch (Exception e) {
////				e.printStackTrace();
////			} finally {
////				try {
////					context.close();
////				} catch (NamingException e) {
////					e.printStackTrace();
////				}
////			}
////
////		}
////
////		return alarm;
////
////	}
//
//    /**
//     * 获取故障模块服务.
//     *
//     * @return 故障模块服务
//     */
//    public static FaultService getFaultService() {
//        FaultService alarm = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            alarm = (FaultService) context.lookup(ServiceConstraints.FaultServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return alarm;
//    }
//
//    /**
//     * 获取指定IP地址RIIL故障模块服务.
//     *
//     * @return 故障模块服务
//     */
//    public static FaultService getFaultService(String host) {
//        FaultService alarm = null;
//
//        Context context = getContextOnce(host, 1099);
//
//        if (context != null) {
//            try {
//                alarm = (FaultService) context
//                        .lookup(ServiceConstraints.FaultServiceName);
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    context.close();
//                } catch (NamingException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        return alarm;
//    }
//
//    public static DeviceManageService getDeviceManagerService(String host) {
//        DeviceManageService alarm = null;
//
//        Context context = getContextOnce(host, 1099);
//
//        if (context != null) {
//            try {
//                alarm = (DeviceManageService) context
//                        .lookup(ServiceConstraints.DeviceManageServiceName);
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    context.close();
//                } catch (NamingException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//
//        return alarm;
//    }
//
//    /**
//     * 获取设备管理模块服务.
//     *
//     * @return 设备管理模块服务
//     */
//    public static DeviceManageService getDeviceManageService() {
//        DeviceManageService alarm = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            alarm = (DeviceManageService) context.lookup(ServiceConstraints.DeviceManageServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return alarm;
//    }
//
//    public static DataAggregationService getDataAggregationService() {
//        DataAggregationService daService = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            daService = (DataAggregationService) context.lookup(ServiceConstraints.DataAggregationService);
//        } catch (Exception e) {
//
//        }
//
//        return daService;
//    }
//
//    /**
//     * Gets the perf service once.
//     *
//     * @param JNDIHost the jNDI host
//     *
//     * @return the perf service once
//     */
////	public static PerformanceService getPerfServiceOnce(String JNDIHost) {
////		return getPerfServiceOnce(JNDIHost, JNDIDEFAULTPORT);
////	}
//
//    /**
//     * Gets the perf service once.
//     *
//     * @param JNDIHost the jNDI host
//     * @param JNDIPort the jNDI port
//     *
//     * @return the perf service once
//     */
////	public static PerformanceService getPerfServiceOnce(String JNDIHost,
////			int JNDIPort) {
////		PerformanceService perf = null;
////		Context context = getContextOnce(JNDIHost, JNDIPort);
////		if (context != null) {
////			try {
////				perf = (PerformanceService) context.lookup(ServiceConstraints.PerformanceServiceName);
////			} catch (Exception e) {
////				e.printStackTrace();
////			} finally {
////				try {
////					context.close();
////				} catch (NamingException e) {
////					e.printStackTrace();
////				}
////			}
////		}
////
////		return perf;
////	}
//
//    /**
//     * 获取性能模块服务.
//     *
//     * @return 性能模块服务
//     */
//    public static PerformanceService getPerfService() {
//        PerformanceService perf = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            perf = (PerformanceService) context.lookup(ServiceConstraints.PerformanceServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return perf;
//    }
//
//    /**
//     * 获取指定IP地址RIIL性能模块服务.
//     *
//     * @return 性能模块服务.
//     */
//    public static PerformanceService getPerfService(String host) {
//        PerformanceService perf = null;
//
//        Context context = getContextOnce(host, 1099);
//
//        if (context != null) {
//            try {
//                perf = (PerformanceService) context
//                        .lookup(ServiceConstraints.PerformanceServiceName);
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    context.close();
//                } catch (NamingException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        return perf;
//    }
//    /**
//     * Gets the topo service once.
//     *
//     * @param JNDIHost the jNDI host
//     *
//     * @return the topo service once
//     */
////	public static TopologyService getTopoServiceOnce(String JNDIHost) {
////		return getTopoServiceOnce(JNDIHost, JNDIDEFAULTPORT);
////	}
//
//    /**
//     * Gets the topo service once.
//     *
//     * @param JNDIHost the jNDI host
//     * @param JNDIPort the jNDI port
//     *
//     * @return the topo service once
//     */
////	public static TopologyService getTopoServiceOnce(String JNDIHost,
////			int JNDIPort) {
////		TopologyService topo = null;
////		Context context = getContextOnce(JNDIHost, JNDIPort);
////		if (context != null) {
////			try {
////				topo = (TopologyService) context.lookup(ServiceConstraints.TopologyServiceName);
////			} catch (Exception e) {
////				e.printStackTrace();
////			} finally {
////				try {
////					context.close();
////				} catch (NamingException e) {
////					e.printStackTrace();
////				}
////			}
////		}
////		return topo;
////	}
//
//    /**
//     * 获取拓扑模块服务.
//     *
//     * @return 拓扑模块服务
//     */
//    public static TopologyService getTopoService() {
//        TopologyService topo = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            topo = (TopologyService) context.lookup(ServiceConstraints.TopologyServiceName);
//        } catch (Exception e) {
////			e.printStackTrace();
//        }
//
//        return topo;
//    }
//
//    /**
//     * Gets the view service once.
//     *
//     * @param JNDIHost the jNDI host
//     *
//     * @return the view service once
//     */
////	public static TopologyViewService getViewServiceOnce(String JNDIHost) {
////		return getViewServiceOnce(JNDIHost, JNDIDEFAULTPORT);
////	}
//
//    /**
//     * Gets the view service once.
//     *
//     * @param JNDIHost the jNDI host
//     * @param JNDIPort the jNDI port
//     *
//     * @return the view service once
//     */
////	public static TopologyViewService getViewServiceOnce(String JNDIHost,
////			int JNDIPort) {
////		TopologyViewService view = null;
////		Context context = getContextOnce(JNDIHost, JNDIPort);
////		if (context != null) {
////			try {
////				view = (TopologyViewService) context.lookup(ServiceConstraints.TopologyViewServiceName);
////			} catch (Exception e) {
////				e.printStackTrace();
////			} finally {
////				try {
////					context.close();
////				} catch (NamingException e) {
////					e.printStackTrace();
////				}
////			}
////		}
////		return view;
////	}
//
//    /**
//     * 获取视图模块服务.
//     *
//     * @return 视图模块服务
//     */
//    public static TopologyViewService getViewService() {
//        TopologyViewService view = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            view = (TopologyViewService) context.lookup(ServiceConstraints.TopologyViewServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return view;
//    }
//
//    /**
//     * Gets the collector info adapter service once.
//     *
//     * @param JNDIHost the jNDI host
//     *
//     * @return the collector info adapter service once
//     */
////	public static CollectorDispatcherService getCollectorInfoAdapterServiceOnce(
////			String JNDIHost) {
////		return getCollectorInfoAdapterServiceOnce(JNDIHost, JNDIDEFAULTPORT);
////	}
//
//    /**
//     * Gets the collector info adapter service once.
//     *
//     * @param JNDIHost the jNDI host
//     * @param JNDIPort the jNDI port
//     *
//     * @return the collector info adapter service once
//     */
////	public static CollectorDispatcherService getCollectorInfoAdapterServiceOnce(
////			String JNDIHost, int JNDIPort) {
////		CollectorDispatcherService collectorInfo = null;
////		Context context = getContextOnce(JNDIHost, JNDIPort);
////		if (context != null) {
////			try {
////				collectorInfo = (CollectorDispatcherService) context
////						.lookup(ServiceConstraints.CollectorDispatcherServiceName);
////			} catch (Exception e) {
////				e.printStackTrace();
////			} finally {
////				try {
////					context.close();
////				} catch (NamingException e) {
////					e.printStackTrace();
////				}
////			}
////		}
////		return collectorInfo;
////
////	}
//
//    /**
//     * 获取网管工具模块服务.
//     *
//     * @return 网管工具模块服务
//     */
//    public static NetManageToolsService getNetManageToolsService() {
//        NetManageToolsService collectorInfo = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            collectorInfo = (NetManageToolsService) context
//                    .lookup(ServiceConstraints.NetManageToolsService);
//        } catch (Exception e) {
////			e.printStackTrace();
//        }
//
//        return collectorInfo;
//    }
//
//    /**
//     * 获取采集器调度器模块服务.
//     *
//     * @return 采集器调度器模块服务
//     */
//    public static CollectorDispatcherService getCollectorInfoAdapterService() {
//        CollectorDispatcherService collectorInfo = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            collectorInfo = (CollectorDispatcherService) context
//                    .lookup(ServiceConstraints.CollectorDispatcherServiceName);
//        } catch (Exception e) {
////			e.printStackTrace();
//        }
//
//        return collectorInfo;
//    }
//
//    /**
//     * Gets the collector info adapter service by name.
//     *
//     * @param JNDIHost        the jNDI host
//     * @param AdapterJNDIName the adapter jndi name
//     * @return the collector info adapter service by name
//     */
//    public static CollectorDispatcherService getCollectorInfoAdapterServiceByName(
//            String JNDIHost, String AdapterJNDIName) {
//        return getCollectorInfoAdapterServiceByName(JNDIHost, JNDIDEFAULTPORT,
//                AdapterJNDIName);
//    }
//
//    /**
//     * Gets the collector info adapter service by name.
//     *
//     * @param JNDIHost        the jNDI host
//     * @param JNDIPort        the jNDI port
//     * @param AdapterJNDIName the adapter jndi name
//     * @return the collector info adapter service by name
//     */
//    public static CollectorDispatcherService getCollectorInfoAdapterServiceByName(
//            String JNDIHost, int JNDIPort, String AdapterJNDIName) {
//        CollectorDispatcherService collectorInfo = null;
//        Context context = getContextOnce(JNDIHost, JNDIPort);
//        if (context != null) {
//            try {
//                collectorInfo = (CollectorDispatcherService) context
//                        .lookup(AdapterJNDIName);
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    context.close();
//                } catch (NamingException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return collectorInfo;
//    }
//
//    /**
//     * 获取指定JNDI名称的采集器调度器服务.
//     *
//     * @param JNDIName 采集器调度服务的JNDI名
//     * @return 采集器调度服务
//     */
//    public static CollectorDispatcherService getCollectorInfoAdapterServiceByName(
//            String JNDIName) {
//        CollectorDispatcherService collectorInfo = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            collectorInfo = (CollectorDispatcherService) context.lookup(JNDIName);
//        } catch (Exception e) {
//
//        }
//
//        return collectorInfo;
//    }
//
//
//    /**
//     * Gets the config service once.
//     *
//     * @param JNDIHost the jNDI host
//     *
//     * @return the config service once
//     */
////	public static ConfigService getConfigServiceOnce(String JNDIHost) {
////		return getConfigServiceOnce(JNDIHost, JNDIDEFAULTPORT);
////	}
//
//    /**
//     * Gets the config service once.
//     *
//     * @param JNDIHost the jNDI host
//     * @param JNDIPort the jNDI port
//     *
//     * @return the config service once
//     */
////	public static ConfigService getConfigServiceOnce(String JNDIHost,
////			int JNDIPort) {
////		ConfigService config = null;
////		Context context = getContextOnce(JNDIHost, JNDIPort);
////		if (context != null) {
////			try {
////				config = (ConfigService) context.lookup(ServiceConstraints.ConfigServiceName);
////			} catch (Exception e) {
////				e.printStackTrace();
////			} finally {
////				try {
////					context.close();
////				} catch (NamingException e) {
////					e.printStackTrace();
////				}
////			}
////		}
////
////		return config;
////
////	}
//
//    /**
//     * 获取配置模块服务.
//     *
//     * @return 配置模块服务
//     */
//    public static ConfigService getConfigService() {
//        ConfigService config = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            config = (ConfigService) context.lookup(ServiceConstraints.ConfigServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return config;
//    }
//
//    /**
//     * 获取采集器工厂
//     *
//     * @return 采集器工厂引用
//     */
//    public static CollectorFactory getCollectorFactory() {
//        CollectorFactory config = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            config = (CollectorFactory) context.lookup(ServiceConstraints.CollectorFactoryName);
//        } catch (Exception e) {
//
//        }
//
//        return config;
//    }
//
//    /**
//     * 获取外部事件管理模块服务.
//     *
//     * @return 外部事件管理模块服务
//     */
//    public static EternalEventManageService getEternalEventManageService() {
//        EternalEventManageService config = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            config = (EternalEventManageService) context.lookup(ServiceConstraints.EthernalEventManageServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return config;
//    }
//
//    public static AppHealthmonService getAppHealthmonService() {
//        AppHealthmonService config = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            config = (AppHealthmonService) context.lookup(ServiceConstraints.AppHealthMonServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return config;
//    }
//
//    public static ApplicationMonitorService getAppMonitorService() {
//        ApplicationMonitorService config = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            config = (ApplicationMonitorService) context.lookup(ServiceConstraints.AppMonitorServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return config;
//    }
//
//
//    /**
//     * 得到公共的初始化接口类
//     * --add by 20101124
//     *
//     * @param jndiName jndi服务名
//     * @return
//     * @author XuChao
//     */
//    public static CommonStartService getStartCommonService(String jndiName) {
//        CommonStartService config = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            config = (CommonStartService) context.lookup(jndiName);
//        } catch (Exception e) {
//
//        }
//
//        return config;
//    }
//
//
//    /**
//     * 获取进程组管理模块服务
//     * --add by 20101124
//     *
//     * @return
//     * @author XuChao
//     */
//    public static ProcessGroupService getProcessGroupService() {
//        ProcessGroupService config = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            config = (ProcessGroupService) context.lookup(ServiceConstraints.ProcessGroupServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return config;
//    }
//
////	public static  getAppMonitorService() {
////		ApplicationMonitorService config = null;
////
////		if (context == null)
////			initContext();
////
////		try {
////			config = (ApplicationMonitorService) context.lookup(ServiceConstraints.AppMonitorServiceName);
////		} catch (Exception e) {
////
////		}
////
////		return config;
////	}
////
//
//
//    public static AsynMsgManageService getAsynMsgManageService() {
//        AsynMsgManageService asynMsg = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            asynMsg = (AsynMsgManageService) context.lookup(ServiceConstraints.AsynMsgManageServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return asynMsg;
//    }
//
//    public static DogLicenseService getDogLicenseService() {
//        DogLicenseService dog = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            dog = (DogLicenseService) context.lookup(ServiceConstraints.DogLicenseServiceName);
//        } catch (Exception e) {
//
//        }
//
//        return dog;
//    }
//
//    /**
//     * 获取JNDI上下文.
//     *
//     * @return JNDI上下文信息
//     */
//    public static Context getContext() {
//        if (context == null) {
//            initContext();
//        }
//
//        return context;
//
//    }
//
//    /**
//     * 获取指定JNDI服务器地址的上下文.
//     *
//     * @param IP JNDI服务器地址
//     * @return 上下文信息
//     */
//    public static Context getContextOnce(String IP) {
//        return getContextOnce(IP, JNDIDEFAULTPORT);
//    }
//
//    /**
//     * 获取指定JNDI服务器地址和端口的上下文信息.
//     *
//     * @param IP   JNDI服务器地址
//     * @param port JNDI服务端口
//     * @return 上下文信息
//     */
//    public static Context getContextOnce(String IP, int port) {
//
//        Context context = null;
//        if (IP != null && !IP.equalsIgnoreCase("")) {
//            try {
//                Properties env = new Properties();
//                env.put("java.naming.factory.initial",
//                        "org.jnp.interfaces.NamingContextFactory");
//                String hostString = "jnp://" + IP + ":" + port;
//                env.put("java.naming.provider.url", hostString);
//                env.put("java.naming.factory.url.pkgs",
//                        "org.jboss.naming:org.jnp.interfaces");
//
//                context = new InitialContext(env);
////				context = new InitialContext();
//            } catch (NamingException e) {
////				e.printStackTrace();
//                context = null;
//            }
//        }
//        return context;
//    }
//
//    /**
//     * 获取分级管理模块服务.
//     *
//     * @return 设备管理模块服务
//     */
//    public static MultilevelManageService getMultilevelService() {
//        MultilevelManageService multilevelService = null;
//
//        if (context == null)
//            initContext();
//
//        try {
//            multilevelService = (MultilevelManageService) context.lookup(ServiceConstraints.MULTILEVELSERVICENAME);
//        } catch (Exception e) {
//
//        }
//
//        return multilevelService;
//    }
//
//    /**
//     * 获取指定ip的RIIL分级管理模块的服务
//     *
//     * @param host 指定RIIL的ip
//     * @return 分级管理模块的服务
//     */
//    public static MultilevelManageService getMultilevelService(String host) {
//        MultilevelManageService multilevelService = null;
//
//        Context context = getContextOnce(host, 1099);
//
//        if (context != null) {
//            try {
//                multilevelService = (MultilevelManageService) context
//                        .lookup(ServiceConstraints.MULTILEVELSERVICENAME);
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    context.close();
//                } catch (NamingException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        return multilevelService;
//    }

}