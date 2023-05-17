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

    @OneToOne(mappedBy = "client")
    private Adresse adresse;

    @OneToOne(mappedBy = "client")
    private Invoice invoice;
}
