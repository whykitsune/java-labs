import java.util.LinkedList;

class HashElem<K, V> {
    public HashElem(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K key;
    public V value;

    public K getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }
}

public class HashTable<K, V> {
    int buckets;
    private LinkedList<LinkedList<HashElem<K, V>>> table;
    private LinkedList<K> keyList;

    public HashTable() {

        buckets = 5;
        table = new LinkedList<>();
        for (int i = 0; i < buckets; i++) {
            table.add(new LinkedList<>());
        }
        keyList = new LinkedList<>();
    }

    public void put(K key, V value) {
        if (size() == buckets) {
            int newBuckets = buckets * 2;
            LinkedList<LinkedList<HashElem<K, V>>> newTable = new LinkedList<>();
            for (int i = 0; i < newBuckets; i++) {
                newTable.add(new LinkedList<>());
            }
            for (K oldKey : keyList) {
                int index = Math.abs(oldKey.hashCode()) % newBuckets;
                LinkedList<HashElem<K, V>> chain = newTable.get(index);
                chain.add(new HashElem<>(oldKey, get(oldKey)));
            }
            buckets = newBuckets;
            table = newTable;
        }
        int index = Math.abs(key.hashCode()) % buckets;
        LinkedList<HashElem<K, V>> chain = table.get(index);
        if (chain.isEmpty()) {
            chain.add(new HashElem<>(key, value));
            keyList.add(key);
        } else {
            for (HashElem<K, V> elem : chain) {
                if (key.equals(elem.getKey())) {
                    elem.setValue(value);
                    return;
                }
            }
            chain.add(new HashElem<>(key, value));
            keyList.add(key);
        }
    }

    public int size() {
        return keyList.size();
    }

    public boolean isEmpty() {
        return (keyList.size() == 0);
    }

    public V get(K key) {
        int index = Math.abs(key.hashCode()) % buckets;
        LinkedList<HashElem<K, V>> chain = table.get(index);
        if (!chain.isEmpty()) {
            for (HashElem<K, V> elem : chain) {
                if (key.equals(elem.getKey())) {
                    return elem.getValue();
                }
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = Math.abs(key.hashCode()) % buckets;
        LinkedList<HashElem<K, V>> chain = table.get(index);
        if (!chain.isEmpty()) {
            for (HashElem<K, V> elem : chain) {
                if (key.equals(elem.getKey())) {
                    chain.remove(elem);
                    keyList.remove(key);
                    return;
                }
            }
        }
    }

    public int getIndex(K key) {
        return Math.abs(key.hashCode()) % buckets;
    }
}

