
package com.cg.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ems.dto.Department;


/**
 * @author Mayank
 *
 */
public interface DepartmentRepository extends JpaRepository< Department, Integer> {

	public Department findByDeptName(String deptName);


}
