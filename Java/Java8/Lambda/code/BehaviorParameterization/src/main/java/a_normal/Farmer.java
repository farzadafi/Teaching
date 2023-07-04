package main.java.a_normal;

import main.java.base.Apple;
import main.java.base.Colors;

import java.util.ArrayList;
import java.util.List;

public class Farmer {

    public List<Apple> filterGreenApple(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory
        ) {
            if (apple.getColors().equals(Colors.GREEN))
                result.add(apple);
        }
        return result;
    }

    public List<Apple> filterRedApple(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory
        ) {
            if (apple.getColors().equals(Colors.RED))
                result.add(apple);
        }
        return result;
    }

    public List<Apple> filterYellowApple(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory
        ) {
            if (apple.getColors().equals(Colors.YELLOW))
                result.add(apple);
        }
        return result;
    }

    public List<Apple> filterHeavyApple(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory
        ) {
            if (apple.getWeight() > 150)
                result.add(apple);
        }
        return result;
    }
}
