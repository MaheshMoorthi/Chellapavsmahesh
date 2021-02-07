package org.info;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Employee {

	@Test(retryAnalyzer = Failed.class)
	private void tc1() {

		Assert.assertTrue(false);
	}

	@Test
	private void tc2() {
		System.out.println("test2");
	}

	@Test
	private void tc3() {
		System.out.println("test3");
	}

}
