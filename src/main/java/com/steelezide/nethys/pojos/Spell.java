package com.steelezide.nethys.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "spell")
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Spell {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "level")
    private int level;
    
    @Column(name = "school")
    private String school;
    
    @Column(name = "type")
    private String type;
    
    @Column(name = "cast_time")
    private String castTime;
    
    @Column(name = "components")
    private String components;
    
    @Column(name = "range")
    private String range;
    
    @Column(name = "target")
    private String target;
    
    @Column(name = "duration")
    private String duration;
    
    @Column(name = "saving_throw")
    private String savingThrow;
    
    @Column(name = "resistance")
    private String resistance;
    
    @Column(name = "description")
    private String description;
}
