package com.xyzmobile.emobileconnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xyzmobile.emobileconnect.domain.Request;

public interface RequestRepository  extends JpaRepository<Request, Long> {
	
	@Query("SELECT * FROM Request r  WHERE r.status = :status")
	List<Request> findRequestByStatus(String status);


}
