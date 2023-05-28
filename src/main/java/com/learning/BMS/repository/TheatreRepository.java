package com.learning.BMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.BMS.model.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long>{

	Theatre save(Theatre theatre);
}
