package com.ecommerce.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Products implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String ProductName;
    private Long ProductPrice;
    private Long ProductWeight;
    private Long ProductQuantity;
    private String ProductDOM; //Product Date of Manufacture
    private String ProductDescription;
    private String ProductImageURL;

    public Products() {}

    public Products(String ProductName, Long ProductPrice, Long ProductWeight, Long ProductQuantity, String ProductDOM, String ProductDescription, String ProductImageURL){
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.ProductWeight = ProductWeight;
        this.ProductQuantity = ProductQuantity;
        this.ProductDOM = ProductDOM;
        this.ProductDescription = ProductDescription;
        this.ProductImageURL = ProductImageURL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public Long getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(Long ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public Long getProductWeight() {
        return ProductWeight;
    }

    public void setProductWeight(Long ProductWeight) {
        this.ProductWeight = ProductWeight;
    }

    public Long getProductQuantity() {
        return ProductQuantity;
    }

    public void setProductQuantity(Long ProductQuantity) {
        this.ProductQuantity = ProductQuantity;
    }

    public String getProductDOM() {
        return ProductDOM;
    }

    public void setProductDOM(String ProductDOM) {
        this.ProductDOM = ProductDOM;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    public String getProductImageURL() {
        return ProductImageURL;
    }

    public void setProductImageURL(String ProductImageURL) {
        this.ProductImageURL = ProductImageURL;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", ProductName=" + ProductName + '\'' +
                ", ProductPrice=" + ProductPrice + '\'' +
                ", ProductWeight=" + ProductWeight + '\'' +
                ", ProductQuantity=" + ProductQuantity + '\'' +
                ", ProductDOM=" + ProductDOM + '\'' +
                ", ProductDescription=" + ProductDescription + '\'' +
                ", ProductImageURL=" + ProductImageURL + '\'' +
                "}";
    }
}
