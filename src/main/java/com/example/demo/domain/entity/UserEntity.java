package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
@NoArgsConstructor
@AllArgsConstructor
@Getter
// Persistableをimplementsする
// 型パラメータにはプライマリキーの型を入れる
public class UserEntity implements Persistable<String> {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Override
    public boolean isNew() {
        // trueの場合、selectを省略してinsertのみ
        // falseの場合、select後にupdate or insert
        return true;
    }
}
