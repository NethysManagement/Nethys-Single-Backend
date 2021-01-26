package com.steelezide.nethys.dtos;

import java.util.ArrayList;
import java.util.List;

import com.steelezide.nethys.pojos.PreparedSpell;
import com.steelezide.nethys.pojos.Slots;
import com.steelezide.nethys.pojos.Spellcaster;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SlotsDto {
    
    private int cantripTotal;

    private List<PreparedSpellDto> cantripPrepared;
    
    private int firstTotal;

    private List<PreparedSpellDto> firstPrepared;

    private int secondTotal;

    private List<PreparedSpellDto> secondPrepared;

    private int thirdTotal;

    private List<PreparedSpellDto> thirdPrepared;

    private int fourthTotal;

    private List<PreparedSpellDto> fourthPrepared;

    private int fifthTotal;

    private List<PreparedSpellDto> fifthPrepared;

    private int sixthTotal;

    private List<PreparedSpellDto> sixthPrepared;

    private int seventhTotal;

    private List<PreparedSpellDto> seventhPrepared;

    private int eighthTotal;

    private List<PreparedSpellDto> eighthPrepared;

    private int ninthTotal;

    private List<PreparedSpellDto> ninthPrepared;

    public SlotsDto (Slots slots){
        this();
        this.cantripTotal = slots.getCantripTotal();
        this.cantripPrepared = listConverter(slots.getCantripPrepared());
        
        this.firstTotal = slots.getFirstTotal();
        this.firstPrepared = listConverter(slots.getFirstPrepared());
        
        this.secondTotal = slots.getSecondTotal();
        this.secondPrepared = listConverter(slots.getSecondPrepared());

        this.thirdTotal = slots.getThirdTotal();
        this.thirdPrepared = listConverter(slots.getThirdPrepared());

        this.fourthTotal = slots.getFourthTotal();
        this.fourthPrepared = listConverter(slots.getFourthPrepared());

        this.fifthTotal = slots.getFifthTotal();
        this.fifthPrepared = listConverter(slots.getFifthPrepared());

        this.sixthTotal = slots.getSixthTotal();
        this.sixthPrepared = listConverter(slots.getSixthPrepared());

        this.seventhTotal = slots.getSeventhTotal();
        this.seventhPrepared = listConverter(slots.getSeventhPrepared());

        this.eighthTotal = slots.getEighthTotal();
        this.eighthPrepared = listConverter(slots.getEighthPrepared());

        this.ninthTotal = slots.getNinthTotal();
        this.ninthPrepared = listConverter(slots.getNinthPrepared());

    }

    private List<PreparedSpellDto> listConverter (List<PreparedSpell> list){
        
        List<PreparedSpellDto> convertedList = new ArrayList<>();

        for(PreparedSpell spell: list){
            convertedList.add(new PreparedSpellDto(spell));
        }
        
        return convertedList;
    }

    public Slots toPojo(Spellcaster owner){
        
        Slots slots = new Slots(
            this.getCantripTotal(),
            listConverterToPojo(this.getCantripPrepared(), owner),
            this.getFirstTotal(),
            listConverterToPojo(this.getFirstPrepared(), owner),
            this.getSecondTotal(),
            listConverterToPojo(this.getSecondPrepared(), owner),
            this.getThirdTotal(),
            listConverterToPojo(this.getThirdPrepared(), owner),
            this.getFourthTotal(),
            listConverterToPojo(this.getFourthPrepared(), owner),
            this.getFifthTotal(),
            listConverterToPojo(this.getFifthPrepared(), owner),
            this.getSixthTotal(),
            listConverterToPojo(this.getSixthPrepared(), owner),
            this.getSeventhTotal(),
            listConverterToPojo(this.getSecondPrepared(), owner),
            this.getEighthTotal(),
            listConverterToPojo(this.getEighthPrepared(), owner),
            this.getNinthTotal(),
            listConverterToPojo(this.getNinthPrepared(), owner)
        );

        return slots;
    }

    private List<PreparedSpell> listConverterToPojo (List<PreparedSpellDto> list, Spellcaster owner){
        
        List<PreparedSpell> convertedList = new ArrayList<>();

        for(PreparedSpellDto spell: list){
            convertedList.add(spell.toPojo(owner));
        }
        
        return convertedList;
    }
}
