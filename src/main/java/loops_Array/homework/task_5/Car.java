package loops_Array.homework.task_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Car {
    private String type;
    private int year;
    private int capacity;

    public Car(String type, int year, int capacity) {
        this.type = type;
        this.year = year;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                '}';
    }

    public void displayByYear(Car[] arr) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int userYear = 0;
        try {
            System.out.println("Enter year you want:");
            userYear = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getYear() == userYear) {
                System.out.println(arr[i].toString());
            }
        }
    }

    public void displayOrderedByYear(Car[] arr) {
        Car temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1].getYear() < arr[j].getYear()) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }

        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Car car1 = new Car("sedan", 2019, 90);
        Car car2 = new Car("bus", 2018, 150);
        Car car3 = new Car("hatchback", 2017, 77);
        Car car4 = new Car("djeep", 2020, 120);
        Car[] car = {car1, car2, car3, car4};
        car1.displayByYear(car);
        System.out.println("Ordered cars by years are : \n");
        car1.displayOrderedByYear(car);
    }
}
