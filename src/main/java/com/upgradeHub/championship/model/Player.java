package com.upgradeHub.championship.model;
import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name ="Player")
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private Long height;
    private Long weight;

    @ManyToOne
    @MapsId("teamId")
    @JoinColumn(name = "team_id")
    //@Column(columnDefinition = "team default 1")
    private Team team;
    @ManyToMany
    @JoinTable(
            name = "game_played",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "game_id"))
    Set<Game> gamesPlayed;
}
