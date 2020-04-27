package com.rta.wc.dao;

import com.rta.wc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Long> {
}
