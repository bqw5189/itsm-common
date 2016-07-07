package com.itsm.platform.common.object;

import java.io.Serializable;
import java.util.Date;

/**
 * 日志工具类.
 */
public class Log implements Serializable {

    /**
     * 所有级别.
     */
    public static final int LEVEL_ALL = 0;

    /**
     * 调试级别.
     */
    public static final int LEVEL_DEBUG = 1;

    /**
     * 信息级别.
     */
    public static final int LEVEL_INFO = 2;//4

    /**
     * 告警级别.
     */
    public static final int LEVEL_WARN = 3;//6

    /**
     * 错误级别.
     */
    public static final int LEVEL_ERROR = 4;//2

    /**
     * 致命错误级别.
     */
    public static final int LEVEL_FATAL = 5;//3

    /**
     * 关闭日志输出.
     */
    public static final int LEVEL_OFF = 6;//5

    /**
     * The Constant levels.
     */
    private static final String[] levels = {"ALL", "DEBUG", "INFO", "WARN",
            "ERROR", "FATAL", "OFF"};

    /**
     * 系统类别的日志.
     */
    public static final int TYPE_SYSTEM = 0; //

    /**
     * 用户类别的日志.
     */
    public static final int TYPE_USER = 1; //

    /**
     * The Constant types.
     */
    private static final String[] types = {"SYSTEM", "USER"};

    /**
     * 操作成功.
     */
    public static final int RESULT_SUCCESS = 0; //

    /**
     * 操作失败.
     */
    public static final int RESULT_FAILURE = 1; //

    /**
     * 未知操作结果.
     */
    private static final int RESULT_UNKNOWN = -1; //

    /**
     * The Constant results.
     */
    private static final String results[] = {"SUCCESS", "FAILURE"};

    // 日志对象的属性
    /**
     * The time.
     */
    private Long time; // 描述日志创建的时间

    /**
     * The user name.
     */
    private String userName = "System"; // 描述执行操作的用户，后台进程写的日志信息可以使用System作为用户名称

    /**
     * The module name.
     */
    private String moduleName; //

    /**
     * The operation name.
     */
    private String operationName = null; // 操作名称，如果用户不设定操作名称，那么在打印信息中就不包括操作名信息

    /**
     * The operation result.
     */
    private int operationResult = Log.RESULT_UNKNOWN; // 操作结果，用户可以不设定操作结果，如果没有操作结果，在信息中就不打印结果

    /**
     * The description.
     */
    private String description; // 操作的描述，对于后台，如果用户不设定操作名称和结果，那么至少要设定描述信息

    /**
     * The type.
     */
    private int type = Log.TYPE_SYSTEM; // 日志类型,如果用户没有指定日志类型，那么类型为默认的系统类别

    /**
     * The level.
     */
    private int level = Log.LEVEL_ALL; // 日志级别

    //

    /**
     * 生成一条日志，专门用来创建后台服务的打印信息.
     *
     * @param message 日志内容
     * @param level   日志级别
     */
    public Log(String message, int level) {
        this.description = message;
        this.level = level;
        this.time = System.currentTimeMillis();
    }

    //

    /**
     * 生成详细的信息用来向系统模块的日志记录模块传递消息.
     *
     * @param operation   操作名
     * @param result      操作结果
     * @param description 描述
     * @param type        类型
     * @param level       级别
     * @param user        用户
     */
    public Log(String operation, int result, String description, int type,
               int level, String user) {
        if (user != null) // 如果指定
            this.userName = user;
        this.operationName = operation;
        this.operationResult = result;
        this.description = description;
        this.type = type;
        this.level = level;
        this.time = System.currentTimeMillis();
    }

    /**
     * 设置模块名.
     *
     * @param moduleName 模块名
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * _ jms string.
     *
     * @return the string
     */
    private String _JMSString() {
        StringBuffer resultBuffer = new StringBuffer();
        if (this.moduleName != null) {
            resultBuffer.append("<Module:").append(this.moduleName).append(">");
        }
        if (this.type >= 0 && this.type < Log.types.length)
            resultBuffer.append("<Type:").append(Log.types[this.type]).append(
                    ">");
        if (this.level >= 0 && this.level < Log.levels.length)
            resultBuffer.append("<Level:").append(Log.levels[this.level])
                    .append(">");
        if (this.userName != null)
            resultBuffer.append("<User:").append(this.userName).append(">");
        if (this.operationName != null)
            resultBuffer.append("<Operation:").append(this.operationName)
                    .append(">");
        if (this.operationResult >= 0
                && this.operationResult < Log.results.length)
            resultBuffer.append("<Result:").append(
                    Log.results[this.operationResult]).append(">");
        if (this.description != null)
            resultBuffer.append("<Description:").append(this.description)
                    .append(">");
        // 时间格式
        Date date = new Date(this.time);
        resultBuffer.append("<Time:").append(date.toString()).append(">");
        return resultBuffer.toString();
    }

    // 日志的格式为：
    // [模块名]<Type:类型名><Level:级别名><User:用户名><Operation:操作名><Result:操作结果><描述><Time:操作时间>

    /**
     * 格式化日志.
     *
     * @return 格式化后的串
     */
    public String formatString() {
        StringBuffer resultBuffer = new StringBuffer();
        if (this.moduleName != null) {
            resultBuffer.append("[").append(this.moduleName).append("]");
        }
        if (this.type >= 0 && this.type < Log.types.length)
            resultBuffer.append("<Type:").append(Log.types[this.type]).append(
                    ">");
        if (this.level >= 0 && this.level < Log.levels.length)
            resultBuffer.append("<Level:").append(Log.levels[this.level])
                    .append(">");
        if (this.userName != null)
            resultBuffer.append("<User:").append(this.userName).append(">");
        if (this.operationName != null)
            resultBuffer.append("<Operation:").append(this.operationName)
                    .append(">");
        if (this.operationResult >= 0
                && this.operationResult < Log.results.length)
            resultBuffer.append("<Result:").append(
                    Log.results[this.operationResult]).append(">");
        if (this.description != null)
            resultBuffer.append("<").append(this.description).append(">");
        // 时间格式
        Date date = new Date(this.time);
        resultBuffer.append("<Time:").append(date.toString()).append(">");
        return resultBuffer.toString();
    }

    public String toString() {
        return this._JMSString();
    }

    /**
     * 获取日志级别.
     *
     * @return 级别
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * 获取日志描述.
     *
     * @return 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 获取模块名.
     *
     * @return 模块名
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * 获取操作名.
     *
     * @return 操作名
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * 获取操作结果.
     *
     * @return 操作结果
     */
    public int getOperationResult() {
        return operationResult;
    }

    /**
     * 获取操作时间.
     *
     * @return 时间
     */
    public Long getTime() {
        return time;
    }

    /**
     * 获取操作类型.
     *
     * @return 类型
     */
    public int getType() {
        return type;
    }

    /**
     * 获取用户名.
     *
     * @return 用户名
     */
    public String getUserName() {
        return userName;
    }
}
