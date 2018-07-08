/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.ArrayList;

/**
 *
 * @author Temporary
 */
public class Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, 0 ,0);
        System.out.println(emp1.getPosition());
        emp1.move(1, 0);
        System.out.println(emp1.getPosition());
    }
    
}
