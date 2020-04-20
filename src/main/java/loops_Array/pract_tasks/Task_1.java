package loops_Array.pract_tasks;

public class Task_1 {
    int[] arr = {23, 21, -43, 50, 90, -3, -8, -43, -12, 180};
    int amountNegItems = 0;
    int amountPosItems = 0;
    int valuesNegItems = 0;
    int valuesPosItems = 0;

    public int maxItemInArr() {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr[0];
    }

    public int sumPosItemsInArr() {
        for (int i = 0; i < 10; i++) {
            if (arr[i] > 0) {
                valuesPosItems += arr[i];
                amountPosItems++;
            }
        }
        return valuesPosItems;
    }

    public int amountNegItems() {
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 0) {
                amountNegItems++;
                valuesNegItems += Math.abs(arr[i]);
            }
        }
        return amountNegItems;
    }

    public String compareValues() {
        return valuesNegItems > valuesPosItems ? "Negative" : "Positive";
    }

    public static void main(String[] args) {
        Task_1 task1 = new Task_1();
        System.out.println("Max item in arr is " + task1.maxItemInArr() + "\n" +
                "Sum of positive items is " + task1.sumPosItemsInArr() + "\n" +
                "Amount of negative items is " + task1.amountNegItems() + "\n" +
                "Values of " + task1.compareValues() + " items is larger");
    }
}
