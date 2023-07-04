package main.java.a_normal;

import main.java.base.Colors;
import main.java.base.Inventory;

public class NormalMain {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();

        System.out.println("Green:");
        System.out.println(farmer.filterColorApple(Inventory.APPLE_LIST, Colors.GREEN));

        System.out.println("Yellow:");
        System.out.println(farmer.filterColorApple(Inventory.APPLE_LIST, Colors.YELLOW));

        System.out.println("Red:");
        System.out.println(farmer.filterColorApple(Inventory.APPLE_LIST, Colors.RED));

        System.out.println("Heavy:");
        System.out.println(farmer.filterHeavyApple(Inventory.APPLE_LIST));

        System.out.println("light:");
        System.out.println(farmer.filterLightApple(Inventory.APPLE_LIST));
    }
}
