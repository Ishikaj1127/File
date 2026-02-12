package com.example.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseUtil {
    private static final String url = "jdbc:mysql://localhost:3306/file";
    private static final String username = "root";
    private static final String password = "gamma123";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static void initDatabase() throws SQLException {
        String urlNodb = "jdbc:mysql://localhost:3306";
        try (Connection connect = DriverManager.getConnection(urlNodb, username, password)) {
            Statement stmt = connect.createStatement();
            stmt.executeUpdate("create database if not exists file");
        }

        try (Connection connect = getConnection();
                Statement stmt = connect.createStatement()) {
            String sql = "create table if not exists users(" +
                    "id int primary Key auto_incrrement," +
                    "fname varchar(50) not null," +
                    "lname varchar(50) not null," +
                    "number varchar(50) not null unique," +
                    "dob varchar(50) not null," +
                    "gender varchar(10) not null," +
                    "password varchar(50) not null unique);";
            stmt.executeUpdate(sql);
        }
    }

    public static void addUser(String fname, String lname, String number, String dob, String gender, String password)
            throws SQLException {
        String sql = "insert into users(fname, lname, dob, gender, number, password) values(?, ?, ?, ?, ?, ?)";
        try (Connection connect = getConnection();
                PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setString(1, fname);
            pstmt.setString(2, lname);
            pstmt.setString(3, number);
            pstmt.setString(4, dob);
            pstmt.setString(5, gender);
            pstmt.setString(6, password);
            pstmt.executeUpdate();
        }
    }

    public static String userLogin(String numberInput, String passInput) throws SQLException {
        String sql = "select number from users where number = ?, password = ? limit 1";
        try (Connection connect = getConnection();
                PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setString(1, numberInput);
            pstmt.setString(2, passInput);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("number");
                }
            }
        }
        return null;
    }
}
