package loops_Array.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_4 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[20];
    int userInput;

    public void fillArray() {
        for (int i = 0; ; i++) {
            try {
                System.out.println("Enter any number:");
                userInput = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (userInput >= 0) {
                arr[i] = userInput;
            } else break;
        }
    }

    public int countProductEvenItem() {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                product *= arr[i];
            }
        }
        return product;
    }

    public static void main(String[] args) {
        Task_4 task4 = new Task_4();
        task4.fillArray();
        System.out.println("Product of even items is " + task4.countProductEvenItem());

    }
}
