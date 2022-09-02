package com.example;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
@ExtendWith(ValidateParameterResolver.class)
class Testclass {

	@Test
	@Tag("my-tag")
	void test( Authentication at) {
		assertTrue(at.Validate("Riyana", "6095"));
		
	}

}


