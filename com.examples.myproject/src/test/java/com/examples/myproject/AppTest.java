package com.examples.myproject;

/**
 * Unit test for simple App.
 */
import static org.junit.Assert.assertEquals;

import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private App app;

	@Before
	public void setup() {
		app = new App();
	}

	@org.junit.Test
	public void testSayHello() {
		assertEquals("Hallo", app.sayHello());
	}
}