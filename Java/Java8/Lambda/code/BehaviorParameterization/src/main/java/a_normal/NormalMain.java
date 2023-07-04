package main.java.a_normal;

import main.java.base.Inventory;

public class NormalMain {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();

        System.out.println("Green:");
        System.out.println(farmer.filterGreenApple(Inventory.APPLE_LIST));

        System.out.println("Yellow:");
        System.out.println(farmer.filterYellowApple(Inventory.APPLE_LIST));

        System.out.println("Red:");
        System.out.println(farmer.filterRedApple(Inventory.APPLE_LIST));

        System.out.println("Heavy:");
        System.out.println(farmer.filterHeavyApple(Inventory.APPLE_LIST));

        System.out.println("light:");
        System.out.println(farmer.filterLightApple(Inventory.APPLE_LIST));
    }
}
