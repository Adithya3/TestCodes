package interview;

import java.util.Arrays;
import java.util.HashMap;

public class Test {
    public static String[] topToys(int numberOfTopToys, String[] toys, String[] quotes) {
        String[] topToys = new String[numberOfTopToys];
        HashMap<String, Integer> occurancemap = new HashMap<String, Integer>();
        for (int i = 0; i < toys.length; i++) {
            for (int j = 0; j < quotes.length; j++) {
                occurancemap.put(toys[i], occurancemap.get(toys[i])+numberOfOcurrances(quotes[j],toys[i]));
            }
        }
        lowerCaseArrayStrings(toys);
        lowerCaseArrayStrings(quotes);
        return topToys;
    }

    public static int numberOfOcurrances(String mainString, String subString) {
        int count = 0;
//        while (){
//
//        }
        return count;
    }

    public static void lowerCaseArrayStrings(String[] arrayString) {
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = arrayString[i].toLowerCase();
        }
    }

    public static void main(String[] args) {
        int numToys = 6, topToys = 2, numQuotes = 6;
        String[] toys = {"elmo", "elsa", "legos", "drone", "tablet", "warcraft"};
        String[] quotes = {
                "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
                "The new Elmo dolls are super high quality",
                "Expect the Elsa dolls to be very popular this year, Elsa!",
                "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
                "For parents of older kids, look into buying them a drone",
                "Warcraft is slowly rising in popularity ahead of the holiday season"
        };
        lowerCaseArrayStrings(quotes);
        System.out.println(Arrays.toString(quotes));
    }
}

class ValueClass {
    int value;
    String name;

    ValueClass(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
