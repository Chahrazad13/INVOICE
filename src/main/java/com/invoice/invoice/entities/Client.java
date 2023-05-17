package com.invoice.invoice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String enterprise;
    private int telephone;
    private String street;
    private String zipcode;
    private String ville;

    @OneToOne(mappedBy = "client")
    private Invoice invoice;
}
