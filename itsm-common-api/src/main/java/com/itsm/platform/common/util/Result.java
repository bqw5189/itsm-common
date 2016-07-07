package com.itsm.platform.common.util;

import java.util.List;

/**
 * 结果集.
 */
public class Result implements java.io.Serializable {

    /**
     * The collection.
     */
    private List<Object> collection;

    /**
     * The iterator.
     */
    private Iterator iterator;

    /**
     * The count.
     */
    private long count = -1;

    /**
     * 构造结果集.
     *
     * @param collection 数据集
     * @param iterator   迭代器
     */
    public Result(List<Object> collection, Iterator iterator) {
        this.collection = collection;
        this.iterator = iterator;
    }

    /**
     * 构造结果集.
     *
     * @param collection 数据集
     * @param iterator   构造
     * @param count      每批数据的量
     */
    public Result(List<Object> collection, Iterator iterator, long count) {
        this.collection = collection;
        this.iterator = iterator;
        this.count = count;
    }

    /**
     * 获取数据集.
     *
     * @return 数据集
     */
    public List<Object> getResult() {
        return this.collection;
    }

    /**
     * 获取迭代器.
     *
     * @return 迭代器
     */
    public Iterator getIterator() {
        return this.iterator;
    }

    /**
     * 判断是否有迭代器.
     *
     * @return true，有迭代器；false，没有迭代器
     */
    public Boolean hasIterator() {
        return this.iterator == null ? false : true;
    }

    /**
     * 获取数据集总数.
     *
     * @return 数据集总数
     */
    public Long getTotalCount() {
        return count;
    }
}
