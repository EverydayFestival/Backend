package com.festival.everyday.core.user.repository;

import com.festival.everyday.core.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByAccount(String account);
    boolean existsByAccount(String account);
}
