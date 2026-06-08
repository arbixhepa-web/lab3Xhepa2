/**
 * Project: Lab 3 Database CRUD
 * Purpose Details: Customer model for MySQL and MongoDB operations
 * Course: IST
 * Author: Arbi Xhepa
 * Date Developed: 06/01/2026
 * Last Date Changed: 06/01/2026
 * Rev: 1.0
 */


import java.util.ArrayList;

public class MySQLCRUD {

    // Simulated database table
    private ArrayList<Customer> customers = new ArrayList<>();

    // CREATE
    public void create(Customer c) {
        customers.add(c);
        System.out.println("MySQL INSERT SUCCESS: " + c);
    }

    // READ ALL
    public void read() {
        System.out.println("\nMySQL READ ALL CUSTOMERS:");
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }

        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    // READ ONE
    public void readById(int id) {
        System.out.println("\nMySQL READ CUSTOMER BY ID: " + id);

        for (Customer c : customers) {
            if (c.getId() == id) {
                System.out.println(c);
                return;
            }
        }

        System.out.println("Customer not found.");
    }

    // UPDATE
    public void update(Customer updatedCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == updatedCustomer.getId()) {
                customers.set(i, updatedCustomer);
                System.out.println("MySQL UPDATE SUCCESS: " + updatedCustomer);
                return;
            }
        }

        System.out.println("UPDATE FAILED: Customer not found.");
    }

    // DELETE
    public void delete(int id) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                System.out.println("MySQL DELETE SUCCESS: " + customers.get(i));
                customers.remove(i);
                return;
            }
        }

        System.out.println("DELETE FAILED: Customer not found.");
    }

    // EXTRA: COUNT
    public void count() {
        System.out.println("TOTAL CUSTOMERS: " + customers.size());
    }

    // EXTRA: CLEAR ALL
    public void clearAll() {
        customers.clear();
        System.out.println("ALL CUSTOMERS DELETED");
    }
}