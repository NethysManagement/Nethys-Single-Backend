package com.steelezide.nethys.services;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CharacterServiceImplTests {

    @BeforeAll
	static void setUpBeforeClass() {
	}

	@AfterAll
	static void tearDownAfterClass() {
	}

	@BeforeEach
	void setUp() {
	}

	@AfterEach
	void tearDown() {
    }
    
    @Test
    public void testGetCharacter_OptimalInput() {
        // public PlayerCharacter getCharacter(int id) {}
        fail();
    }

    @Test
    public void testGetCharacter_IdNotFound() {
        // public PlayerCharacter getCharacter(int id) {}
        fail();
    }
}
