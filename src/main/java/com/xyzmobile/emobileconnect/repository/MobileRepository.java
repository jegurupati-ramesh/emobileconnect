package com.xyzmobile.emobileconnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xyzmobile.emobileconnect.domain.MobileNumber;

public interface MobileRepository extends JpaRepository<MobileNumber, Long> {

	@Query("SELECT * FROM MobileNumber r  WHERE r.status = :status")
	List<MobileNumber> findMobileByStatus(String status);

}
