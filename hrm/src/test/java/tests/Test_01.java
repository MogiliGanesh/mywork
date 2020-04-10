package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test_01 {
  @Test
  public void f() {
	  System.out.println("how are you");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("hello");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("all");
  }

}
