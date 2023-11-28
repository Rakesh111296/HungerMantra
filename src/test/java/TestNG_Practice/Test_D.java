package TestNG_Practice;

import org.testng.annotations.Test;

public class Test_D {
	
	@Test
	public void TestD1() {
		System.out.println("---TestD1----");
	}
	
	@Test(groups = "Regression")
	public void TestD2() {
		System.out.println("---TestD2----");
	}

}
