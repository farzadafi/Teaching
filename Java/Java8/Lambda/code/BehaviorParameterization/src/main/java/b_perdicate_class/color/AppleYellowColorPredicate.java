package main.java.b_perdicate_class.color;

import main.java.b_perdicate_class.ApplePredicate;
import main.java.base.Apple;
import main.java.base.Colors;

public class AppleYellowColorPredicate implements ApplePredicate {

    @Override
    public Boolean test(Apple apple) {
        return apple.getColors().equals(Colors.YELLOW);
    }
}
