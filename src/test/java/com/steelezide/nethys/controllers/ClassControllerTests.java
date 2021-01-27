package com.steelezide.nethys.controllers;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClassControllerTests {
    
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
    public void testGetClass_OptimalInput() {
        // @GetMapping("{name}") public Mono<PlayerClass> getClass(@PathVariable String name){}
        fail();
    }

    @Test
    public void testGetClass_NameNotFound() {
        // @GetMapping("{name}") public Mono<PlayerClass> getClass(@PathVariable String name){}
        fail();
    }

    @Test
    public void testGetAllClasses_OptimalInput() {
        // @GetMapping public Flux<PlayerClass> getAllClasses(){}
        fail();
    }

    @Test
    public void testGetAllClasses_NoClassInDatabase() {
        // @GetMapping public Flux<PlayerClass> getAllClasses(){}
        fail();
    }

    @Test
    public void testCreateClass_OptimalInput() {
        // @PostMapping public void createClass(@RequestBody ClassDto classDto){}
        fail();
    }

    @Test
    public void testCreateClass_MissingNonNullValues() {
        // @PostMapping public void createClass(@RequestBody ClassDto classDto){}
        fail();
    }
}
