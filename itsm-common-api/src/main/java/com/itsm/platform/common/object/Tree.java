package com.itsm.platform.common.object;

import java.util.List;

/**
 * 在配置模块中展现树形结构时，需要首先提供一些预制的树根，如按厂商分类时，须提供厂
 * 商列表及每个厂商下网元的个数，按设备类型分类时，须提供类型列表及每个类型下网元个 数，按自定义分组分时，须提供分组列表及每个分组列表下的网元个数.
 */
public class Tree implements java.io.Serializable {

    /**
     * 子树.
     */
    private List<Tree> childTree;

    /**
     * 节点.
     */
    private String[] node;

    /**
     * 获取子树.
     *
     * @return 子树
     */
    public List<Tree> getChildTree() {
        return childTree;
    }

    /**
     * 设置子树.
     *
     * @param childTree 新的子树
     */
    public void setChildTree(List<Tree> childTree) {
        this.childTree = childTree;
    }

    /**
     * 获取节点.
     *
     * @return 节点
     */
    public String[] getNode() {
        return node;
    }

    /**
     * 设置节点.
     *
     * @param node 新的节点
     */
    public void setNode(String[] node) {
        this.node = node;
    }

}
