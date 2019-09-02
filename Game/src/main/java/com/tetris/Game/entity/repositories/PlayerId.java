package com.tetris.Game.entity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlayerId extends JpaRepository<PlayerId, UUID> {
}
