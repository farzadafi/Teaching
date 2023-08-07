package service;

import model.User;
import repository.UserRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class UserService {
    private final Scanner input;
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.input = new Scanner(System.in);
    }

    public void save() throws SQLException {
        User user = getFullInformation();
        int result = userRepository.save(user);
        if (result != 0)
            System.out.println(user.getFirstname() + "successful added!");
        else
            System.out.println("Something is wrong!");
    }

    public User login(String username, String password) throws SQLException {
        User user = userRepository.login(username);
        if ((user != null) && (user.getPassword().equals(password)))
            return user;
        else
            return null;
    }

    public User getFullInformation() {
        System.out.print("Enter your firstname:");
        String firstname = input.nextLine();
        System.out.print("Enter your lastname:");
        String lastname = input.nextLine();
        System.out.print("Enter your username:");
        String username = input.nextLine();
        System.out.print("Enter your password:");
        String password = input.nextLine();
        return new User(firstname, lastname, username, password);
    }
}
