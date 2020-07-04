import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test2 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1, 4, 4, 1, 4, 4}, true},
                {new int[]{1, 1, 1, 1, 1, 1, 1, 1}, false},
                {new int[]{4, 4, 4, 4}, false},
                {new int[]{1, 4, 4, 1, 1, 4, 3}, false}
        });
    }
    private int[] in;
    private boolean out;

    public Test2 (int[] in, boolean out) {
        this.in = in;
        this.out = out;
    }

    private Task2 task2;

    @Before
    public void startTest() {
        task2 = new Task2();
    }

    @Test
    public void structure() {
        Assert.assertEquals(Task2.structure(in), out);
    }
}
