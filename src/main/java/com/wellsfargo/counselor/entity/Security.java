package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Int quantity;

    @Column(nullable = false)
    private Int price;

    @Column(nullable = false)
    private Int total;

    @Column(nullable = false)
    private Long portfolioId;


    protected Security() {

    }

    public Security(String symbol, String type, Int quantity, Int price, Int total, String purchaseDate, long portfolioId) {
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.purchaseDate = purchaseDate;
        this.portfolioId = portfolioId;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Int getQuantity() {
        return quantity;
    }

    public void setQuantity(Int quantity) {
        this.quantity = quantity;
    }

    public Int getPrice() {
        return price;
    }

    public void setPrice(Int price) {
        this.price = price;
    }

    public Int getTotal() {
        return total;
    }

    public void setTotal(Int total) {
        this.total = total;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setFirstName(String firstName) {
        this.portfolioId = portfolioId;
    }

    
}
