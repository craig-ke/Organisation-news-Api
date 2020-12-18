package dao;

import org.sql2o.Sql2o;

public class DB {

    public static Sql2o sql2o = new Sql2o(
            "jdbc:postgresql://localhost:5432/org", "craig", "craig101");

//    public static Sql2o sql2o = new Sql2o(
//            "postgres://kjbecicbngcrch:a356a5884815ca9e0bc2cd40edeec2dbf468422436953691941bce27a039a4ca@ec2-54-211-99-192.compute-1.amazonaws.com:5432/d5i6v98olku3b",
//            "kjbecicbngcrch",
//            "a356a5884815ca9e0bc2cd40edeec2dbf468422436953691941bce27a039a4ca");
}
