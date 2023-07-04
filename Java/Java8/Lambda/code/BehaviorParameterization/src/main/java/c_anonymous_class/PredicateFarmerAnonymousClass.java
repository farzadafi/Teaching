package main.java.c_anonymous_class;

import main.java.base.Apple;
import main.java.c_anonymous_class.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateFarmerAnonymousClass {

    public List<Apple> filtersApple(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory
        ) {
            if (applePredicate.test(apple))
                result.add(apple);
        }
        return result;
    }
}
