package 二叉树;/*
    @author wxg
    @date 2021/8/21-9:56
    */

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        //  添加数据
        tree.insert(20);
        tree.insert(40);
        tree.insert(50);
        tree.insert(30);
        tree.insert(5);
        tree.insert(25);
        tree.insert(45);
        System.out.println("root = " + tree.getRoot().getValue());
        System.out.println();
        //  排序测试
        tree.inOrder(tree.getRoot());
        System.out.println("\n" );
        //  查找测试
        if(tree.find(20) != null) System.out.println("找到了");
        else System.out.println("没找到");
        //  删除测试
        tree.find(40).setDelete(true);
        //  再次查找
        if(tree.find(40) != null) System.out.println("找到了");
        else System.out.println("没找到");
    }
}
