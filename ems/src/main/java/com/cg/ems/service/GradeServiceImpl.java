/**
 * 
 */
package com.cg.ems.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.GradeRepository;
import com.cg.ems.dto.Grade;

/**
 * @author Mayank
 *
 */

@Service("gradeService")
@Transactional
public class GradeServiceImpl implements GradeService{
	
	@Autowired
	GradeRepository gradeRepository;

	@Override
	public Grade findGrade(String gradeCode) {
		// TODO Auto-generated method stub
		return gradeRepository.findByGradeCode(gradeCode);
	}

}
