public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Somchai\n", 40000);
        Employee e2 = new ContractEmployee("Somjai\n",8,2);

        e1.showSalary();
        e2.showSalary();

        double total = e1.calculateSalary() + e2.calculateSalary();
        System.out.println("Total : " + total + " Baht");
    }
}
