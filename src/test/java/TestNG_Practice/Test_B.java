package TestNG_Practice;

import org.testng.annotations.Test;

public class Test_B {

	@Test(groups = "Smoke")
	public void TestB1() {
		System.out.println("---TestB1----");
	}
	
	@Test
	public void TestB2() {
		System.out.println("---TestB2----");
	}
}
