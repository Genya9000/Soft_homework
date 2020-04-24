package inheritance.task_2;

public class ContractEmployee extends Employee implements Payment{
    private int federalTaxIdmember;

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    @Override
    public int calculatePay() {
        return getHourlyRate()*getNumberHours();
    }
}
