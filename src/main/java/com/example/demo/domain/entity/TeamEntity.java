package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="team")
@IdClass(value=TeamKey.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TeamEntity implements Serializable {

    @Id
    @Column(name = "team_id")
    private String teamId;

    @Column(name = "team_name")
    private String teamName;

    @Id
    @Column(name = "user_id")
    private String userId;

}
