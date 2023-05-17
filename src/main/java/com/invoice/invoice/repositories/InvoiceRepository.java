package com.invoice.invoice.repositories;

import com.invoice.invoice.entities.Client;
import com.invoice.invoice.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

}
