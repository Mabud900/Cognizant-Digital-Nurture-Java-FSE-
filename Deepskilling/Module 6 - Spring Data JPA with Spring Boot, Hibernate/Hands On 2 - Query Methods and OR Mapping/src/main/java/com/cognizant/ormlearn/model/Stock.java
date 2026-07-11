package com.cognizant.ormlearn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


import java.sql.Date;

@Entity
@Table (name="Stock")
@Getter
@Setter
public class Stock {
    @Id
    @Column(name="st_id")
    private int st_id;

    @Column(name="st_code")
    private String code;

    @Column(name="st_date")
    private Date date;

    @Column(name="st_open")
    private BigDecimal open;

    @Column(name="st_close")
    private BigDecimal close;

    @Column(name="st_volume")
    private BigDecimal volume;

    @Override
    public String toString() {
        return "Stock{" +
                "code='" + code + '\'' +
                ", date=" + date +
                ", open=" + open +
                ", close=" + close +
                ", volume=" + volume +
                '}';
    }
}
