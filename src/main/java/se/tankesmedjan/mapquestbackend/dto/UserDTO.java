package se.tankesmedjan.mapquestbackend.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class UserDTO {

    private String name;
    private String email;
    private String password;
    private Timestamp timestampActivation;
    private Timestamp timestampExpired;
}



