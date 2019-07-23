package com.challengespring.crashbandicoot.repositories;

import com.challengespring.crashbandicoot.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User, Long> {
}