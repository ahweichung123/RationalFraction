/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fractionv2;

/**
 *
 * @author Student
 */
public class TestFractionInterface {
    
    public static void main (String args[]){
        
        FractionInterface f1 = new RationalFraction(1,2);
        FractionInterface f2 = new RationalFraction(3,4);
        
        System.out.println(f1.add(f2));
        System.out.println(f1.sub(f2));
        System.out.println(f1.mul(f2));
        System.out.println(f1.div(f2));
    }
}
