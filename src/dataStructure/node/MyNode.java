package dataStructure.node;

import java.util.Arrays;
public class MyNode <T> {
    Object data;
    MyNode<T> next;

    public MyNode(T data) {
        this.data = data;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyNode x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.data);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
