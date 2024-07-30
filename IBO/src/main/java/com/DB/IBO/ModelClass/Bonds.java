package com.DB.IBO.ModelClass;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "BONDS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bonds {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="country",nullable = false)
    private String country;

    @Column(name="nr_years")
    private int nr_years;

    @Column(name="interest_rate")
    private float interest_rate;

    @Column(name="issuer")
    private String issuer;

    @Column(name="issue_date")
    private LocalDate issue_date;
}