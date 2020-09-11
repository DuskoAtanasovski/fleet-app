package com.fleetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleetapp.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
