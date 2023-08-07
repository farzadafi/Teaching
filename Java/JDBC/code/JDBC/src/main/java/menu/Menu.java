package menu;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public int publicMenu() {
        int command = 1;
        System.out.println("***WELCOME***");
        System.out.println("1-Sing in");
        System.out.println("2-Sing Up");
        System.out.println("3-Exit!");
        System.out.print("Please enter a number:");
        command = input.nextInt();
        input.nextLine();
        return switch (command) {
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 3;
            default -> 0;
        };
    }
}
