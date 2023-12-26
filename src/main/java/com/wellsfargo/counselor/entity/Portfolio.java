package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private Date creationDate;


    protected Portfolio() {

    }

    public Portfolio(Client client, long portfolioId, Date creationDate) {
        this.client = client;
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;

    }

    public long getPortfolioId() {
        return portfolioId;
    }


    public Client getClient() {
        return client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}

