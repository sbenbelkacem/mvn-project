package com.sm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}
