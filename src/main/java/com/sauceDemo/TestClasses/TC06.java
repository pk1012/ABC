package com.sauceDemo.TestClasses;

import org.testng.Assert;

public class TC06 extends TestBaseClass
{
	public void verifyLoginFunctionality()
	{
		String actual = driver.getTitle();
		String expected = "Swag Labs";
		
		Assert.assertEquals(actual, expected);
	}
}
