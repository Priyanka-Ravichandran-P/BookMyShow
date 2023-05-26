package com.learning.BMS.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.BMS.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{
	 City save(City city);
	 Optional<City> findById(Long id); 
	 List<City> findAllByName(String cityName);
}
