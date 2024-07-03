package com.mouad.book.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepo extends JpaRepository<Token, Integer> {
    Optional<Token> findByToken(String token);
}
