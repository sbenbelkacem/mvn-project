package com.sm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
