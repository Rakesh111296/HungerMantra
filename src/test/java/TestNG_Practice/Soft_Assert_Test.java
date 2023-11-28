package TestNG_Practice;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Test {
	
	@Test
	public void hardAssert () {
		SoftAssert sa = new SoftAssert();
		String exp = "HI";
		String act = "Hello";
		System.out.println("----Test1----");
		System.out.println("----Test2----");
		sa.assertEquals(act, exp);
		System.out.println("----Test3----");
		System.out.println("----Test4----");
		System.out.println("----Test5----");
		System.out.println("----Test6----");
		sa.assertAll();
		
	}
	
	@Test
	public void hardAssert1 () {
		SoftAssert sa = new SoftAssert();
		int exp = 1;
		int act = 0;
		System.out.println("----Test7----");
		sa.assertEquals(act, exp);
		System.out.println("----Test8----");
		System.out.println("----Test9----");
		
		sa.assertAll();
	}

}
