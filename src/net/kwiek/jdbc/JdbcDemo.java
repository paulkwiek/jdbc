package net.kwiek.jdbc;
import net.kwiek.model.Circle;
import net.kwiek.dao.*;
public class JdbcDemo {

    public static void main (String[] args) {
        Circle circle = new  JDBCDaoImpl().getCircle(1);
        System.out.println(circle.getName());
    }
}
