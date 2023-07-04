package main.java.d_lambda;

import main.java.base.Apple;
import main.java.d_lambda.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateFarmerLambda {

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
