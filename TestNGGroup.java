package com.testng;

import org.testng.annotations.Test;

public class TestNGGroup {
  @Test(groups = {"red"})
  public void red1() {
	  System.out.println("this is red1");
  }
  @Test(groups = {"red"})
  public void red() {
	  System.out.println("this is red");
  }
  @Test(groups = {"red"})
  public void red3() {
	  System.out.println("this is red3");
  }
  @Test(groups = {"green"})
  public void green1() {
	  System.out.println("this is green 1");
  }
  @Test(groups = {"green"})
  public void green2() {
	  System.out.println("this is green 2");
  }
  @Test(groups = {"green"})
  public void green3() {
	  System.out.println("this is green 3");
  }
  
  @Test(groups = {"red","green"})
  public void greenandred() {
	  System.out.println("this is green and red both");
  }
}
