import java.sql.*;

public class MySQLDatabase {

    private Connection connection;

    // CONNECT
    public void connect() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lab3",
                    "root",
                    "YOUR_PASSWORD"
            );
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // CREATE
    public void insertCustomer(int id, String first, String last, String email, String phone) {
        String sql = "INSERT INTO customers VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, first);
            ps.setString(3, last);
            ps.setString(4, email);
            ps.setString(5, phone);

            ps.executeUpdate(); // <-- REAL DB ACTION

            System.out.println("Inserted ID: " + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    public void readCustomers() {
        String sql = "SELECT * FROM customers";

        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("first_name") + " " +
                                rs.getString("last_name") + " " +
                                rs.getString("email") + " " +
                                rs.getString("phone")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateCustomerEmail(int id, String email) {
        String sql = "UPDATE customers SET email=? WHERE id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Updated ID: " + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteCustomer(int id) {
        String sql = "DELETE FROM customers WHERE id=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Deleted ID: " + id);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}