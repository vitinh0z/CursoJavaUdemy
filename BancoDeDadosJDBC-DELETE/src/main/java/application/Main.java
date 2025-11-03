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
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement(
                    "DELETE FROM deparment "
                    + "WHERE "
                    + "Id = ?"
            );

            preparedStatement.setInt(1, 2);

            int rowsAffected = preparedStatement.executeUpdate();


            System.out.println("DONE: " + rowsAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeConnection();
            DB.closeStatament(preparedStatement);
        }
    }
}
