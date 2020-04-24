package inheritance.task_2;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return getHourlyRate();
    }
}
