package com.example.demo.domain.repository.sample02;

import com.example.demo.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository02 extends JpaRepository<UserEntity, String> {
}
