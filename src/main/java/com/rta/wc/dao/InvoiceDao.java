package com.rta.wc.dao;

import com.rta.wc.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDao extends JpaRepository<Invoice, Long> {
}
