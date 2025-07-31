package com.gcp.container.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gcp.container.services.controller.HelloController;

public class HelloControllerTest {

	@Test
	public void testHelloEndpoint() {
		HelloController controller = new HelloController();
		String response = controller.hello();
		assertEquals("Hello from GCP Container!", response);
	}
}