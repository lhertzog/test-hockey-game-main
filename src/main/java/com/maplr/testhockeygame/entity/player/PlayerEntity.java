package com.maplr.testhockeygame.entity.player;


import com.maplr.testhockeygame.entity.team.TeamEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "PLAYER")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private long number;

    @Column
    private String name;

    @Column
    private String lastname;

    @Column(name = "CAPTAIN")
    private boolean isCaptain;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TEAM")
    private TeamEntity teamEntity;


}
