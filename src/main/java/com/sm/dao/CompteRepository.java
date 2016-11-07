package com.sm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {

}
