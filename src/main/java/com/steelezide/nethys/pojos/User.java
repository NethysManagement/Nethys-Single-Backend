package com.steelezide.nethys.pojos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * Username of the user, the username must be unique as it is used
     * to look up the user in the database. 
     */
    @Id
    @Column(name = "user_name")
    private String username;

    /**
     * The hashed version of the User's password
     */
    @Column(name = "passphrase")
    private String password;

    /**
     * The email address of the user. 
     */
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user")
    private List<PlayerCharacter> characters;

    public User(String username) {
        this.username = username;
    }

}
