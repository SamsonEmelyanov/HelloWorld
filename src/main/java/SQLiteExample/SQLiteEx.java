package SQLiteExample;

import jdk.nashorn.internal.ir.annotations.Reference;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.Arrays;
import java.util.Collections;

public class SQLiteEx {

private static Connection connection;
private static Statement statement;

    public static void main(String[] args) throws IllegalAccessException, SQLException {
        Reflect o=new Reflect();
        Class reflectClass=Reflect.class;
        Field[] sourceFields = reflectClass.getDeclaredFields();
        for(Field f : sourceFields){
            if (f.isAnnotationPresent(Deprecated.class)){
                connect();
                statement.executeUpdate("INSERT INTO students (name) VALUES ('"+f.get(o)+"');");
                disconnect();
                System.out.println("Element "+f.get(o)+" added to data base");
            }
            }

        try{
            connect();
            insertEx();
            ResultSet rs = statement.executeQuery("SELECT * FROM students;");
            while (rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString("name")+ " " + rs.getInt("score"));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            disconnect();
        }
    }

    private static void insertEx() throws SQLException {
        statement.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob3', 100);");
    }
    public static void connect() throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
            connection= DriverManager.getConnection("jdbc:sqlite:main.db");
            statement=connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Unable to connect");
        }
    }
    public static void disconnect(){
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
class Reflect{
    @Deprecated
    public String field1 ="Dod";
    @Reference
    public int field2=5;
    @Deprecated
    public String field3="Cat";
    @Reference
    public double field4=2.123;
}
