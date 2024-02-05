package model.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class DBConnectionTest {

    private static String URL = "jdbc:postgresql://localhost:5432/boulderdash_8?autoReconnect=true&useSSL=false&maxReconnects=10";
    private static String LOGIN = "postgres";
    private static String PASSWORD = "1234";

    private DBConnection dbConnection;

    @BeforeEach
    void setUpBeforeClass() {
        dbConnection = new DBConnection();

    }

    @AfterEach
    void tearDown() {
        dbConnection.close();
    }

    @Test
    void open() {
        try {

            Connection connection = DriverManager.getConnection(URL,LOGIN,PASSWORD);
            dbConnection.open();
            Statement statement = connection.createStatement();

            assertNotNull(connection, "Connection ne doit nul.");
            assertTrue(connection.isValid(5), "Connection doit etre valide.");
        } catch (SQLException e) {
            fail("connexion pas possible: " + e.getMessage());
        }
    }

    @Test
    void close() throws SQLException {
        Connection connection = DriverManager.getConnection(URL,LOGIN,PASSWORD);
        dbConnection.open();
        try {
            assertTrue(connection.isClosed(), "Connection est ferme ().");
        } catch (SQLException e) {
            fail("connexion fail: " + e.getMessage());
        }
    }


}