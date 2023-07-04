package main.java.b_perdicate_class.predicate.weight;

import main.java.b_perdicate_class.predicate.ApplePredicate;
import main.java.base.Apple;

public class AppleLightWeightPredicate implements ApplePredicate {

    @Override
    public Boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}
