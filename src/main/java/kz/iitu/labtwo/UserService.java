package kz.iitu.labtwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;
@Component
public class UserService {
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;
    private Connection connection;
    private Statement statement;
    private ResultSet rs;

    public String getDbUrl() {
        return dbUrl;
    }
    @Autowired
    public void setDbUrl(@Value("jdbc:postgresql://localhost:5432/postgres")String dbUrl) {
        this.dbUrl = dbUrl;
    }
    public String getDbUsername() {
        return dbUsername;
    }
    @Autowired
    public void setDbUsername(@Value("postgres") String dbUsername) {
        this.dbUsername = dbUsername;
    }
    public String getDbPassword() {
        return dbPassword;
    }
    @Autowired
    public void setDbPassword(@Value("2103") String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public void init() throws SQLException {
        this.setConnection();
    }
    public void setConnection() throws SQLException {
        connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        statement = connection.createStatement();
    }

    public void getUsers() throws SQLException {
        rs = statement.executeQuery("SELECT * FROM users");
        while (rs.next()) {
            System.out.printf("%-30.30s  %-30.30s%n", rs.getInt("userid"), rs.getString("username"));
        }
    }

    public void destroy() throws SQLException {
        this.closeConnections();
    }

    public void closeConnections() throws SQLException {
        rs.close();
        connection.close();
    }
}
