package com.steelezide.nethys.controllers;

import java.util.List;

import com.steelezide.nethys.services.CharacterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import Dtos.CharacterDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("character")
public class CharacterController {

    private CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("{id}")
    public Mono<CharacterDto> getCharacter(@PathVariable("id") int id) {
        return null;
    }

    @GetMapping
    public Flux<List<CharacterDto>> getAllCharacters() {
        return null;
    }

    @PostMapping
    public void createCharacter(@RequestBody CharacterDto characterDto) {

    }

    @PutMapping
    public void updateCharacter(@RequestBody CharacterDto characterDto) {

    }

    @DeleteMapping
    public void deleteCharacter(@RequestBody CharacterDto characterDto) {

    }
}
