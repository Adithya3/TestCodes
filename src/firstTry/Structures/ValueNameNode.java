package firstTry.Structures;

public class ValueNameNode  {
    public int value;
    public String name;

    ValueNameNode(String name, int value) {
        this.name = name;
        this.value = value;
    }

//    @Override
//    public int compareTo(ValueNameNode o) {
//        if (o.value > this.value) {
//            return 1;
//        } else if (o.value < this.value) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
}
