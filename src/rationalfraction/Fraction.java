/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rationalfraction;

/**
 *
 * @author Student
 */
public class Fraction {
    private int numerator;
    private int denominator;
        
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }
    
    public Fraction add(Fraction anotherFraction){
        Fraction result = new Fraction(1,1);
        result.setNumerator((this.numerator * anotherFraction.denominator) + (anotherFraction.numerator * this.denominator));
        result.setDenominator(this.denominator * anotherFraction.denominator);
        return result;
    }
    public Fraction sub(Fraction anotherFraction){
        Fraction result = new Fraction(1,1);
        result.setNumerator((this.numerator * anotherFraction.denominator) - (anotherFraction.numerator * this.denominator));
        result.setDenominator(this.denominator * anotherFraction.denominator);
        return result;
    }
    public Fraction mul(Fraction anotherFraction){
        Fraction result = new Fraction(1,1);
        result.setNumerator((this.numerator * anotherFraction.numerator));
        result.setDenominator(this.denominator * anotherFraction.denominator);
        return result;
    }
    public Fraction div(Fraction anotherFraction){
        Fraction result = new Fraction(1,1);
        result.setNumerator((this.numerator * anotherFraction.denominator));
        result.setDenominator(this.denominator * anotherFraction.numerator);
        return result;
    }
    
}
