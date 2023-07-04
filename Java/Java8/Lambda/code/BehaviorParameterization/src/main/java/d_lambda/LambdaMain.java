package main.java.d_lambda;

import main.java.base.Apple;
import main.java.base.Colors;

import java.util.Arrays;
import java.util.List;

public class LambdaMain {
    public static void main(String[] args) {
        PredicateFarmerLambda predicateFarmerLambda = new PredicateFarmerLambda();
        List<Apple> apples = Arrays.asList(
                new Apple(Colors.YELLOW, 200D, "Iran"),
                new Apple(Colors.RED, 100D, "Iran"),
                new Apple(Colors.GREEN, 250D, "Iran"),
                new Apple(Colors.YELLOW, 100D, "Iran"),
                new Apple(Colors.GREEN, 50D, "Iran")
        );

        System.out.println("Green:");
        System.out.println(predicateFarmerLambda.filtersApple(apples, (apple -> apple.getColors().equals(Colors.GREEN))));

        System.out.println("Yellow:");
        System.out.println(predicateFarmerLambda.filtersApple(apples, apple -> apple.getColors().equals(Colors.YELLOW)));

        System.out.println("Red:");
        System.out.println(predicateFarmerLambda.filtersApple(apples, apple -> apple.getColors().equals(Colors.RED)));

        System.out.println("Heavy:");
        System.out.println(predicateFarmerLambda.filtersApple(apples, apple -> apple.getWeight() >= 150));

        System.out.println("light:");
        System.out.println(predicateFarmerLambda.filtersApple(apples, apple -> apple.getWeight() < 150));
    }
}
