package random.java8.lambda;

import java.util.List;

@FunctionalInterface
public interface PrintElementsOfList<T> {
    public void print(List<T> list);
}
