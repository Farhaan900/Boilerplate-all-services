package com.stackroute.playerservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

/**
 * Player data class
 * Getter,setter,parameterised constructor, default constructor generated by lombok
 */
//@Entity
@Document(value = "player")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    /**
     * auto generated id as primary key
     */
    @Id
    private String id;
    @NotNull
    private String name;
    @NotNull
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


}
