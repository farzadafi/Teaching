package main.java.b_perdicate_class;

import main.java.base.Apple;
import main.java.base.Colors;

public class AppleRedColorPredicate implements ApplePredicate{

    @Override
    public Boolean test(Apple apple) {
        return apple.getColors().equals(Colors.RED);
    }
}