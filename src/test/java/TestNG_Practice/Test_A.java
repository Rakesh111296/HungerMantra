package TestNG_Practice;

import org.testng.annotations.Test;

public class Test_A {

	@Test(groups = "Smoke")
	public void TestA1() {
		System.out.println("---TestA1----");
	}
	
	
	@Test
	public void TestA2() {
		System.out.println("---TestA2----");
	}
}
