package com.example.demo.domain.repository.sample01;

import com.example.demo.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository01 extends JpaRepository<UserEntity, String> {
}
