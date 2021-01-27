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

/**
 * An object that contains the data representing a Pathfinder 1st edition character.
 * Has a no-args and all args constructor. 
 */
@Entity
@Table(name = "character")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerCharacter {
    
    /**
     * ID auto-generated by the database used to reference a specific character.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /**
     * The player who created the character. 
     */
    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;

    /**
     * The character's name which is restricted to alphanumeric characters.
     */
    @Column(name = "name")
    private String name;

    /**
     * Represents a character's total level from all classes.
     */
    @Column(name = "level")
    private int level;

    /**
     * Two letter combinations representing the character's alignment.
     * <p> Examples: 
     * <ul>
     * <li>Lawful Good: "LG"</li>
     * <li>Chaotic Neutral: "CN"</li>
     * <li>Neutral Evil: "NE", ect.</li>
     * </ul>
     */
    @Column(name = "alignment")
    private String alignment;

    /**
     * Represents the character's size modifier. 
     * <p>Examples: 
     * <ul>
     * <li>Large = -1 </li> 
     * <li>Medium = +0 </li>
     * <li>Small = +1 </li>
     * </ul>
     */
    @Column(name = "size")
    private int size;

    /**
     * Represents the deity that the character worships.
     * Effects some feats, archetypes, classes, and prestige classes.
     */
    @Column(name = "deity")
    private String deity;

    /**
     * Represents the character's in-game age.
     * Modifies ability scores
     */
    @Column(name = "age")
    private int age;

    /**
     * Effects the roll for turn order.
     * Calculated from the character's dexterity modifier, feats, spells, and other effects. 
     */
    @Column(name = "initiative")
    private int initiative;

    /**
     * Represents a character's in-game class.
     */
    @ManyToOne
    @JoinColumn(name = "class")
    private PlayerClass playerClass;

    /**
     * A container object for this character's ability scores.
     */
    @Embedded
    private AbilityScores abilityScores = new AbilityScores();
}
