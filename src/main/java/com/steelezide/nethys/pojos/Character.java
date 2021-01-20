package com.steelezide.nethys.pojos;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "character")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Character {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "name")
    private String name;

    @Column(name = "level")
    private int level;

    @Column(name = "alignment")
    private String alignment;

    @Column(name = "size")
    private String size;

    @Column(name = "deity")
    private String deity;

    @Column(name = "age")
    private int age;

    @Column(name = "initiative")
    private int initiative;

    @ManyToOne
    @JoinColumn(name = "class")
    private Class characterClass;

    @Embedded
    private AbilityScores abilityScores;
}
