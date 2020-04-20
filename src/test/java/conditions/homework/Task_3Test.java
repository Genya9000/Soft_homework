package conditions.homework;

import conditions.homework.task_1.task_1_3.HttpError;
import org.junit.Assert;
import org.junit.Test;

public class Task_3Test {
    @Test
    public void testGetError(){
        Assert.assertSame(HttpError.SUCCESS, HttpError.getError("200"));
    }
}
