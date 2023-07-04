package main.java.c_anonymous_class;

import main.java.base.Apple;
import main.java.base.Colors;
import main.java.base.Inventory;
import main.java.c_anonymous_class.predicate.ApplePredicate;

public class AnonymousClassMain {
    public static void main(String[] args) {
        PredicateFarmerAnonymousClass predicateFarmerAnonymousClass = new PredicateFarmerAnonymousClass();

        System.out.println("Green:");
        System.out.println(predicateFarmerAnonymousClass.filtersApple(Inventory.APPLE_LIST, new ApplePredicate() {
            @Override
            public Boolean test(Apple apple) {
                return apple.getColors().equals(Colors.GREEN);
            }
        }));

        System.out.println("Yellow:");
        System.out.println(predicateFarmerAnonymousClass.filtersApple(Inventory.APPLE_LIST, new ApplePredicate() {
            @Override
            public Boolean test(Apple apple) {
                return apple.getColors().equals(Colors.YELLOW);
            }
        }));

        System.out.println("Red:");
        System.out.println(predicateFarmerAnonymousClass.filtersApple(Inventory.APPLE_LIST, new ApplePredicate() {
            @Override
            public Boolean test(Apple apple) {
                return apple.getColors().equals(Colors.RED);
            }
        }));

        System.out.println("Heavy:");
        System.out.println(predicateFarmerAnonymousClass.filtersApple(Inventory.APPLE_LIST, new ApplePredicate() {
            @Override
            public Boolean test(Apple apple) {
                return apple.getWeight() >= 150;
            }
        }));

        System.out.println("light:");
        System.out.println(predicateFarmerAnonymousClass.filtersApple(Inventory.APPLE_LIST, new ApplePredicate() {
            @Override
            public Boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        }));
    }
}
