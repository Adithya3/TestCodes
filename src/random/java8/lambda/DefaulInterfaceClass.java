package random.java8.lambda;

interface SomeInterface{
    default void printmenow(){
        System.out.printf("ding dong bell.");
    }
}

class TestClass implements SomeInterface {

}

public class DefaulInterfaceClass {
    public static void main(String[] args) {
        TestClass newtest= new TestClass();
        newtest.printmenow();
    }
}
