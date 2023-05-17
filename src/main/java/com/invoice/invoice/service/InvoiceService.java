package com.invoice.invoice.service;

import com.invoice.invoice.entities.Invoice;
import com.invoice.invoice.entities.Product;
import com.invoice.invoice.repositories.InvoiceRepository;
import com.invoice.invoice.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InvoiceService {

    InvoiceRepository invoiceRepository;

        public void save(Invoice invoice){invoiceRepository.save(invoice);}


        public Optional<Invoice> findById(Long id){
            return invoiceRepository.findById(id);

        }

        public List<Invoice> findAll(){
            return invoiceRepository.findAll();
        }
    }

