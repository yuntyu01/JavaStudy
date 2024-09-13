package dataStructure.map;

public class MyHashMapMain {

    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("a", 1);
        myHashMap.put("b", 2);
        myHashMap.put("c", 3);

        System.out.println(myHashMap);

        System.out.println("myHashMap.containKey(\"a\") = " + myHashMap.containKey("a"));

        myHashMap.remove("a");
        System.out.println(myHashMap);

        System.out.println("myHashMap.containKey(\"a\") = " + myHashMap.containKey("a"));

        System.out.println("myHashMap.get(\"b\") = " + myHashMap.get("b"));
    }
}
