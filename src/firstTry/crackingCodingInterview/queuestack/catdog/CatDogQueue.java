package firstTry.crackingCodingInterview.queuestack.catdog;

import java.util.LinkedList;
import java.util.Queue;

public class CatDogQueue {
    Queue<CatDogNode> cats = new LinkedList<>();
    Queue<CatDogNode> dogs = new LinkedList<>();

    public String giveMeCat() {
        return cats.poll().name;
    }

    public String giveMeDog() {
        return dogs.poll().name;
    }

    public String giveMePet() {
        CatDogNode fromCats = cats.peek();
        CatDogNode fromDogs = dogs.peek();
        if (fromCats.rescueDateTime.isBefore(fromDogs.rescueDateTime)) {
            cats.poll();
            return fromCats.name;
        } else {
            dogs.poll();
            return fromDogs.name;
        }
    }
}
