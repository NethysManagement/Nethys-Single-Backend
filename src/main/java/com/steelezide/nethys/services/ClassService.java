package com.steelezide.nethys.services;

import java.util.List;

import com.steelezide.nethys.pojos.PlayerClass;

public interface ClassService {
    
    public PlayerClass getPlayerClass(int id);

    public List<PlayerClass> getAllClasses();

    public void createPlayerClass(PlayerClass playerClass);

}
