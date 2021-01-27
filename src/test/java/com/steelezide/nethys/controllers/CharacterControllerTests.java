package com.steelezide.nethys.controllers;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CharacterControllerTests {
    
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
        // @GetMapping("{id}") public Mono<CharacterDto> getCharacter(@PathVariable("id") int id) {}
        fail();
    }

    @Test
    public void testGetCharacter_IdNotFound() {
        // @GetMapping("{id}") public Mono<CharacterDto> getCharacter(@PathVariable("id") int id) {}
        fail();
    }

    @Test
    public void testGetAllCharacters_OptimalInput() {
        // @GetMapping public Flux<List<CharacterDto>> getAllCharacters() {}
        fail();
    }

    @Test
    public void testGetAllCharacters_NoCharactersInDatabase() {
        // @GetMapping public Flux<List<CharacterDto>> getAllCharacters() {}
        fail();
    }

    @Test
    public void testCreateCharacter_OptimalInput() {
        // @PostMapping public void createCharacter(@RequestBody CharacterDto characterDto) {}
        fail();
    }

    @Test
    public void testCreateCharacter_MissingNonNullValues() {
        // @PostMapping public void createCharacter(@RequestBody CharacterDto characterDto) {}
        fail();
    }

    @Test
    public void testUpdateCharacter_OptimalInput() {
        // @PutMapping public void updateCharacter(@RequestBody CharacterDto characterDto) {}
        fail();
    }

    @Test
    public void testUpdateCharacter_MissingNonNullValues() {
        // @PutMapping public void updateCharacter(@RequestBody CharacterDto characterDto) {}
        fail();
    }

    @Test
    public void testDeleteCharacter_OptimalInput() {
        // @DeleteMapping public void deleteCharacter(@RequestBody CharacterDto characterDto) {}
        fail();
    }

    @Test
    public void testDeleteCharacter_IdNotFound() {
        // @DeleteMapping public void deleteCharacter(@RequestBody CharacterDto characterDto) {}
        fail();
    }
}
