package com.learning.BMS.repository;

import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import com.learning.BMS.model.ShowSeat;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
	@Lock(LockModeType.PESSIMISTIC_WRITE) // putting pessimistic lock
	List<ShowSeat> findByIdIn(List<Long> showSeatIds); // select * from showSeat where id in (...);

	ShowSeat save(ShowSeat showSeat); // insert new record and update an existing record (both use)
}
