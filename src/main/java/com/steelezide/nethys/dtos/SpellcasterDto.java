package com.steelezide.nethys.dtos;

import java.util.ArrayList;
import java.util.List;

import com.steelezide.nethys.pojos.PlayerCharacter;
import com.steelezide.nethys.pojos.PlayerClass;
import com.steelezide.nethys.pojos.Spell;
import com.steelezide.nethys.pojos.Spellcaster;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode (callSuper = true)
public class SpellcasterDto extends CharacterDto {
    
    /**
     * A collection containing the spell that this character currrently knows.
     * Characters who do not learn spells inherently know all spells for their {@link PlayerClass}
     * given their level.
     */
    private List<SpellDto> knownSpells;

    /**
     * A container holding this character's total spell slots as well as the spells that have 
     * been assigned to those slots.
     */
    private SlotsDto slots;

    public SpellcasterDto (Spellcaster caster){
        super(caster);

        List<SpellDto> spellConverter = new ArrayList<>();
        for(Spell spell: caster.getKnownSpells()){
            spellConverter.add(new SpellDto(spell));
        }
        this.knownSpells = spellConverter;
        this.slots = new SlotsDto(caster.getSlots());
    }

    public Spellcaster toPojo(){
        
        List<Spell> spellConverter = new ArrayList<>();
        for(SpellDto spell: this.getKnownSpells()){
            spellConverter.add(spell.toPojo());
        }
        PlayerCharacter pc = super.toPojo();
        Spellcaster caster = (Spellcaster) pc;

        caster.setKnownSpells(spellConverter);
        caster.setSlots(this.getSlots().toPojo(caster));

        return caster;
    }
}
