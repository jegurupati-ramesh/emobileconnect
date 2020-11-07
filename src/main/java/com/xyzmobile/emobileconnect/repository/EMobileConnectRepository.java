package com.xyzmobile.emobileconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyzmobile.emobileconnect.domain.User;

public interface EMobileConnectRepository  extends JpaRepository<User, Long> {

}
