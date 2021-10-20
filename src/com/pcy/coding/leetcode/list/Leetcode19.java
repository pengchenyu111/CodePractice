package com.pcy.coding.leetcode.list;

import java.util.List;

/**
 * 删除链表的倒数第 N 个结点
 * <p>
 * 注意1：相当于找到倒数第 N+1 个节点，并删除其子节点
 * 注意2：当删除的是头结点时，找N+1出现空指针，用虚拟头节点解决问题
 *
 * @author PengChenyu
 * @since 2021-10-20 22:53:55
 */
public class Leetcode19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // 以下代码会出现空指针，
        // 原因是：比如说链表总共有 5 个节点，题目就让你删除倒数第 5 个节点，也就是第一个节点，那按照算法逻辑，应该首先找到倒数第 6 个节点。但第一个节点前面已经没有节点了，这就会出错。
        // 改进方式：添加虚拟头节点
//        int k = n + 1;
//
//        ListNode p1 = head;
//        // p1先走n+1步
//        for (int i = 0; i < k; i++) {
//            p1 = p1.next;
//        }
//        // p2先在头节点
//        ListNode p2 = head;
//
//        // 两个同时走
//        while (p1 != null) {
//            p1 = p1.next;
//            p2 = p2.next;
//        }
//
//        // 开始删除倒数第N个节点
//        ListNode lastNNode = p2.next;
//        ListNode behindLastNNode = lastNNode.next;
//        p2.next = behindLastNNode;
//        return head;


        // 首先设置虚拟头节点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int k = n + 1;
        // p1 p2先在虚拟头节点
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        // p1先走n+1步
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }

        // 两个同时走
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        // 开始删除倒数第N个节点
        p2.next = p2.next.next;
        return dummy.next;

    }
}
