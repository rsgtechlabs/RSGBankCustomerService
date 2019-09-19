package com.rsgbank.customerservice.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.rsgbank.customerservice.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, BigInteger> {

}
