package com.zane.leetcode.list;

import com.zane.leetcode.list.detail.MergedListNode;
import com.zane.leetcode.list.model.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: ps
 * @since: 2022/6/29  7:38 PM
 * @version: 1.0.0
 */
public class MergedListNodeTest {

    MergedListNode mergedListNode;

    ListNode list1, list2;

    @Before
    public void init() {
        mergedListNode = new MergedListNode();
        list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    }

    @Test
    public void MergedListNodeTest() {
        ListNode listNode = mergedListNode.mergeTwoLists(list1, list2);
        System.out.println(listNode);
    }

    @Test
    public void MergedListNode2Test() {
        ListNode listNode = mergedListNode.mergeTwoLists2(list1, list2);
        System.out.println(listNode);
    }

}
