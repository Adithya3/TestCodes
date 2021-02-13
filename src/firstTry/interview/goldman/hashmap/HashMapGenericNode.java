package firstTry.interview.goldman.hashmap;

public class HashMapGenericNode<KeyType, ValueType> {
    public KeyType getKey() {
        return key;
    }

    public ValueType getValue() {
        return value;
    }

    KeyType key;
    ValueType value;

    HashMapGenericNode(KeyType key, ValueType value){
        this.key=key;
        this.value=value;
    }
}
