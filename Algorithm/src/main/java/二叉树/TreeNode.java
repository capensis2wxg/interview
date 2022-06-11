package 二叉树;/*
    @author wxg
    @date 2021/8/21-9:34
    */

/**
 * 定义一个树节点，数据类型使用int
 */
public class TreeNode {
    //  左节点
    private TreeNode leftTreeNode;
    //  右节点
    private TreeNode rightTreeNode;
    //  数据
    private int value;
    private boolean isDelete;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }


    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

    public TreeNode() {
        super();
    }

    public TreeNode(int value) {
        this(null, null, value, false);
    }

    public TreeNode(TreeNode leftTreeNode, TreeNode rightTreeNode, int value, boolean isDelete) {
        super();
        this.leftTreeNode = leftTreeNode;
        this.rightTreeNode = rightTreeNode;
        this.value = value;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "leftTreeNode=" + leftTreeNode +
                ", rightTreeNode=" + rightTreeNode +
                ", value=" + value +
                ", isDelete=" + isDelete +
                '}';
    }
}
