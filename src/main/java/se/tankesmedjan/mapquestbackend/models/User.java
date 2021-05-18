package se.tankesmedjan.mapquestbackend.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String accessCode;

    @OneToOne(mappedBy = "user")
    private Game game;



}