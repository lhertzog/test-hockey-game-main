package com.maplr.testhockeygame.entity.team;

import com.maplr.testhockeygame.entity.player.PlayerEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TEAM")
public class TeamEntity {

    @Id
    @Column
    private Long id;

    @Column
    private String coach;

    @Column
    private long year;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "teamEntity")
    private List<PlayerEntity> players;
}
