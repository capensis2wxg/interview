package 二叉树;/*
    @author wxg
    @date 2021/8/21-9:48
    */


public class BinaryTree {
    //  根节点
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    /**
     * 插入
     *
     * @param value 要插入的值
     */
    public void insert(int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            root.setLeftTreeNode(null);
            root.setRightTreeNode(null);
        } else {
            //  第一次是与根节点的值进行比较，所以current第一次赋值为root
            TreeNode currentNode = root;
            TreeNode parentNode;
            while (true) {
                //  该语句负责更新用于比较的新节点
                parentNode = currentNode;
                //  往右存放数据，newNode.getValue()为插入的固定值
                if (newNode.getValue() > currentNode.getValue()) {
                    //  得到进一步将要计较的右子节点
                    currentNode = currentNode.getRightTreeNode();
                    //  如果不满足右边子节点为空，就要进行下一轮循环
                    if (currentNode == null) {
                        parentNode.setRightTreeNode(newNode);
                        return;
                    }
                } else {
                    //   往左存放数据，得到进一步将要计较的左子节点
                    currentNode = currentNode.getLeftTreeNode();
                    //  如果不满足右边子节点为空，就要进行下一轮循环
                    if (currentNode == null) {
                        parentNode.setLeftTreeNode(newNode);
                        return;
                    }
                }
            }
        }
    }

    /**
     * 查找
     *
     * @param value 要查找的值
     */
    public TreeNode find(int value) {
        TreeNode currentNode = root;
        if (currentNode != null) {
            while (currentNode.getValue() != value) {
                if (currentNode.getValue() > value) currentNode = currentNode.getLeftTreeNode();
                else currentNode = currentNode.getRightTreeNode();
                /*
                一旦循环走到这步，就进入子节点的比较，如果currentNode != null, 就继续比较。因此接下来就会产生两个分支
                分支一：层层查找，直到找到null也没找到，就返回null
                分支二：层层查找，找到之后，不满足循环条件，进入 if (currentNode.isDelete()) return null, 返回这个节点
                        PS: 该节点肯定不为空，因为有与value相同的值
                 */
                if (currentNode == null) return null;
            }
            //  如果currentNode.getValue() = value, 那就说明找到了，由于current.isDelete用于为false，所以就会返回这个节点
            if (currentNode.isDelete()) return null;
            else return currentNode;
        } else return null;

    }


    /**
     * 中序遍历
     *
     * @param treeNode 节点
     */
    public void inOrder(TreeNode treeNode) {
        if (treeNode != null && !treeNode.isDelete()) {
            inOrder(treeNode.getLeftTreeNode());
            System.out.print(treeNode.getValue() + "\t");
            inOrder(treeNode.getRightTreeNode());
        }
    }
}
