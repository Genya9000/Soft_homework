package conditions.homework.task_1.task_1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
    public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of error:");
        try {
            System.out.println(HttpError.getError(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
