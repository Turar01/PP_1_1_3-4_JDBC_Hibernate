package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mytest";
    private static final String USER = "root";
    private static final String PASSWORD = "my179sql";


    public static Connection getConnection() {
        Connection connection = null;//todo комментарии ..лишняя инициализация - излишни. Есть даже книжка такая, "Чистый код" Д.Блох . Будут требовать
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка при установке соединения с базой данных");
        }
        return connection;
    }
}
