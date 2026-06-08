/**
 * Project: Lab 3 Database CRUD
 * Purpose Details: Student model class used for MySQL CRUD operations
 * Course: IST
 * Author: Arbi Xhepa
 * Date Developed: 06/01/2026
 * Last Date Changed: 06/01/2026
 * Rev: 1.0
 */

public class Student {

    /**
     * The unique ID of the student.
     */
    private int id;

    /**
     * The first name of the student.
     */
    /**
     * Project: Lab 3 Database CRUD
     * Purpose Details: Student model class used for MySQL CRUD operations
     * Course: IST
     * Author: Arbi Xhepa
     * Date Developed: 06/01/2026
     * Last Date Changed: 06/01/2026
     * Rev: 1.0
     */

    public class Student {

        /**
         * The unique ID of the student.
         */
        private int id;

        /**
         * The first name of the student.
         */
        private String firstName;

        /**
         * The last name of the student.
         */
        private String lastName;

        /**
         * The age of the student.
         */
        private int age;

        /**
         * The email address of the student.
         */
        private String email;

        /**
         * Default constructor for Student.
         */
        public Student() {
        }

        /**
         * Creates a Student with all required fields.
         *
         * @param id The student ID
         * @param firstName The first name
         * @param lastName The last name
         * @param age The age of the student
         * @param email The email address
         */
        public Student(int id, String firstName, String lastName, int age, String email) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.email = email;
        }

        /**
         * Gets the student ID.
         *
         * @return student ID
         */
        public int getId() {
            return id;
        }

        /**
         * Sets the student ID.
         *
         * @param id student ID
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * Gets first name.
         *
         * @return first name
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets first name.
         *
         * @param firstName first name
         */
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        /**
         * Gets last name.
         *
         * @return last name
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets last name.
         *
         * @param lastName last name
         */
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        /**
         * Gets age.
         *
         * @return age
         */
        public int getAge() {
            return age;
        }

        /**
         * Sets age.
         *
         * @param age student age
         */
        public void setAge(int age) {
            this.age = age;
        }

        /**
         * Gets email.
         *
         * @return email address
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets email.
         *
         * @param email email address
         */
        public void setEmail(String email) {
            this.email = email;
        }

        /**
         * Returns a string representation of the Student object.
         *
         * @return formatted student details
         */
        @Override
        public String toString() {
            return id + " " + firstName + " " + lastName + " " + age + " " + email;
        }
    }