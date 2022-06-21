package com.example.demo.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class TeamKey implements Serializable {

    @Id
//    @Column(name = "team_id")
    private String teamId;

    @Id
    @Column(name = "user_id")
    private String userId;

}
