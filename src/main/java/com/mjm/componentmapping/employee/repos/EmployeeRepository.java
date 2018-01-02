package com.mjm.componentmapping.employee.repos;

import com.mjm.componentmapping.employee.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
