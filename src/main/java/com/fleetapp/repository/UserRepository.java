package com.fleetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleetapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}