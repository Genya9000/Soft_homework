package exception.task_1_2;

public class Main {
    public static void main(String[] args) throws ColorException, TypeException {
        Plants[] arr = {new Plants(2, Color.RED, Type.FERN), new Plants(1, Color.YELLOW, Type.MOSS),
                new Plants(4, Color.BLACK, Type.SEAWEED), new Plants(5, Color.X, Type.MOSS),
                new Plants(2, Color.BLACK, Type.Y),};
        for (int i = 0; i < 5; i++) {
            try {
                if (arr[i].getColor() == Color.X) {
                    throw new ColorException();

                }
            } catch (ColorException e) {
                System.out.println("Try again");
            }
            try {
                if (arr[i].getType() == Type.Y) {
                    throw new TypeException();
                }
            } catch (TypeException e) {
                System.out.println("Try again");
            }


        }
    }
}
