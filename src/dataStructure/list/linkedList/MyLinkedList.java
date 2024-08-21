package dataStructure.list.linkedList;

import dataStructure.node.MyNode;
import org.w3c.dom.Node;


public class MyLinkedList <E> {
    private Node<E> first;
    private int size = 0;

    public void add(E e){
        Node<E> newMyNode = new Node<>(e);
        if (first == null){
            first = newMyNode;
        }else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newMyNode;
        }
        size++;
    }

    public Node<E> getLastNode(){
        Node<E> x = first;
        while (x.next != null){
            x = x.next;
        }
        return x;
    }

    public Node<E> getNode(int index){
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public E get(int index){
        return getNode(index).item;
    }

    public E remove(int index){
        Node<E> removeNode = getNode(index);
        E removeItem =  removeNode.item;
        if (index == 0){
            first = removeNode.next;
        }
        Node<E> removeItem1 = getNode(index - 1);
        removeItem1.next = removeNode.next;
        return removeItem;
    }

    public int size(){
        return size;
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }

    @Override
    public String toString() {
        Node x = first;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while(x != null){
            sb.append(x.item);
            if (x.next != null){
                sb.append(" -> ");
            }
            x = x.next;

        }
        sb.append("]");
        return sb.toString();
    }
}
