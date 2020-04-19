package conditions.homework.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1_1 {
    public boolean checkEnter(float entering){
        if(entering < -5.0f || entering > 5.0f)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Task_1_1 task11 = new Task_1_1();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float[] arr = new float[3];
        System.out.println("Enter three numbers:");
        for (int i = 0; i < 3; i++) {
            try {
                arr[i] = Float.parseFloat(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(task11.checkEnter(arr[i])){
                System.out.println("You enter incorrect number, try again:");
                i--;
            }
        }

        System.out.println(" You enter such numbers: " + arr[0] + " "+ arr[1] + " "+arr[2]);
    }
}
