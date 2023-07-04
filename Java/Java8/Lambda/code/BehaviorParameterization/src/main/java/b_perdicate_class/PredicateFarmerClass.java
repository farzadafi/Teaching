package main.java.b_perdicate_class;

import main.java.b_perdicate_class.predicate.ApplePredicate;
import main.java.base.Apple;

import java.util.ArrayList;
import java.util.List;

public class PredicateFarmerClass {

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
