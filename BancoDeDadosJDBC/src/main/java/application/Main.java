package application;

import db.DB;

import main.java.db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class Main {

    public static void main (String[] args){


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Connection connection = null;

        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS
            );

            preparedStatement.setString(1, "Carl Sagan");
            preparedStatement.setString(2, "CarlSagan@gmail.com");
            preparedStatement.setDate(3, new java.sql.Date(simpleDateFormat.parse("22/04/1980").getTime()));
            preparedStatement.setDouble(4, 3000);
            preparedStatement.setInt(5, 4);


            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();

                while (resultSet.next()){
                    int id = resultSet.getInt(1);
                    System.out.println("Done: ID = " + id);
                }
            }
            else{
                System.out.println("No rows affected");
            }

            System.out.println("DONE: " + rowsAffected);

        } catch (Exception e) {
            throw new DbException(e.getMessage());
        }
        finally {

            DB.closeConnection();
            DB.closeStatament(preparedStatement);

        }

    }
}
