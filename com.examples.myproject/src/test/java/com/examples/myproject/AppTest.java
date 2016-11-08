package com.examples.myproject;

/**
 * Unit test for simple App.
 */
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

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
		assertEquals("Hello", app.sayHello());
	}
	
	@Test
	public void testSayHelloWithName() {
		assertEquals("Hello World", app.sayHello("World"));
	}
}