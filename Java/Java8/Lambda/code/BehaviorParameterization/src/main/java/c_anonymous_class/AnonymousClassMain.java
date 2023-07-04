package main.java.c_anonymous_class;

import main.java.base.Apple;
import main.java.base.Colors;
import main.java.c_anonymous_class.predicate.ApplePredicate;

import java.util.Arrays;
import java.util.List;

public class AnonymousClassMain {
    public static void main(String[] args) {
        PredicateFarmerAnonymousClass predicateFarmerAnonymousClass = new PredicateFarmerAnonymousClass();
        List<Apple> apples = Arrays.asList(
                new Apple(Colors.YELLOW, 200D, "Iran"),
                new Apple(Colors.RED, 100D, "Iran"),
                new Apple(Colors.GREEN, 250D, "Iran"),
                new Apple(Colors.YELLOW, 100D, "Iran"),
                new Apple(Colors.GREEN, 50D, "Iran")
        );

        System.out.println("Green:");
        System.out.println(predicateFarmerAnonymousClass.filtersApple(apples, new ApplePredicate() {
            @Override
            public Boolean test(Apple apple) {
                return apple.getColors().equals(Colors.GREEN);
            }
        }));

        System.out.println("Yellow:");
        System.out.println(predicateFarmerAnonymousClass.filtersApple(apples, new ApplePredicate() {
            @Override
            public Boolean test(Apple apple) {
                return apple.getColors().equals(Colors.YELLOW);
            }
        }));

        System.out.println("Red:");
        System.out.println(predicateFarmerAnonymousClass.filtersApple(apples, new ApplePredicate() {
            @Override
            public Boolean test(Apple apple) {
                return apple.getColors().equals(Colors.RED);
            }
        }));

        System.out.println("Heavy:");
        System.out.println(predicateFarmerAnonymousClass.filtersApple(apples, new ApplePredicate() {
            @Override
            public Boolean test(Apple apple) {
                return apple.getWeight() >= 150;
            }
        }));

        System.out.println("light:");
        System.out.println(predicateFarmerAnonymousClass.filtersApple(apples, new ApplePredicate() {
            @Override
            public Boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        }));
    }
}
