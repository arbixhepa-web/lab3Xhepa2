import java.sql.*;

public class MySQLCrud {

    public void insertCustomer(Customer c) {

        String sql = "INSERT INTO customer (id, firstName, lastName, email, phone) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = MySQLDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, c.getId());
            ps.setString(2, c.getFirstName());
            ps.setString(3, c.getLastName());
            ps.setString(4, c.getEmail());
            ps.setString(5, c.getPhone());

            ps.executeUpdate();
            System.out.println("Customer inserted!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}