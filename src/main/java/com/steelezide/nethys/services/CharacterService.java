package com.steelezide.nethys.services;

import java.util.List;

import com.steelezide.nethys.pojos.PlayerCharacter;

public interface CharacterService {
  
    public PlayerCharacter getCharacter(int id);

    public List<PlayerCharacter> getAllCharacters();

    public void createCharacter(PlayerCharacter character);

    public void updateCharacter(PlayerCharacter character);

    public void deleteCharacter(int characterId);

}
