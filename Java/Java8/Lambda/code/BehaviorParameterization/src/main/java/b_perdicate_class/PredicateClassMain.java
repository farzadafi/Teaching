package main.java.b_perdicate_class;

import main.java.b_perdicate_class.predicate.ApplePredicate;
import main.java.b_perdicate_class.predicate.color.AppleGreenColorPredicate;
import main.java.b_perdicate_class.predicate.color.AppleRedColorPredicate;
import main.java.b_perdicate_class.predicate.color.AppleYellowColorPredicate;
import main.java.b_perdicate_class.predicate.weight.AppleHeavyWeightPredicate;
import main.java.b_perdicate_class.predicate.weight.AppleLightWeightPredicate;
import main.java.base.Inventory;

public class PredicateClassMain {
    public static void main(String[] args) {
        PredicateFarmerClass predicateFarmerClass = new PredicateFarmerClass();
        ApplePredicate greenApple = new AppleGreenColorPredicate();
        ApplePredicate redApple = new AppleRedColorPredicate();
        ApplePredicate yellowApple = new AppleYellowColorPredicate();
        ApplePredicate heavyApple = new AppleHeavyWeightPredicate();
        ApplePredicate lightApple = new AppleLightWeightPredicate();

        System.out.println("Green:");
        System.out.println(predicateFarmerClass.filtersApple(Inventory.APPLE_LIST, greenApple));

        System.out.println("Yellow:");
        System.out.println(predicateFarmerClass.filtersApple(Inventory.APPLE_LIST, yellowApple));

        System.out.println("Red:");
        System.out.println(predicateFarmerClass.filtersApple(Inventory.APPLE_LIST, redApple));

        System.out.println("Heavy:");
        System.out.println(predicateFarmerClass.filtersApple(Inventory.APPLE_LIST, heavyApple));

        System.out.println("light:");
        System.out.println(predicateFarmerClass.filtersApple(Inventory.APPLE_LIST, lightApple));
    }
}
