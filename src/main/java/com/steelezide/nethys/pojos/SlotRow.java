package com.steelezide.nethys.pojos;

import java.util.List;

import javax.persistence.Embeddable;

// TODO: Work out relation to spellcaster. Hibernate & Database.

@Embeddable
public class SlotRow {

    private String level;

    private int total;

    private List<PreparedSpell> prepared;

}
