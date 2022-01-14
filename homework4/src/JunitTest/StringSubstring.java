package JunitTest;

import org.junit.Assert;
import org.junit.Test;


public class StringSubstring {
    @Test
    public void test1(){
        String a = "hello world";
        String b = "hello";

        String actualResult;
        boolean expectedResult = a.contains(b);
        actualResult = "hello";

        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("passed");

    }
    @Test
    public void test2(){
        String a = "Elyabsa";
        String b = "El";
        boolean actualResult;
         boolean expectedResult = a.contains(b);
         actualResult = true;

         Assert.assertEquals(expectedResult,actualResult);
        System.out.println("test 2 passed");
    }
    @Test
    public void test3(){
        String a = "it is cold outside";
        String b = "cold";
        boolean actualResult;
        boolean expectedResult = a.contains(b);
        actualResult = true;

        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("test 3 passed");

    }
}
