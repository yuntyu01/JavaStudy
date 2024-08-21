package dataStructure.list.arrayList;

public class MyArrayListMain {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>(3);

        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");
        myArrayList.add("6");

        System.out.println(myArrayList);
        myArrayList.add(2, "10");

        System.out.println("myArrayList.get(2) = " + myArrayList.get(2));

        System.out.println(myArrayList);
        System.out.println("myArrayList.remove(3) = " + myArrayList.remove("10"));
        System.out.println(myArrayList);

        System.out.println(myArrayList.size());
    }
}
