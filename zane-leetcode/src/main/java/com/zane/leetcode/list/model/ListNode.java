package com.zane.leetcode.list.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author: ps
 * @since: 2022/6/29  7:23 PM
 * @version: 1.0.0
 */
@Data
@AllArgsConstructor
@ToString
public class ListNode {
    public Integer val;
    public ListNode next;

    public ListNode(Integer val) {
        this.val = val;
    }
}
