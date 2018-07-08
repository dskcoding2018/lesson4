/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author Marco
 */
public abstract class Product implements Vat {
    private double salePrice;
    private double boughtPrice;
    
    public Product(double boughtPrice, double salePrice){
        this.salePrice = salePrice;
        this.boughtPrice = boughtPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }
    
    @Override
    public double returnVat() {
        return this.salePrice * 0.15;
    }
}
