package conditions.pract_tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }

    // Get the name for the Week
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday, Понедельник, Понеділок"; break;
            case 2: dayName = "Tuesday, Вторник, Вівторок"; break;
            case 3: dayName = "Wednesday, Среда, Середа"; break;
            case 4: dayName = "Thursday, Чегверг, Четвер"; break;
            case 5: dayName = "Friday, Пятница, П'ятниця"; break;
            case 6: dayName = "Saturday, Суббота, Субота"; break;
            case 7: dayName = "Sunday, Воскресенье, Неділя"; break;
            default:dayName = "Invalid day range";
        }

        return dayName;
    }
}
