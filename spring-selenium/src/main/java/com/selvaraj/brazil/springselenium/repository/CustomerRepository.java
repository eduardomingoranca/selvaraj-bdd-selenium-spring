package com.selvaraj.brazil.springselenium.repository;

import com.selvaraj.brazil.springselenium.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
