package main.java.base;

import java.util.Arrays;
import java.util.List;

public class Inventory {

    public static final List<Apple> APPLE_LIST;

    static {
        APPLE_LIST = Arrays.asList(
                new Apple(Colors.YELLOW, 200D, "Iran"),
                new Apple(Colors.RED, 100D, "Iran"),
                new Apple(Colors.GREEN, 250D, "Iran"),
                new Apple(Colors.YELLOW, 100D, "Iran"),
                new Apple(Colors.GREEN, 50D, "Iran")
        );
    }
}
