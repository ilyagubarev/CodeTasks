/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilyagubarev.codetasks.lists;

/**
 *
 * @author gubarev
 */
public final class ListNode<E> {

    private E _item;
    private ListNode<E> _next;

    public ListNode(E item) {
        _item = item;
    }

    public E getItem() {
        return _item;
    }

    public void setItem(E item) {
        _item = item;
    }

    public ListNode<E> getNext() {
        return _next;
    }

    public void setNext(ListNode<E> node) {
        _next = node;
    }
}
