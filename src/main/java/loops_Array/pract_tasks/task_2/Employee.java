package loops_Array.pract_tasks.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Employee {
    private String name;
    private int department;
    private int salary;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int userInput = 0;
        try {
            System.out.println("Enter number of department:");
            userInput = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Employee employee1 = new Employee("Sara Konor", 2, 3000);
        Employee employee2 = new Employee("Grisha", 3, 3050);
        Employee employee3 = new Employee("Masha", 2, 3900);
        Employee employee4 = new Employee("Stepan", 5, 3010);
        Employee employee5 = new Employee("Piton", 4, 3300);
        Employee[] arr = {employee1, employee2, employee3, employee4, employee5};
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getDepartment() == userInput) {
                System.out.print(arr[i].toString() + " ");
            }

        }
        Employee empl;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1].getSalary()<arr[j].getSalary()){
                    empl = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = empl;
                }
            }
        }
        System.out.println();
        System.out.println();
        Arrays.stream(arr).forEach(System.out::println);
    }
}
