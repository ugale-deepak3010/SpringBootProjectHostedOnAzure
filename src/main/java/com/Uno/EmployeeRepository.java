package com.Uno;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{		// Integer is data type of primary key.

}
