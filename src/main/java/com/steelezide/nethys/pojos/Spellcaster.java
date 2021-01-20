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
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Spellcaster extends PlayerCharacter {
    
    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY )
    @JoinTable(
        name = "char_known_spell",
        joinColumns = { @JoinColumn (name = "char_id") },
        inverseJoinColumns = { @JoinColumn (name = "spell_id") }
    )
    private List<Spell> knownSpells;

    @Embedded
    private Slots slots = new Slots();

}
