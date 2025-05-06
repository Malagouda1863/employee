
public class Employee {
    String name;
    int id;
    double salary;
    int phone;
    public Employee(String name, int id, double salary,int phone) {
        this.phone = phone;
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Phone: " + phone);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ", 101, 50000.0, 1234567890);
        emp1.displayinfo();
    }
}
