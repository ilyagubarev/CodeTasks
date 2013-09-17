package com.ilyagubarev.codetasks.lists;

import java.util.Stack;

/**
 *
 * @author gubarev
 */
public final class ListHelper {

    /**
     * Processes specified list and removes all the duplications.
     *
     * @param node starting node of the list.
     *
     * @see ListNode
     */
    public static void removeDups(ListNode start) {
        while (start != null) {
            ListNode previous = start;
            ListNode runner = start.getNext();
            while (runner != null) {
                if (start.getItem().equals(runner.getItem())) {
                    previous.setNext(runner.getNext());
                } else {
                    previous = runner;
                }
                runner = runner.getNext();
            }
            start = start.getNext();
        }
    }

    public static ListNode find(ListNode start, int k) {
        Stack<ListNode> stack = new Stack<ListNode>();
        while (start != null) {
            stack.push(start);
            start = start.getNext();
        }
        for (int i = 1; i < k; ++i) {
            stack.pop();
        }
        return stack.pop();
    }

    private ListHelper() {

    }
}
