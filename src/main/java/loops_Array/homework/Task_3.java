package loops_Array.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[5];
    int minItem;

    public Task_3 fillArray() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter any number:");
            try {
                arr[i] = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return this;
    }

    public int posSecondPosNumber() {
        int temp = 0;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp++;
                if (temp == 2) {
                    pos = i;
                    break;
                }
            }
        }
        return pos;
    }

    public int minItem() {
        int temp;
        int[] arrSort = new int[5];
        System.arraycopy(arr, 0, arrSort, 0, 5);
        for (int i = 0; i < arrSort.length; i++) {
            for (int j = 1; j < arrSort.length; j++) {
                if (arrSort[j - 1] < arrSort[j]) {
                    temp = arrSort[j];
                    arrSort[j] = arrSort[j - 1];
                    arrSort[j - 1] = temp;
                }
            }
        }
        minItem = arrSort[arr.length - 1];
        return minItem;
    }

    public int posMinItem() {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minItem) {
                pos = i;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Task_3 task3 = new Task_3();
        System.out.println("Position of second positive item is " + task3.fillArray().posSecondPosNumber());
        System.out.println("Minimal item in array is " + task3.minItem());
        System.out.println("Position of minimal item is " + task3.posMinItem());
    }
}
