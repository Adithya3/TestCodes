package firstTry.interview.goldman.hashmap;

public class hashMapMain {
    public static void main(String[] args) {
        HashMapGeneric<String,String> hashMap=new HashMapGeneric<String, String>();
        hashMap.put("ding","dong");
        hashMap.put("ming","mong");
        hashMap.put("adithya","boppana");
        hashMap.put("venkata","adithya");
        hashMap.put("this","is");
        hashMap.put("a","test");
        hashMap.put("to","see");
        hashMap.put("if","the");
        hashMap.put("hash","map");
        hashMap.put("is","working");
        System.out.println(hashMap.get("a"));
    }
}
