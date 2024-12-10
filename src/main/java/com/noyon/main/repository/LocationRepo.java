package com.noyon.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.noyon.main.entities.Location;

@Repository
public interface LocationRepo extends JpaRepository<Location, Integer> {

	List<Location> findByName(String name);

}
