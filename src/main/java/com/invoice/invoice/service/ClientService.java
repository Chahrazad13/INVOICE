package com.invoice.invoice.service;

import com.invoice.invoice.entities.Client;
import com.invoice.invoice.entities.Product;
import com.invoice.invoice.repositories.ClientRepository;
import com.invoice.invoice.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService {

    ClientRepository clientRepository;


        public void create(Client client){

           clientRepository.save(client);
        }


        public Optional<Client> findById(Long id){
            return clientRepository.findById(id);

        }

        public List<Client> findAll(){
            return clientRepository.findAll();
        }
    }

