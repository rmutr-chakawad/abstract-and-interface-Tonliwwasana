public abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    public void showSalary(){
        System.out.println("Name : " + name + "Salary : " + calculateSalary());
    }
}
