package com.invoice.invoice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String street;
    int zipcode;
    String city;

    @OneToOne
    Client client;
}
