/**
 * 
 */
package com.cg.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ems.dto.Grade;


/**
 * @author Mayank
 *
 */
public interface GradeRepository extends JpaRepository<Grade, Integer> {

	public Grade findByGradeCode(String gradeCode);

}
