package TestNG_Practice;

import org.testng.annotations.Test;

public class Test_C {

	@Test
	public void TestC1() {
		System.out.println("---TestC1----");
	}
	
	@Test(groups = "Smoke")
	public void TestC2() {
		System.out.println("---TestC2----");
	}
}
