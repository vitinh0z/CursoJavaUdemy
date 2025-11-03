package BancoDeDadosJDBC;

import db.DB;

import main.java.db.DbException;

import java.sql.*;

import java.text.SimpleDateFormat;

public class Main {

    public static void main (String[] args){


        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement("UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE "
                    + "(DepartmentId = ?)"

            );

            preparedStatement.setDouble(1, 200);
            preparedStatement.setInt(2, 2);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("DONE: " + rowsAffected);
        } catch (SQLException e ){
            e.printStackTrace();
        }

        finally {
            DB.closeStatament(preparedStatement);
            DB.closeConnection();
        }

    }
}
