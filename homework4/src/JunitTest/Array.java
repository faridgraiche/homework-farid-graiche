package JunitTest;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Array {
    @Test

    public void ArrayListTest1(){
        ArrayList<String> fruits = new ArrayList();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        String actualResult;
        String expectedResult = String.valueOf(fruits);
        actualResult = "banana";

        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("test 1 fail");

}
     @Test
     public void ArrayListTest2() {
         ArrayList<String> cars = new ArrayList<>();
         cars.add("toyota");
         cars.add("BMW");
         cars.add("honda");
         cars.add("mercedes");

         String actualResult;
         String expectedResult = String.valueOf(cars);
         actualResult = String.valueOf(cars);
         Assert.assertEquals(expectedResult, actualResult);
         System.out.println("test 2 passed");

     }
     @Test
     public void ArrayListTes3(){
        ArrayList<String > USStates = new ArrayList<>();
        USStates.add("New york");
        USStates.add("new jersey");
        USStates.add("pennsylvania");

        String actualResult;
        String expectedResult = String.valueOf(USStates);
        actualResult = String.valueOf(USStates);

        Assert.assertEquals(expectedResult, actualResult);
         System.out.println("test 3 passed");


     }





}
