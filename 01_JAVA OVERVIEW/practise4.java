public class practise4 {
    public class Employee {
        // Properties of the Employee class
        private int salary;
        private String name;
    
        // Constructor to initialize Employee object
        public Employee(int salary, String name) {
            this.salary = salary;
            this.name = name;
        }
    
        // Method to get the salary
        public int getSalary() {
            return salary;
        }
    
        // Method to get the name
        public String getName() {
            return name;
        }
    
        // Method to set the name
        public void setName(String name) {
            this.name = name;
        }
    
     
    }
    // Main method (for testing purposes)
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee emp = new Employee(50000, "John Doe")

        // Get and display salary
        int empSalary = emp.getSalary();
        System.out.println("Employee Salary: $" + empSalary);

        // Get and display name
        String empName = emp.getName();
        System.out.println("Employee Name: " + empName);

        // Change name and display again
        emp.setName("Jane Doe");
        empName = emp.getName();
        System.out.println("Updated Employee Name: " + empName);
    }
    
    
}
