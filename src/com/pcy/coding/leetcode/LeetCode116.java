package com.pcy.coding.leetcode;


import java.util.ArrayDeque;
import java.util.Deque;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};


public class LeetCode116 {


    /**
     * 层次遍历的方法
     * @param root
     * @return
     */
    public Node connect(Node root) {

        if (root == null){
            return root;
        }

        // 初始化队列，并添加根节点
        Deque<Node> deque = new ArrayDeque<>();
        deque.addLast(root);

        while (!deque.isEmpty()){
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                Node node = deque.pollFirst();
                if (i < size -1){
                    // 这里这么做是为了不让每一层的最后一个结点的next指向下一层的第一个
                    node.next = deque.peekFirst();
                }

                if (node.left != null){
                    deque.addLast(node.left);
                }
                if (node.right != null){
                    deque.addLast(node.right);
                }
            }
        }

        return root;

    }
}
