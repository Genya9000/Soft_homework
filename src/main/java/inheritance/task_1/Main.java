package inheritance.task_1;

public class Main {
    public static void main(String[] args) {
        Bird[] arr = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};
        for (Bird item: arr
             ) {
            System.out.println(item.fly());
        }
    }
}
