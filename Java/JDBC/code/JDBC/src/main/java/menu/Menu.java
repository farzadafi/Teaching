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
        System.out.println("***WELCOME***");
        System.out.println("1-Sing in");
        System.out.println("2-Sing Up");
        System.out.println("3-Exit!");
        System.out.print("Please enter a number:");
        int command = input.nextInt();
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
        else {
            boolean isTrue = true;
            while (isTrue) {
                System.out.println("==========================");
                System.out.println("Dear " + user.getFirstname());
                System.out.println("1-update my firstname");
                System.out.println("2-delete my account");
                System.out.println("3-Exit!");
                System.out.print("Please enter a number:");
                int command = input.nextInt();
                input.nextLine();
                switch (command) {
                    case 1 -> userService.updateFirstname(user);
                    case 2 -> System.out.println("naser");
                    case 3 -> isTrue = false;
                    default -> System.out.println("enter a correct number :)");
                }
                ;
            }
        }
    }

    public void registerMenu() throws SQLException {
        userService.save();
    }
}
