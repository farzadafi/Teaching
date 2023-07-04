package main.java.d_lambda;

import main.java.base.Colors;
import main.java.base.Inventory;

public class LambdaMain {
    public static void main(String[] args) {
        PredicateFarmerLambda predicateFarmerLambda = new PredicateFarmerLambda();

        System.out.println("Green:");
        System.out.println(predicateFarmerLambda.filtersApple(Inventory.APPLE_LIST,
                (apple -> apple.getColors().equals(Colors.GREEN))));

        System.out.println("Yellow:");
        System.out.println(predicateFarmerLambda.filtersApple(Inventory.APPLE_LIST,
                apple -> apple.getColors().equals(Colors.YELLOW)));

        System.out.println("Red:");
        System.out.println(predicateFarmerLambda.filtersApple(Inventory.APPLE_LIST,
                apple -> apple.getColors().equals(Colors.RED)));

        System.out.println("Heavy:");
        System.out.println(predicateFarmerLambda.filtersApple(Inventory.APPLE_LIST,
                apple -> apple.getWeight() >= 150));

        System.out.println("light:");
        System.out.println(predicateFarmerLambda.filtersApple(Inventory.APPLE_LIST,
                apple -> apple.getWeight() < 150));
    }
}
