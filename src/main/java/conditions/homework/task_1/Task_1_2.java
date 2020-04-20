package conditions.homework.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_1_2 {
    public int getMax(int[] array){
        return Arrays.stream(array).max().getAsInt();
    }
    public int getMin(int[] array){
        return Arrays.stream(array).min().getAsInt();
    }

    public static void main(String[] args) {
        Task_1_2 task12 = new Task_1_2();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int max, min;

        System.out.println("Enter three numbers:");
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            try {
                arr[i] = Integer.parseInt(reader.readLine());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*max = Arrays.stream(arr).max().getAsInt();
        min = Arrays.stream(arr).min().getAsInt();*/
        System.out.println("Max number is " +task12.getMax(arr) + "\nMin number is "+task12.getMin(arr));
    }
}
