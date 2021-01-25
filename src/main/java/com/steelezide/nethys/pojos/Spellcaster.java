package com.steelezide.nethys.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * An object that contains the data representing a Pathfinder 1st edition character who is capable of casting casting spells. 
 * Has a no-args and all args contsructor.
 * Extends {@link PlayerCharacter}
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode (callSuper = true)
public class Spellcaster extends PlayerCharacter {
    
    /**
     * A collection containing the spell that this character currrently knows.
     * Characters who do not learn spells inherently know all spells for their {@link PlayerClass}
     * given their level.
     */
    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY )
    @JoinTable(
        name = "char_known_spell",
        joinColumns = { @JoinColumn (name = "char_id") },
        inverseJoinColumns = { @JoinColumn (name = "spell_id") }
    )
    private List<Spell> knownSpells;

    /**
     * A container holding this character's total spell slots as well as the spells that have 
     * been assigned to those slots.
     */
    @Embedded
    private Slots slots = new Slots();

}
