public class FullTimeEmployee extends Employee{
    FullTimeEmployee(String name, double salary){
        super(name, salary);
    }

    public double calculateSalary(){
        return salary;
    }
}
