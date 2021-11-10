package test.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TestClassJUnit {

  @Before
  public void setUp(){

  }
  @After
  public void tearDown(){

  }
    @Test(expected= NullPointerException.class)
    public void NullPointerTestFail(){
        int arr[]=new int[]{};
        Arrays.sort(arr);
    }
  @Test(expected= NullPointerException.class)
      public void NullPointerTest(){
          int arr[]=null;
          Arrays.sort(arr);
      }
}
