package com.steelezide.nethys.controllers;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpellControllerTests {

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
    public void testGetSpell_OptimalInput() {
        // @GetMapping("{id}") public Mono<Spell> getSpell(@PathVariable int id){}
        fail();
    }

    @Test
    public void testGetSpell_IdNotFound() {
        // @GetMapping("{id}") public Mono<Spell> getSpell(@PathVariable int id){}
        fail();
    }

    @Test
    public void testGetAllSpells_OptimalInput() {
        // @GetMapping public Flux<Spell> getAllSpells(){}
        fail();
    }

    @Test
    public void testGetAllSpells_NoSpellsInDatabase() {
        // @GetMapping public Flux<Spell> getAllSpells(){}
        fail();
    }
    
    @Test
    public void testCreateSpell_OptimalInput() {
        // @PostMapping public void createSpell(@RequestBody SpellDto spellDto){}
        fail();
    }
    
    @Test
    public void testCreateSpell_MissingNonNullValues() {
        // @PostMapping public void createSpell(@RequestBody SpellDto spellDto){}
        fail();
    }
}
