package com.Uno;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table 		// may be for Entities operations.
@Data 		// using from lombok
@AllArgsConstructor 		// may be not need to pass value to constructor 
@NoArgsConstructor 			// idk

public class Employee {
	@Id
	@GeneratedValue 		// autogenerate and assign as primary key.
	private int id;
	private String name;
	private String dept;
	private long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

}
