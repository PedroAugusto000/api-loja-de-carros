package io.github.pedroaugusto000.lojacarros.repository;

import io.github.pedroaugusto000.lojacarros.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarroRepository extends JpaRepository<Carro, UUID> {
}
