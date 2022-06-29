package com.zane.leetcode.list.detail;

import com.zane.leetcode.list.model.ListNode;

/**
 * @author: ps
 * @since: 2022/6/29  7:28 PM
 * @version: 1.0.0
 * @desc https://leetcode.cn/problems/merge-two-sorted-lists/
 * 合并两个有序列表，返回合并后的链表
 */
public class MergedListNode {

    /**
     * 迭代合并
     * 解题思路
     * 1. 申明一个哨兵头节点，用于返回合并后的链表链接
     * 2. 申明一个用于迭代的当前节点cur
     * 3. 循环遍历两个链表，当其中有节点为空时，跳出循环条件
     * 3.1 比较节点值，将数值小的节点初始化为一个节点，并且追加到当前cur节点的后继节点中
     * 3.2 将遍历节点和当前节点后移，用于下次循环
     * 4. 将遍历节点不为空的节点追加到当前节点末尾
     * 5. 返回哨兵节点的下一个节点为合并后的节点
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }

        ListNode head = new ListNode(-1);
        ListNode cur = head;

        ListNode newNode;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                newNode = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                newNode = new ListNode(list2.val);
                list2 = list2.next;
            }

            cur.next = newNode;
            cur = cur.next;
        }

        cur.next = list1 == null ? list2 : list1;

        return head.next;
    }

    /**
     * 递归合并
     */
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }

        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists2(list1.next, list2);
            return list1;
        }

        list2.next = mergeTwoLists2(list1, list2.next);
        return list2;
    }
}
