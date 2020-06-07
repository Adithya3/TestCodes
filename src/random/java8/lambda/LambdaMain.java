package random.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaMain {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Venkata Adithya", "Boppaa", 26),
                new Person("Harsha", "Boppana", 24),
                new Person("Nirmala", "Boppa", 57),
                new Person("Krishna mohan rao", "Bana", 58),
                new Person("cme", "ana", 58),
                new Person("cdeone", "Ba", 58)
        );
        //sort list by last name
        Collections.sort(people, (Person p1, Person p2) -> {
            int p1Length = p1.lastName.length(), p2Length = p2.lastName.length();
            return p1Length - p2Length;
        });

//        for (Person person : people){
//            System.out.println(person.toString());
//        }

        //create a method that prints all elements in the line
        PrintElementsOfList<Person> print = (people1) -> {
            for (Person person : people1) {
                System.out.println(person.toString());
            }
        };


        //create a method that print all people that have first name beginning with c
        PrintElementsOfList<Person> print1 = (people1) -> {
            for (Person person : people1) {
                if (person.firstName.charAt(0) == 'c') {
                    System.out.println(person.toString());
                }
            }
        };
        print1.print(people);
    }
}
