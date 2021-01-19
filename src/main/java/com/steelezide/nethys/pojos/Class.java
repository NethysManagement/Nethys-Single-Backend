package com.steelezide.nethys.pojos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "class")
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "castType")
    private String castType;

    @Column(name = "prepared")
    private boolean prepared;

    @Column(name = "learned")
    private boolean learned;

    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER )
    @JoinTable(
        name = "class_to_spell",
        joinColumns = { @JoinColumn (name = "class_id") },
        inverseJoinColumns = { @JoinColumn (name = "spell_id") }
    )
    private List<Spell> spellList;
}
