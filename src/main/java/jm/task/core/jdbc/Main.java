package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {

        Util.getConnection();
        UserServiceImpl userService = new UserServiceImpl();
        //UserDao userDao = new UserDaoJDBCImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 20);
        System.out.println("User с именем - Ivan добавлен в базу данных");
        userService.saveUser("Olga", "Titova", (byte) 25);
        System.out.println("User с именем - Olga добавлена в базу данных");
        userService.saveUser("Zaur", "Tregulov", (byte) 31);
        System.out.println("User с именем - Zaur добавлен в базу данных");
        userService.saveUser("Alex", "Vlasov", (byte) 38);
        System.out.println("User с именем - Alex добавлен в базу данных");

        System.out.println(userService.getAllUsers());
//        userDao.cleanUsersTable();
//        userDao.dropUsersTable();




       //  реализуйте алгоритм здесь
    }
}
