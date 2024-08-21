package dataStructure.list.arrayList;


import java.util.Arrays;
import java.util.Objects;

public class MyArrayList <T> {
    private T[] myArrayList;
    private int size = 16;
    private int count = 0;

    public MyArrayList() {
        myArrayList = (T[]) new Object[size];
    }

    public MyArrayList(int size){
        this.size = size;
        myArrayList = (T[]) new Object[size];
    }

    public void add(T t){
        if (myArrayList.length == count){
            size = (int) (size * 1.75);
            myArrayList = Arrays.copyOf(myArrayList, size);
        }
        myArrayList[count] = t;
        count++;
    }

    public void add(int index, T t){
        if (myArrayList.length == count){
            size = (int) (size * 1.75);
            myArrayList = Arrays.copyOf(myArrayList, size);
        }
        for (int i = index; i < count -1; i++) {
            myArrayList[i] = myArrayList[i + 1];
        }
        myArrayList[index] = t;
        count++;
    }

    public T get(int index){
        if (index > size){
            System.out.println("주소가 배열의 크기보다 큽니다");
        }
        return myArrayList[index];
    }

    public T remove(T t){
        for (int i = 0; i < count - 1; i++) {
            if (myArrayList[i].equals(t)){
                for (int j = i; j < count - 1; j++) {
                    myArrayList[j] = myArrayList[j+1];
                }
                count--;
                return t;
            }
        }
        System.out.println(t + "를 찾지 못했습니다.");
        return null;
    }

    public T remove(int index){
        T t = get(index);
        for (int i = index; i < count; i++) {
            myArrayList[i] = myArrayList[i + 1];
        }
        return t;
    }

    public int size(){
        return count - 1;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArrayList=" + Arrays.toString(myArrayList) +
                ", size=" + size +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyArrayList<?> that = (MyArrayList<?>) object;
        return size == that.size && count == that.count && Objects.deepEquals(myArrayList, that.myArrayList);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
