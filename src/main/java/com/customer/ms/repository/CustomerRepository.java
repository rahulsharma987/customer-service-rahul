package com.customer.ms.repository;

import org.springframework.stereotype.Repository;

import com.customer.ms.model.CustomerM;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerM, String> {
	
	

}
