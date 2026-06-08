/**
 * Project: Lab 3 Database CRUD
 * Purpose Details: Customer model for MySQL and MongoDB operations
 * Course: IST
 * Author: Arbi Xhepa
 * Date Developed: 06/01/2026
 * Last Date Changed: 06/01/2026
 * Rev: 1.0
 */


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