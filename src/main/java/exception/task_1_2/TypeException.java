package exception.task_1_2;

public class TypeException extends Exception {
    private String message = "Available plant types: SEAWEED, MOSS, FERN";

    public TypeException() {
        System.out.println(message);
    }
}
