package main.java.a_normal;

import main.java.base.Apple;
import main.java.base.Colors;

import java.util.Arrays;
import java.util.List;

public class NormalMain {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        List<Apple> apples = Arrays.asList(
                new Apple(Colors.YELLOW, 200D, "Iran"),
                new Apple(Colors.RED, 100D, "Iran"),
                new Apple(Colors.GREEN, 250D, "Iran"),
                new Apple(Colors.YELLOW, 100D, "Iran"),
                new Apple(Colors.GREEN, 50D, "Iran")
        );

        System.out.println("Green:");
        System.out.println(farmer.filterGreenApple(apples));

        System.out.println("Yellow:");
        System.out.println(farmer.filterYellowApple(apples));

        System.out.println("Red:");
        System.out.println(farmer.filterRedApple(apples));

        System.out.println("Heavy:");
        System.out.println(farmer.filterHeavyApple(apples));

        System.out.println("light:");
        System.out.println(farmer.filterLightApple(apples));
    }
}
