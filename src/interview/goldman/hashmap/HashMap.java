package interview.goldman.hashmap;

import java.util.ArrayList;
import java.util.List;

public class HashMap {
    private int size, count;
    private List<HashMapNode>[] mapArray;

    HashMap() {
        this.size = 4;
        this.mapArray = new ArrayList[this.size];
        initializeHashArray();
        this.count = 0;
    }

    private void initializeHashArray(){
        for (int i=0 ;i<this.size;i++){
            mapArray[i]=new ArrayList<HashMapNode>();
        }
    }

    public void put(String key, String value) {
        HashMapNode node = new HashMapNode(key, value);
        int hashCode = Math.abs(node.getKey().hashCode()), mod;
        mod = hashCode % this.size;
        mapArray[mod].add(node);
        count++;
        if (size == count) {
            expand();
        }
    }

    public String get(String key) {
        int hashCode = Math.abs(key.hashCode()), mod;
        mod = hashCode % this.size;
        for (HashMapNode node : this.mapArray[mod]) {
            if (Math.abs(node.getKey().hashCode()) == hashCode) {
                return node.getValue();
            }
        }
        return null;
    }

    private void expand() {
        List<HashMapNode>[] tempMapArray = this.mapArray;
        this.size = this.size * 2;
        this.mapArray = new ArrayList[this.size];
        initializeHashArray();
        for (List<HashMapNode> nodeList : tempMapArray) {
            for (HashMapNode node : nodeList) {
                put(node.getKey(), node.getValue());
            }
        }
    }
}
