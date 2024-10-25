package org.sid.customerservice.Dao.repository;

import org.sid.customerservice.Dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
