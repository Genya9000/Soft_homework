package loops_Array.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[10];

    public void fillArray() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter any number:");
            try {
                arr[i] = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int calculate() {
        int product = 1;
        int sum = 0;
        int temp = 0;
        int result;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) temp++;
            sum += arr[i];
        }
        if (temp == 5) {
            result = sum;
        } else {
            for (int i = 5; i < 10; i++) {
                product *= arr[i];
            }
            result = product;
        }
        return result;
    }

    public static void main(String[] args) {
        Task_2 task2 = new Task_2();
        task2.fillArray();
        System.out.println("Result of the program is " + task2.calculate());
    }
}
