public class ContractEmployee extends Employee{
    int hours;
    double hourlyRate;

    ContractEmployee(String name, int hours, double hourlyRate){
        super(name, 0);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        return hours * hourlyRate;
    }
}
