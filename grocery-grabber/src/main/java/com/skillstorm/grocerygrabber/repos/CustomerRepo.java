package com.skillstorm.grocerygrabber.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillstorm.grocerygrabber.models.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
