package conditions.homework;

import conditions.homework.task_1.Task_1_1;
import org.junit.Assert;
import org.junit.Test;

public class Task_1_1Test {
    Task_1_1 task_1_1 = new Task_1_1();
    @Test
    public void testCheckEnter(){
        Assert.assertTrue(task_1_1.checkEnter(7));
    }
}
