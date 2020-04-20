package loops_Array.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {

    public static void main(String[] args) {
        int[] countDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of month:");
        try {
            System.out.println("Amount of days in this month is: " +
                    countDays[Integer.parseInt(reader.readLine()) - 1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
