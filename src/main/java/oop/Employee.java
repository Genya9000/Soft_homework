package oop;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static int totalSum;

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee() {
    }
    public int getSalary(){
        return rate*hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
    public double getBonuses(){
        return 0.1*getSalary();
    }

    public static void main(String[] args) {
        Employee empl1 = new Employee("Piter", 20, 8);
        Employee empl2 = new Employee("Gnom", 24, 9);
        Employee empl3 = new Employee("Vasya", 27, 10);
        System.out.println(empl1.getSalary()+ empl2.getSalary() + empl3.getSalary());
    }

}
