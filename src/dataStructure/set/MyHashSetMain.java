package dataStructure.set;

public class MyHashSetMain {

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet(2);
        myHashSet.add(0);
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(5);
        myHashSet.add(6);
        myHashSet.add(7);
        myHashSet.add(8);
        myHashSet.add(9);
        myHashSet.add(10);

        System.out.println(myHashSet);

        myHashSet.remove(3);

        System.out.println(myHashSet);

        System.out.println("myHashSet.size() = " + myHashSet.size());
    }
}
