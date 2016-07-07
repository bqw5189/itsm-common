package com.itsm.platform.common.util;

import java.util.HashMap;
import java.util.List;

/**
 * 迭代器接口.
 */
public interface Iterator extends java.io.Serializable {

    /**
     * 设置迭代器参数.
     *
     * @param parameters 参数
     * @return 1 ，成功；-1，失败
     */
    public int setParameters(HashMap<String, Object> parameters);

    /**
     * 检查是否有下一个元素.
     *
     * @return true ,有；false ,没有
     */
    Boolean hasNext();

    /**
     * 获取下一批元素.
     *
     * @param count 获取的数量
     * @return 下一批元素的列表
     */
    List getNext(int count);

    /**
     * 获取前一批元素.
     *
     * @param count 获取元素的数量
     * @return 前一批元素的数量
     */
    List getPrevious(int count);

    /**
     * 是否有前一个元素.
     *
     * @return true, 有；false,没有
     */
    Boolean hasPrevious();

    /**
     * 关闭迭代器.
     */
    void close();

    /**
     * 回到迭代器起点.
     */
    void goHome();
}