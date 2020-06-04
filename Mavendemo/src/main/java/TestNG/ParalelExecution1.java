package TestNG;

public class ParalelExecution1 {

	 @Test(priority=2,description="Firsttestcase")
	  public void testcase1() {
		  System.out.println("testcase4");
	  }
	  @Test(priority=3)
	  public void testcase2() {
		  System.out.println("testcase5");
	 
	 }
	  @Test(priority=1)
	  public void testcase3() {
		  System.out.println("testcase6");
	}

	}

}
