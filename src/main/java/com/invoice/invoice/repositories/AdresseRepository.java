package com.invoice.invoice.repositories;

import com.invoice.invoice.entities.Adresse;
import com.invoice.invoice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse,Long> {

}
