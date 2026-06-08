public class MySQLCRUD {

    public void create(Customer c) {
        System.out.println("MySQL INSERT: " + c);
    }

    public void read() {
        System.out.println("MySQL READ all customers");
    }

    public void update(Customer c) {
        System.out.println("MySQL UPDATE: " + c);
    }

    public void delete(int id) {
        System.out.println("MySQL DELETE ID: " + id);
    }
}