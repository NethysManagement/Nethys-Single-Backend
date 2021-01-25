package com.steelezide.nethys.controllers;

import com.steelezide.nethys.pojos.Spell;
import com.steelezide.nethys.services.SpellService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Dtos.SpellDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController("spell")
public class SpellController {
    
    private SpellService spellService;

    @Autowired
    public SpellController(SpellService spellService) {
        this.spellService = spellService;
    }

    @GetMapping("{id}")
    public Mono<Spell> getSpell(@PathVariable int id){
        return null;   
    }
    
    @GetMapping
    public Flux<Spell> getAllSpells(){
        return null;   
    }
    
    @PostMapping
    public void createSpell(@RequestBody SpellDto spellDto){
        
    }

    
}
