package com.ilyagubarev.codetasks;

import com.ilyagubarev.codetasks.lists.ListHelper;
import com.ilyagubarev.codetasks.lists.ListNode;

/**
 * Application main class
 *
 * @version 1.01, 31 August 2013
 * @since 31 August 2013
 * @author Ilya Gubarev
 */
public final class Application {

    /**
     * Application execution entry point.
     *
     * @param args command line arguments.
     */
    public static void main(String ... args) {
        ListNode<Integer> node1 = new ListNode<Integer>(1);
        ListNode<Integer> node2 = new ListNode<Integer>(2);
        ListNode<Integer> node3 = new ListNode<Integer>(2);
        ListNode<Integer> node4 = new ListNode<Integer>(3);
        ListNode<Integer> node5 = new ListNode<Integer>(4);
        ListNode<Integer> node6 = new ListNode<Integer>(5);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        ListNode r = ListHelper.find(node1, 4);
    }

    private Application() {

    }
}
