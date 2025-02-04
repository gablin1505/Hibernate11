package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl(new UserDaoHibernateImpl());
        userService.saveUser("Test","Test",(byte)1);
        userService.createUsersTable();
        userService.dropUsersTable();
        userService.cleanUsersTable();
        userService.removeUserById(1);
        userService.getAllUsers();
    }


}
