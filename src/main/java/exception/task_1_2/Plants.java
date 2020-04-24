package exception.task_1_2;

public class Plants {
    private int size;
    private Color color;
    private Type type;

    public Plants(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Plants{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
