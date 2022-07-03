package com.example.demo.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
@Data
public class UserEntity {

    @Id
    @Column(name = "user_id")
    private String userId;

    private String userName;

}
