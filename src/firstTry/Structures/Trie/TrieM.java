package firstTry.Structures.Trie;

public class TrieM {
    TrieNodeMap top;

    public TrieM() {
        this.top = new TrieNodeMap();
    }

    public boolean doesThisExist(String value) {
        TrieNodeMap current = this.top;
        for (int i = 0; i < value.length(); i++) {
            if (current.nodes.containsKey(value.charAt(i))) {
                current = current.nodes.get(value.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isThisStringWithEnd(String value) {
        TrieNodeMap current = this.top;
        for (int i = 0; i < value.length(); i++) {
            if (current.nodes.containsKey(value.charAt(i))) {
                if (i == value.length() - 1 && current.end) {
                    return true;
                }
                current = current.nodes.get(value.charAt(i));
            } else {
                return false;
            }
        }
        return false;
    }

    public void addValue(String value) {
        TrieNodeMap current;
        current = this.top;
        for (int i = 0; i < value.length(); i++) {
            if (current.nodes.containsKey(value.charAt(i))) {
                if (value.length() - 1 == i) {
                    current.end = true;
                }
                current = current.nodes.get(value.charAt(i));
            } else {
                current.nodes.put(value.charAt(i), new TrieNodeMap());
                if (value.length() - 1 == i) {
                    current.end = true;
                }
                current = current.nodes.get(value.charAt(i));

            }
        }
    }
}
