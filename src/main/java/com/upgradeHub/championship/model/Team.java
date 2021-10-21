package com.upgradeHub.championship.model;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name ="Team",indexes = @Index(columnList = "teamName"))
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated
    private TeamType teamType;
    private String teamName;
    //Uma team tem Muitos jogadores
    @OneToMany(mappedBy = "team")
    private List<Player> playerList;
}
