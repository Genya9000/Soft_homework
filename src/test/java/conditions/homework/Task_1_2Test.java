package conditions.homework;

import conditions.homework.task_1.Task_1_2;
import org.junit.Assert;
import org.junit.Test;

public class Task_1_2Test {
    Task_1_2 task_1_2 = new Task_1_2();
    int[] arr = {23, 12, 90 };
    @Test
    public void testGetMax(){
        Assert.assertEquals(90, task_1_2.getMax(arr));
    }
    @Test
    public void testGetMin(){
        Assert.assertEquals(12, task_1_2.getMin(arr));
    }
}
