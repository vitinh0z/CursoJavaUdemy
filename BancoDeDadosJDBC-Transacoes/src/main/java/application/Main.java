package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Main {

    public static void main (String[] args){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Connection connection = null;
        Statement statement = null;

        try {

            connection.setAutoCommit(false);

            connection = DB.getConnection();

            statement = connection.createStatement();

            int rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
            int x = 1;

            if (x < 2){
                throw new SQLException("Fake error");
            }

            int rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit();

            System.out.println("Rows affected Department 1: " + rows1);
            System.out.println("Rows affected Department 2: " + rows2);

        } catch (SQLException e) {
            try {
                connection.rollback();
                throw  new DbException("Transaction rolled back! Caused by: " + e.getMessage());

            } catch (SQLException ex) {
                throw new DbException("erro: trying to rollback " + ex);
            }
        }
        finally {
            DB.closeConnection();
            DB.closeStatament(statement);
        }
    }
}
