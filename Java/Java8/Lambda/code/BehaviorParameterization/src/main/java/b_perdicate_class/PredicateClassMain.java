package main.java.b_perdicate_class;

import main.java.b_perdicate_class.predicate.ApplePredicate;
import main.java.b_perdicate_class.predicate.color.AppleGreenColorPredicate;
import main.java.b_perdicate_class.predicate.color.AppleRedColorPredicate;
import main.java.b_perdicate_class.predicate.color.AppleYellowColorPredicate;
import main.java.b_perdicate_class.predicate.weight.AppleHeavyWeightPredicate;
import main.java.b_perdicate_class.predicate.weight.AppleLightWeightPredicate;
import main.java.base.Apple;
import main.java.base.Colors;

import java.util.Arrays;
import java.util.List;

public class PredicateClassMain {
    public static void main(String[] args) {
        PredicateFarmerClass predicateFarmerClass = new PredicateFarmerClass();
        ApplePredicate greenApple = new AppleGreenColorPredicate();
        ApplePredicate redApple = new AppleRedColorPredicate();
        ApplePredicate yellowApple = new AppleYellowColorPredicate();
        ApplePredicate heavyApple = new AppleHeavyWeightPredicate();
        ApplePredicate lightApple = new AppleLightWeightPredicate();

        List<Apple> apples = Arrays.asList(
                new Apple(Colors.YELLOW, 200D, "Iran"),
                new Apple(Colors.RED, 100D, "Iran"),
                new Apple(Colors.GREEN, 250D, "Iran"),
                new Apple(Colors.YELLOW, 100D, "Iran"),
                new Apple(Colors.GREEN, 50D, "Iran")
        );

        System.out.println("Green:");
        System.out.println(predicateFarmerClass.filtersApple(apples, greenApple));

        System.out.println("Yellow:");
        System.out.println(predicateFarmerClass.filtersApple(apples, yellowApple));

        System.out.println("Red:");
        System.out.println(predicateFarmerClass.filtersApple(apples, redApple));

        System.out.println("Heavy:");
        System.out.println(predicateFarmerClass.filtersApple(apples, heavyApple));

        System.out.println("light:");
        System.out.println(predicateFarmerClass.filtersApple(apples, lightApple));
    }
}
