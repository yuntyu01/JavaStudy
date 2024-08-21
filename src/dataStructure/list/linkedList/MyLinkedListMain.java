package dataStructure.list.linkedList;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<String> stringList = new MyLinkedList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println(stringList);

        String string = stringList.get(0);
        System.out.println("string = " + string);

        System.out.println("stringList.remove(1) = " + stringList.remove(1));
        System.out.println(stringList);

        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
        System.out.println(intList);


    }
}
