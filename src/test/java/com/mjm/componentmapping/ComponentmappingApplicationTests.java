package com.mjm.componentmapping;

import com.mjm.componentmapping.employee.entities.Address;
import com.mjm.componentmapping.employee.entities.Customer;
import com.mjm.componentmapping.employee.entities.Employee;
import com.mjm.componentmapping.employee.repos.CustomerRepository;
import com.mjm.componentmapping.employee.repos.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentmappingApplicationTests {

	@Autowired
	private EmployeeRepository repository;
	@Autowired
	private CustomerRepository repository2;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreate(){
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Jimmy Jam");
		Address address = new Address();
		address.setCity("Wilmington");
		address.setCountry("USA");
		address.setState("NC");
		address.setStreetaddress("123 Main Street");
		address.setZipcode("85673");
		employee.setAddress(address);
		try {
			repository.save(employee);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}


	@Test
	public void testCreateCustomer(){
		Customer customer = new Customer();
		customer.setId(123);
		customer.setName("Jimmy Jam");
		Address address = new Address();
		address.setCity("Wilmington");
		address.setCountry("USA");
		address.setState("NC");
		address.setStreetaddress("123 Main Street");
		address.setZipcode("85673");
		customer.setAddress(address);
		try {
			repository2.save(customer);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
