package TestNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void main() {
		
		int ExpectedDishCount = 9;
		
		System.out.println(ExpectedDishCount);
		
		int ActualDishCount = 9;
	
		Assert.assertNotEquals(ActualDishCount, ExpectedDishCount, " Value is not same");
		
	}

}
