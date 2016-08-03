package com.algaworks.wine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.wine.model.Vinho;

public interface VinhoRepository extends JpaRepository<Vinho, Long> {

}
