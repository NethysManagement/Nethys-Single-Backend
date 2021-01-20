package com.steelezide.nethys.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

// TODO: Work out relation to spellcaster. Hibernate & Database.

@Embeddable
public class Slots {

    @Column(name = "cantrip_total")
    private int cantripTotal;

    @OneToMany
    @JoinColumn(name = "cantrip_id", referencedColumnName = "slot_id")
    private List<PreparedSpell> cantripPrepared;

    @Column(name = "first_total")
    private int firstTotal;

    @Column(name = "first_prepared")
    private List<PreparedSpell> firstPrepared;

    @Column(name = "second_total")
    private int secondTotal;

    @Column(name = "second_prepared")
    private List<PreparedSpell> secondPrepared;

    @Column(name = "third_total")
    private int thirdTotal;

    @Column(name = "third_prepared")
    private List<PreparedSpell> thirdPrepared;

    @Column(name = "forth_total")
    private int forthTotal;

    @Column(name = "forth_prepared")
    private List<PreparedSpell> forthPrepared;

    @Column(name = "fifth_total")
    private int fifthTotal;

    @Column(name = "fifth_prepared")
    private List<PreparedSpell> fifthPrepared;

    @Column(name = "sixth_total")
    private int sixthTotal;

    @Column(name = "sixth_prepared")
    private List<PreparedSpell> sixthPrepared;

    @Column(name = "seventh_total")
    private int seventhTotal;

    @Column(name = "seventh_prepared")
    private List<PreparedSpell> seventhPrepared;

    @Column(name = "eighth_total")
    private int eighthTotal;

    @Column(name = "eighth_prepared")
    private List<PreparedSpell> eighthPrepared;

    @Column(name = "ninth_total")
    private int ninthTotal;

    @Column(name = "ninth_prepared")
    private List<PreparedSpell> ninthPrepared;

}
