package com.steelezide.nethys.services;

import java.util.List;

import com.steelezide.nethys.pojos.Spell;

public interface SpellService {
    
    public Spell getSpell(int id);

    public List<Spell> getAllSpells();

    public void createSpell(Spell spell);
}
