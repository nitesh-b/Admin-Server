/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hills.data;

/**
 *
 * @author nitesh.banskota
 */
public class ProductDetails {
    private String productImage, productLink, productSupplier, productDescription, productNumber;

    public ProductDetails() {
    }

   
    public ProductDetails(String productImage, String productLink, String productSupplier, String productDescription, String productNumber) {
        this.productImage = productImage;
        this.productLink = productLink;
        this.productSupplier = productSupplier;
        this.productDescription = productDescription;
        this.productNumber = productNumber;
    }

    
    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public String getProductSupplier() {
        return productSupplier;
    }

    public void setProductSupplier(String productSupplier) {
        this.productSupplier = productSupplier;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    
}
