package interview.goldman.matrix;

import java.util.ArrayList;
import java.util.List;

public class ListOfListCreation {
    public static <T> List<T> asList(T ... items) {
        List<T> list = new ArrayList<>();
        for (T item : items) {
            list.add(item);
        }

        return list;
    }
}
