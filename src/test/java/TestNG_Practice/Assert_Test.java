package TestNG_Practice;

import static org.testng.Assert.*;


import org.testng.annotations.Test;

public class Assert_Test {

	
	@Test
	public void hardAssert () {
		String exp = "HI";
		String act = "Hello";
		System.out.println("----Test1----");
		System.out.println("----Test2----");
		assertEquals(act, exp);
		System.out.println("----Test3----");
		System.out.println("----Test4----");
		System.out.println("----Test5----");
		System.out.println("----Test6----");
		
	}
	
	@Test
	public void hardAssert1 () {
		
		int exp = 1;
		int act = 0;
		System.out.println("----Test7----");
		assertEquals(act, exp);
		System.out.println("----Test8----");
		System.out.println("----Test9----");
		
		
	}
}
