package com.pcy.coding.leetcode.list;

import java.util.PriorityQueue;

/**
 * 合并K个升序链表
 * <p>
 * 关键是PriorityQueue优先级队列的使用
 * https://baijiahao.baidu.com/s?id=1665383380422326763&wfr=spider&for=pc
 *
 * @author PengChenyu
 * @since 2021-10-08 22:58:31
 */
public class Leetcode23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        // 创建虚拟头节点
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        // 创建优先级队列，小顶堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                lists.length,
                (a, b) -> (a.val - b.val)
        );
        // 把所有升序链表的头节点放入优先级队列
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        //依次放入结点
        while (!pq.isEmpty()) {
            // 拿出头节点
            ListNode first = pq.poll();
            p.next = first;
            // 继续放入头节点的下一个结点
            if (first.next != null) {
                pq.add(first.next);
            }
            p = p.next;

        }
        return dummy.next;
    }
}
