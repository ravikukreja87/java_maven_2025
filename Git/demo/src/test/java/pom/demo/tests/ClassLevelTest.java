package pom.demo.tests;

import org.testng.annotations.*;

@Ignore
public class ClassLevelTest {

	@Test
	public void testOne() {
		System.out.println("Test one");
	}

	@Test
	public void testTwo() {
		System.out.println("Test two");
	}

	@Test
	public void testThree() {
		System.out.println("Test three");
	}

	@Test
	public void testFour() {
		System.out.println("Test four");
	}

}
