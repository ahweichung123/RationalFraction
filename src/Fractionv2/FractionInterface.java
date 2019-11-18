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
public interface FractionInterface {
    //Interface can only contains CONSTANTS and Abstract methods
    void setNumerator(int numerator);
    void setDenominator(int denominator);
    int getNumerator();
    int getDenominator();
    
    FractionInterface add(FractionInterface anotherFraction);
    FractionInterface sub(FractionInterface anotherFraction);
    FractionInterface mul(FractionInterface anotherFraction);
    FractionInterface div(FractionInterface anotherFraction);
}
