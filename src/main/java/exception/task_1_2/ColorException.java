package exception.task_1_2;

public class ColorException extends Exception {
    private String message = "Available plant colors: Red, Black, Yellow";

    public ColorException() {
        System.out.println(message);
    }
}
