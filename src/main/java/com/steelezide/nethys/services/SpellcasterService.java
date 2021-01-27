package com.steelezide.nethys.services;

import com.steelezide.nethys.pojos.Spellcaster;

public interface SpellcasterService {
    
    public Spellcaster getSpellcaster(int id);

    public void createSpellcaster(Spellcaster spellcaster);

    public void updateSpellcaster(Spellcaster spellcaster);

    public void deleteSpellcaster(Spellcaster spellcaster);

}
