package com.steelezide.nethys.controllers;

import com.steelezide.nethys.pojos.PlayerCharacter;
import com.steelezide.nethys.services.CharacterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import Dtos.CharacterDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController("character")
public class CharacterController {

    private CharacterService characterService;

    @Autowired
	public CharacterController(CharacterService characterService) {
		this.characterService = characterService;
	}
    
    @GetMapping("{id}")
    public Mono<CharacterDto> getCharacter(@PathVariable("id") int id){

    }
    
    
}