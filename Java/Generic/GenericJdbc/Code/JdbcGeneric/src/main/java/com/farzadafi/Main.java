package com.farzadafi;

import com.farzadafi.model.User;
import com.farzadafi.service.UserService;
import com.farzadafi.util.ApplicationContext;

import java.sql.SQLException;
import java.util.List;

// todo -> exception handling is not good in this app
public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = ApplicationContext.getUserServiceImpel();
        //add User
        User user = new User(null, "farzad", "afshar", "farzadafi", "aaa");
        userService.save(user);

        //get All user
        List<User> all = userService.findAll();
        System.out.println(all.size());

        // get user by id
        User byId = userService.findById(1);
        System.out.println(byId.getUsername());

        // update user
        user.setId(1);
        user.setUsername("farzadAfiiii");
        userService.update(user);
        User foundUserAfterUpdate = userService.findById(1);
        System.out.println(foundUserAfterUpdate.getUsername());

        // remove user :)
        userService.delete(1);
    }
}
