package dataStructure.map;



import java.util.Arrays;
import java.util.Objects;

public class MyHashMap <K, V> {
    private Entry<K, V>[] table;
    int size = 16;
    int count = 0;

    public MyHashMap() {
        table = new Entry[size];
    }

    public MyHashMap(int size) {
        this.size = size;
        table = new Entry[size];
    }

    public boolean containKey(K key){
        int hashIndex = key.hashCode() % table.length;
        if (table[hashIndex] == null){
            return false;
        }
        return true;
    }

    public void put (K key, V value){
        int hashIndex = key.hashCode() % table.length;
        table[hashIndex] = new Entry<>(key, value);
    }

    public V get (K key){
        int hashIndex = key.hashCode() % table.length;
        if (!containKey(key)){
            System.out.println(key + "는 존재하지 않습니다");
            return null;
        }
        return table[hashIndex].getValue();

    }

    public void remove(K key){
        int hashIndex = key.hashCode() % table.length;
        table[hashIndex] = null;
    }



    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "[" +
                    "key=" + key +
                    ", value=" + value +
                    ']';
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyHashMap<?, ?> myHashMap = (MyHashMap<?, ?>) object;
        return size == myHashMap.size && count == myHashMap.count && Objects.deepEquals(table, myHashMap.table);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(table), size, count) % table.length;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "table=" + Arrays.toString(table) +
                ", size=" + size +
                ", count=" + count +
                '}';
    }
}
