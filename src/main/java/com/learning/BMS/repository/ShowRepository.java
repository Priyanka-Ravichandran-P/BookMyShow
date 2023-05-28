package com.learning.BMS.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.BMS.model.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long>{
	
	 Optional<Show> findById(Long id);

}
