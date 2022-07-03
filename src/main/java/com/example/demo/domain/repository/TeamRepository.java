package com.example.demo.domain.repository;

import com.example.demo.domain.entity.JoinTeamEntity;
import com.example.demo.domain.entity.TeamKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeamRepository extends JpaRepository<JoinTeamEntity, TeamKey> {

        @Query("SELECT t FROM JoinTeamEntity t LEFT JOIN FETCH t.user")
        List<JoinTeamEntity> findAll();

//    @Query("SELECT t FROM JoinTeamEntity t " +
//            "LEFT JOIN UserEntity u ON t.userId WHERE t.teamName = :teamName")
//    List<JoinTeamEntity> find(@Param("teamName") String teamName);

//    @Query("SELECT t FROM JoinTeamEntity t " +
//            " WHERE t.teamName = :teamName")
//    List<JoinTeamEntity> find(@Param("teamName") String teamName);

}

