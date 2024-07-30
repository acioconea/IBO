package com.DB.IBO.ModelClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "STOCKS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="price",nullable = false)
    private Float price;

    @Column(name="symbol",nullable = false)
    private String symbol;

    @Column(name="revenueGrowth",nullable = false)
    private Float revenueGrowth;

    @Column(name="marketCap",nullable = false)
    private Long marketCap;
    @Column(name="dividendYield",nullable = false)
    private Float dividendYield;

    @Override
    public String toString() {
        return "Stock: " + this.name + " Price: " + this.price + " Symbol: " + this.symbol + " ID: " + this.id;
    }
}
