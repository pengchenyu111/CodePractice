package com.pcy.coding.leetcode.list;

/**
 * @author PengChenyu
 * @since 2021-10-07 22:25:55
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
