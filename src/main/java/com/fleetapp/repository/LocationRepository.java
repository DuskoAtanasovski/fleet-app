package com.fleetapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fleetapp.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
