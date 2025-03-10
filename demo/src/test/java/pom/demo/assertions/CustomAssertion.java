package pom.demo.assertions;

import org.testng.Assert;

public class CustomAssertion {

	/**
	 * @param actualFlashMsg
	 * @param expectedFlashMsg
	 */
	public static boolean validateExpectedContainsInActual(String actualFlashMsg, String expectedFlashMsg) {
		if (actualFlashMsg.contains(expectedFlashMsg))
			return true;
		else
			return false;

//		Assert.assertTrue(actualFlashMsg.contains(expectedFlashMsg));
//		System.out.println("Assertion Completed for " + expectedFlashMsg);
	}

	public static boolean softAssertExpectedContainsInActual(String actualFlashMsg, String expectedFlashMsg) {
		if (actualFlashMsg.contains(expectedFlashMsg)) {
			System.out.println("Assertion Completed for " + expectedFlashMsg);
			return true;
		} else {
			// Soft assertion failure
			System.out.println("Soft Assertion Failed. Actual Result - " + actualFlashMsg + "\tExpected Result - "
					+ expectedFlashMsg);
			return false;
		}

	}

}
