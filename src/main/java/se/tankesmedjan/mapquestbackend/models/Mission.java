package se.tankesmedjan.mapquestbackend.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Mission {

    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String missionName;

    @Type(type = "text")
    private String missionDescription;

    @Column(columnDefinition = "boolean default false")
    private boolean isQuestion;

    @Column(length = 128)
    private String shortDescription;

    @Column(length = 20)
    private Long winnerScore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "defaultStoryId", nullable = false)
    private Story story;

}
