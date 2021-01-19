package com.steelezide.nethys.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AbilityScores {
    
    @Column(name = "strength")
    private int strength;

    @Column(name = "dexterity")
    private int dexterity;

    @Column(name = "constitution")
    private int constitution;
    
    @Column(name = "intellect")
    private int intellect;
    
    @Column(name = "wisdom")
    private int wisdom;
    
    @Column(name = "charisma")
    private int charisma;

}
