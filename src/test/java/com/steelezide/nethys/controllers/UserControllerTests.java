package com.steelezide.nethys.controllers;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserControllerTests {

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
    public void testUserSignIn_OptimalInput() {
        // @PostMapping("sign-in") public void userSignIn(@RequestBody UserDto userDto){}
        fail();
    }

    @Test
    public void testUserSignIn_UsernameNotFound() {
        // @PostMapping("sign-in") public void userSignIn(@RequestBody UserDto userDto){}
        fail();
    }

    @Test
    public void testUserSignIn_PasswordDoesntMatch() {
        // @PostMapping("sign-in") public void userSignIn(@RequestBody UserDto userDto){}
        fail();
    }

    @Test
    public void testCreateUser_OptimalInput() {
        // @PostMapping("create") public void createUser(@RequestBody UserDto userDto){}
        fail();
    }

    @Test
    public void testCreateUser_MissingNonNullValues() {
        // @PostMapping("create") public void createUser(@RequestBody UserDto userDto){}
        fail();
    }

    @Test
    public void testUpdateUser_OptimalInput() {
        // @PutMapping public void updateUser(@RequestBody UserDto userDto){}
        fail();
    }
    
    @Test
    public void testUpdateUser_MissingNonNullValues() {
        // @PutMapping public void updateUser(@RequestBody UserDto userDto){}
        fail();
    }
    
    @Test
    public void testDeleteUser_OptimalInput() {
        // @DeleteMapping public void deleteUser(@RequestBody UserDto userDto){}
        fail();
    }

    @Test
    public void testDeleteUser_IdNotFound() {
        // @DeleteMapping public void deleteUser(@RequestBody UserDto userDto){}
        fail();
    }
}
