package firstTry.Structures;

import firstTry.Structures.Trie.TrieM;


public class TestStructures {
    public static void main(String[] args) {
        TrieM atrie= new TrieM();
        atrie.addValue("dingdong");
        atrie.addValue("make");
        atrie.addValue("adit");
        System.out.println(atrie.isThisStringWithEnd("ding"));
    }
}
