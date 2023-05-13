package Cucumber.Stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@SanityTest")
	public void beforeValidation()
	{
		System.out.println("Before hooks");
	}
	
	@After("@SanityTest")
	public void afterValidation()
	{
		System.out.println("After hooks");
	}
}
