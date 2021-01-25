package com.steelezide.nethys.pojos;

import java.util.List;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A container object for a {@link Spellcaster}'s total spell slots as well as the spells that have 
 * been assigned to those slots. 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Slots {

    @Column(name = "cantrip_total")
    private int cantripTotal;

    @OneToMany(mappedBy = "owner")
    @AssociationOverrides({
        @AssociationOverride(name="owner", joinColumns = @JoinColumn(name = "cantrip_id"))
    })
    private List<PreparedSpell> cantripPrepared;

    @Column(name = "first_total")
    private int firstTotal;

    @OneToMany(mappedBy = "owner")
    @AssociationOverrides({
        @AssociationOverride(name="owner", joinColumns = @JoinColumn(name = "first_id"))
    })
    private List<PreparedSpell> firstPrepared;

    @Column(name = "second_total")
    private int secondTotal;

    @OneToMany(mappedBy = "owner")
    @AssociationOverrides({
        @AssociationOverride(name="owner", joinColumns = @JoinColumn(name = "second_id"))
    })
    private List<PreparedSpell> secondPrepared;

    @Column(name = "third_total")
    private int thirdTotal;

    @OneToMany(mappedBy = "owner")
    @AssociationOverrides({
        @AssociationOverride(name="owner", joinColumns = @JoinColumn(name = "third_id"))
    })
    private List<PreparedSpell> thirdPrepared;

    @Column(name = "fourth_total")
    private int fourthTotal;

    @OneToMany(mappedBy = "owner")
    @AssociationOverrides({
        @AssociationOverride(name="owner", joinColumns = @JoinColumn(name = "fourth_id"))
    })
    private List<PreparedSpell> fourthPrepared;

    @Column(name = "fifth_total")
    private int fifthTotal;

    @OneToMany(mappedBy = "owner")
    @AssociationOverrides({
        @AssociationOverride(name="owner", joinColumns = @JoinColumn(name = "fifth_id"))
    })
    private List<PreparedSpell> fifthPrepared;

    @Column(name = "sixth_total")
    private int sixthTotal;

    @OneToMany(mappedBy = "owner")
    @AssociationOverrides({
        @AssociationOverride(name="owner", joinColumns = @JoinColumn(name = "sixth_id"))
    })
    private List<PreparedSpell> sixthPrepared;

    @Column(name = "seventh_total")
    private int seventhTotal;

    @OneToMany(mappedBy = "owner")
    @AssociationOverrides({
        @AssociationOverride(name="owner", joinColumns = @JoinColumn(name = "seventh_id"))
    })
    private List<PreparedSpell> seventhPrepared;

    @Column(name = "eighth_total")
    private int eighthTotal;

    @OneToMany(mappedBy = "owner")
    @AssociationOverrides({
        @AssociationOverride(name="owner", joinColumns = @JoinColumn(name = "eighth_id"))
    })
    private List<PreparedSpell> eighthPrepared;

    @Column(name = "ninth_total")
    private int ninthTotal;

    @OneToMany(mappedBy = "owner")
    @AssociationOverrides({
        @AssociationOverride(name="owner", joinColumns = @JoinColumn(name = "ninth_id"))
    })
    private List<PreparedSpell> ninthPrepared;

}
