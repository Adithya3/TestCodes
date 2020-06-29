package crackingCodingInterview.queuestack.catdog;

import java.time.LocalDateTime;

public class CatDogNode {
    String name;
    LocalDateTime rescueDateTime;

    CatDogNode(String name) {
        this.name = name;
        rescueDateTime = LocalDateTime.now();
    }

    CatDogNode(String name, LocalDateTime rescueDateTime) {
        this.name = name;
        this.rescueDateTime = rescueDateTime;
    }
}
