package com.cg.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ems.dto.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Integer> {
	
}
