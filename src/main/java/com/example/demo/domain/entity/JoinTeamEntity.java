package com.example.demo.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="team")
@IdClass(value=TeamKey.class)
@Data
public class JoinTeamEntity implements Serializable {

    @Id
    @Column(name = "user_id")
    private String teamId;

    private String teamName;

    @Id
    private String userId;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private UserEntity user;
}
