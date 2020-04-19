package conditions.pract_tasks.task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Country {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String nameOfCounry;
    public void enterCountry(){
        System.out.println("Enter the name of the country:");
        try {
            nameOfCounry = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getNameOfCounry() {
        return nameOfCounry;
    }
}
