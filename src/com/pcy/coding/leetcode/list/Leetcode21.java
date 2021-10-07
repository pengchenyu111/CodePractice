package com.pcy.coding.leetcode.list;

/**
 * 合并两个有序链表
 *
 * @author PengChenyu
 * @since 2021-10-07 22:27:54
 */
public class Leetcode21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // 头节点
        ListNode dummy = new ListNode(-1);
        // 指针
        ListNode p = dummy, p1 = l1, p2 = l2;

        while (p1 != null && p2 != null) {
            if (p1.val >= p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            // p不断前进
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }
}
