package pom.demo.tests;

import org.testng.annotations.*;

public class SampleTestDependecy {

	@Test(dependsOnMethods = { "dependentTest" })
	public void mainTest() {
		System.out.println("MainTest");
	}

	@Test
	public void dependentTest() {
		System.out.println("Dependent Test");
	}

}
