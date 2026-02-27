public abstract class Employee {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract Method
    abstract double calculateSalary();

    // Main Method
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Aamna", 101, 30000);
        Employee e2 = new PartTimeEmployee("Sara", 102, 10, 500);

        System.out.println("Full Time Salary: " + e1.calculateSalary());
        System.out.println("Part Time Salary: " + e2.calculateSalary());
    }
}

// Full Time Employee
class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// Part Time Employee
class PartTimeEmployee extends Employee {

    double hours;
    double rate;

    PartTimeEmployee(String name, int id, double hours, double rate) {
        super(name, id);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculateSalary() {
        return hours * rate;
    }
}