package firstTry.Structures.Trie;

import java.util.HashMap;

public class TrieNodeMap {
    HashMap<Character, TrieNodeMap> nodes;
    boolean end;

    public TrieNodeMap() {
        nodes = new HashMap<Character, TrieNodeMap>();
    }
}
