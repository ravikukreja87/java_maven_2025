package pom.demo.tests;

import org.testng.annotations.*;

public class SampleTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}

	@BeforeGroups(groups = "simple")
	public void beforeGroups() {
		System.out.println("Before Groups");
	}

	@AfterGroups(groups = "simple")
	public void afterGroups() {
		System.out.println("After Groups");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@Test(groups = "ui")
	public void testOne() {
		System.out.println("TESTOne");
	}

	@Test(groups = "api")
	public void testTwo() {
		System.out.println("TestTwo");
	}
	
	@Test(groups = "database")
	public void testThree() {
		System.out.println("TestThree");
	}

}
