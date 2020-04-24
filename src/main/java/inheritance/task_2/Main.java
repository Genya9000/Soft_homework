package inheritance.task_2;

public class Main {
    public static void main(String[] args) {
        ContractEmployee contractEmployee = new ContractEmployee();
        System.out.println(contractEmployee.calculatePay());
        System.out.println();
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        System.out.println(salariedEmployee.calculatePay());
    }
}
