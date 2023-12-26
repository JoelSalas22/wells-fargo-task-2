package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private Date creationDate;


    protected Portfolio() {

    }

    public Portfolio(long clientId, long portfolioId, Date creationDate) {
        this.clientId = clientId;
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;

    }

    public long getPortfolioId() {
        return portfolioId;
    }


    public long getClientId() {
        return clientId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}

