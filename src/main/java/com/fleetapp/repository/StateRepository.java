package com.fleetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleetapp.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
