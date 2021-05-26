package se.tankesmedjan.mapquestbackend.dto;

import lombok.Getter;
import lombok.Setter;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;

@Getter
@Setter
public class UserDTO {

    private String name;
    private String email;
    private String password;
    private Timestamp timestampActivation;
    private Timestamp timestampExpired;

    public void setPassword(String password) {
        String sha256hex = Hashing.sha256()
                .hashString(password, StandardCharsets.UTF_8)
                .toString();
        this.password = sha256hex;
    }
}



