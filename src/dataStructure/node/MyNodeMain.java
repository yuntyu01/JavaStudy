package dataStructure.node;

import org.w3c.dom.Node;

public class MyNodeMain {
    public static void main(String[] args) {
        MyNode<String> myNode = new MyNode<>("A");
        myNode.next = new MyNode<>("B");
        myNode.next.next = new MyNode<>("C");

        System.out.println(myNode);

        System.out.println("모든 노드 탐색");
        printAll(myNode);

        System.out.println("마지막 노드 조회하기");
        MyNode lastNode = getLastNode(myNode);
        System.out.println("lastNode = " + lastNode);

        int index = 1;
        MyNode index2Node = getNode(myNode, index);
        System.out.println("index2Node = " + index2Node.data);
    }

    public static void printAll(MyNode<?> myNode){
        MyNode data = myNode;
        while (data!= null){
            System.out.println(data.data);
            data = data.next;
        }
    }
    public static MyNode<?> getLastNode(MyNode<?> myNode){
        MyNode data = myNode;
        while (data.next!= null){
            data = data.next;
        }
        return data;
    }
    public static MyNode<?> getNode(MyNode myNode, int index){
        MyNode x = myNode;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
}
