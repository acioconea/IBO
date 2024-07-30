package com.DB.IBO.ModelClass;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "Bonds")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bonds {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String country;

    @Column
    private int nrYears;

    @Column
    private float interestRate;

    @Column
    private String issuer;

    @Column
    private LocalDate issueDate;
}