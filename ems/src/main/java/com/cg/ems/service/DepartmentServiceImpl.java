package com.cg.ems.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.DepartmentRepository;
import com.cg.ems.dto.Department;

/**
 * @author Mayank
 *
 */

@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public Department findDepartment(String deptName) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDeptName(deptName);
	}
	
	
	

}
