package menu;

import model.User;
import service.UserService;
import utility.ApplicationContext;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    private final UserService userService = ApplicationContext.getUserService();

    public int publicMenu() {
        int command;
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

    public void enterMenu() throws SQLException {
        System.out.print("Enter your username:");
        String username = input.nextLine();
        System.out.print("Enter your password:");
        String password = input.nextLine();
        User user = userService.login(username, password);
        if (user == null)
            System.out.println("You enter a wrong username or password");
        else
            System.out.println("Enter to your account!");
    }

    public void registerMenu() throws SQLException {
        userService.save();
    }
}
