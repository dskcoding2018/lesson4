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
public class Employee implements Vat {
    
    private double salary;
    
    private int x, y; //will have a position

    public Employee(double salary, int x, int y) {
        this.salary = salary;
        this.x = x;
        this.y = y;
    }
    
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
    
    public String getPosition() {
        return "x: " + this.x + " y: " + this.y;
    }
        
    
    @Override
    public double returnVat() {
        return this.salary * 0.15;
    }
    
}
