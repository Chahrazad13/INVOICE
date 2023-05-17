package com.invoice.invoice.service;

import com.invoice.invoice.entities.Product;
import com.invoice.invoice.repositories.ClientRepository;
import com.invoice.invoice.repositories.InvoiceRepository;
import com.invoice.invoice.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {

    ProductRepository productRepository;


        public void save(Product product){productRepository.save(product);}


        public Optional<Product> findById(Long id){
            return productRepository.findById(id);

        }

        public List<Product> findAll(){
            return productRepository.findAll();
        }
    }

