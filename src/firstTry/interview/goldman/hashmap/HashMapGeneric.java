package firstTry.interview.goldman.hashmap;

import java.util.ArrayList;
import java.util.List;

public class HashMapGeneric<KeyType,ValueType> {
    private int size, count;
    private List<HashMapGenericNode<KeyType,ValueType>>[] mapArray;

    HashMapGeneric() {
        this.size = 4;
        this.mapArray = new ArrayList[this.size];
        initializeHashArray();
        this.count = 0;
    }

    private void initializeHashArray(){
        for (int i=0 ;i<this.size;i++){
            mapArray[i]=new ArrayList<HashMapGenericNode<KeyType,ValueType>>();
        }
    }

    public void put(KeyType key, ValueType value) {
        HashMapGenericNode node = new HashMapGenericNode(key, value);
        int hashCode = Math.abs(node.getKey().hashCode()), mod;
        mod = hashCode % this.size;
        mapArray[mod].add(node);
        count++;
        if (size == count) {
            expand();
        }
    }

    public ValueType get(KeyType key) {
        int hashCode = Math.abs(key.hashCode()), mod;
        mod = hashCode % this.size;
        for (HashMapGenericNode<KeyType,ValueType> node : this.mapArray[mod]) {
            if (Math.abs(node.getKey().hashCode()) == hashCode) {
                return node.getValue();
            }
        }
        return null;
    }

    private void expand() {
        List<HashMapGenericNode<KeyType,ValueType>>[] tempMapArray = this.mapArray;
        this.size = this.size * 2;
        this.mapArray = new ArrayList[this.size];
        initializeHashArray();
        for (List<HashMapGenericNode<KeyType,ValueType>> nodeList : tempMapArray) {
            for (HashMapGenericNode<KeyType,ValueType> node : nodeList) {
                put(node.getKey(), node.getValue());
            }
        }
    }
}
