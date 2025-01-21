package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl(new UserDaoJDBCImpl());
        boolean exit = false;
        userService.createUsersTable();
        userService.dropUsersTable();
        userService.cleanUsersTable();
        userService.removeUserById(1);
        userService.getAllUsers();
    }


}
