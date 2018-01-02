package com.mjm.componentmapping.employee.repos;

import com.mjm.componentmapping.employee.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
