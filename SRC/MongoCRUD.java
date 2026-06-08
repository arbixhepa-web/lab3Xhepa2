public class MongoCRUD {

    public void create(Customer c) {
        System.out.println("Mongo INSERT: " + c);
    }

    public void read() {
        System.out.println("Mongo READ all customers");
    }

    public void update(Customer c) {
        System.out.println("Mongo UPDATE: " + c);
    }

    public void delete(int id) {
        System.out.println("Mongo DELETE ID: " + id);
    }
}