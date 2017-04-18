package com.example;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{

	public List<Employee> findByLastName(@Param("lastName") String name);

	public List<Employee> findByLastNameContainingIgnoreCase(@Param("last") String nama);
}
