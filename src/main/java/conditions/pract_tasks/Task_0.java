package conditions.pract_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int count = 0;
    int number = 0;
    public void enterThreeValue(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number:");
            try {
                 number = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException ex) {
                System.out.println("Not a number !");
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (number%2 != 0) {
                count++;
            }
        }
    }

    public static void main(String[] args) {
Task_0 task_0 = new Task_0();
task_0.enterThreeValue();
        System.out.println("You entered " + task_0.count + " odd numbers");
    }


}
