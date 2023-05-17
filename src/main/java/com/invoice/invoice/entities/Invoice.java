package com.invoice.invoice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @DateTimeFormat
    private LocalDateTime date;
    @DateTimeFormat
    private LocalDateTime echeanceDate;
    private String reglement;

    @OneToOne
    private Client client;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="products_invoices", joinColumns = @JoinColumn(name = "invoices_id"),
    inverseJoinColumns = @JoinColumn(name = "products_id"))
    private List<Product> products;

}
