package session_17_equals_hascode_generics.practice.generics;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main (String[] args) {
        Pair<String, Integer> pair = new Pair<>("Alice",24);
        System.out.println(pair.getKey() + " " + pair.getValue());
    }
}
