package dataStructure.set;


import java.util.Arrays;
import java.util.Objects;

public class MyHashSet<E> {
    private E[] myHashSet;
    private int size = 16;
    private int count = 0;

    public MyHashSet() {
        myHashSet = (E[]) new Object[this.size];
    }

    public MyHashSet(int size) {
        this.size = size;
        myHashSet = (E[]) new Object[this.size];
    }

    public boolean contain (E e){
        if (myHashSet[e.hashCode()] == null) {
            return false;
        }
        return true;
    }
    public void add(E e){
        if (contain(e) == false){
            myHashSet[e.hashCode()] = e;
            count++;
        }
        if (count == (int) (size * 0.75)){
            size = (int) (size * 1.5);
            myHashSet = Arrays.copyOf(myHashSet, size);
        }
    }

    public void remove(E e){
        if (!contain(e)){
            System.out.println(e + "를 찾지 못 했습니다");
            return;
        }
        count--;
        myHashSet[e.hashCode()] = null;
    }

    public int size(){
        return count;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyHashSet<?> hashSet = (MyHashSet<?>) object;
        return size == hashSet.size && Objects.deepEquals(myHashSet, hashSet.myHashSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(myHashSet), size) % myHashSet.length;
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "myHashSet=" + Arrays.toString(myHashSet) +
                ", size=" + size +
                '}';
    }
}
