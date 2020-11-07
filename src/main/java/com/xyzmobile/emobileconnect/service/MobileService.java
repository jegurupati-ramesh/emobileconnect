package com.xyzmobile.emobileconnect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyzmobile.emobileconnect.domain.Request;
import com.xyzmobile.emobileconnect.repository.RequestRepository;

@Service
public class MobileService {

	@Autowired
	private RequestRepository requestRepository;

	/**
	 * Find Requests by status
	 * 
	 * @param status
	 * @return
	 */
	public List<Request> getRequestByStatus(String status) {

		return requestRepository.findRequestByStatus(status);

	}

}
