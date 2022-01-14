package JunitTest;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {
    @Test
    public void test(){
        int a = 5;
        int b = 10;
        int actualTotal;
        int expectedTotal = 15;
        actualTotal = a +b;
        Assert.assertEquals(expectedTotal, actualTotal);
        System.out.println("test1 passed");

    }
    @Test
    public void test2(){
        int a = 20;
        int b = 6;
        int actualTotal;
        int expectedTotal = 100;
        actualTotal = a*b;
        Assert.assertEquals(expectedTotal, actualTotal);
        System.out.println("test2 passed");
    }
        @Test
    public void test3(){
        int a = 40;
        int b = 5;
        int actualResult;
        int expectedResult = 8;
        actualResult = a/b;
        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("test 3 passed");


    }
}
