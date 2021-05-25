package se.tankesmedjan.mapquestbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Story {

    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String storyName;

    @Type(type = "text")
    private String storyText;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "story")
    @JsonIgnore
    private List<Game> games;
}