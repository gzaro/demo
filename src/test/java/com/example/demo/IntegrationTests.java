package com.example.demo;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IntegrationTests {

	@Test
	void webAppIsRunning() {
	}

	@Test
	void databaseIsConnected() {
		fail();
	}

}
