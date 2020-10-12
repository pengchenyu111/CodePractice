package com.pcy.coding.pat;



import java.util.Arrays;

import java.util.Scanner;

class Node {
    int address;
    int data;
    int next;
    int order;

    public Node(int address, int data, int next, int order) {
        this.address = address;
        this.data = data;
        this.next = next;
        this.order = order;
    }
}


/**
 * 算法笔记上的是伪代码：是倒着输出的，没有真正的翻转！
 */
public class PAT1074ReverseList {

    public static int MAX = 100010;

    boolean cmp(Node a, Node b) {
        return a.order < b.order;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int head = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Node[] nodes = new Node[MAX];

        for (int i = 0; i < n; i++) {
            int add = scanner.nextInt();
            int da = scanner.nextInt();
            int ne = scanner.nextInt();
            nodes[add] = new Node(add, da, ne, MAX);
        }

        int count = 0;
        int p = head;
        //获取count
        while (p != -1) {
            nodes[p].order = count++;
            p = nodes[p].next;
        }

        //按头结点排列好
        Arrays.sort(nodes, (o1, o2) -> o1.order - o2.order);

        // 可以消除无关结点了
        n = count;




    }
}
