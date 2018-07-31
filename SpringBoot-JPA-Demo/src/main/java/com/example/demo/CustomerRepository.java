/**
 * 
 */
package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author MXL8JR8
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
	
	List<Customer> findByFirstName(String firstName);
	
}
