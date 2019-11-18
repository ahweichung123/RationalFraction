/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fractionv2;

import rationalfraction.Fraction;

/**
 *
 * @author Student
 */
public class RationalFraction implements FractionInterface{
    
    private int numerator;
    private int denominator;

    public RationalFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    @Override
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    @Override
    public int getNumerator() {
        return numerator;
    }
    @Override
    public int getDenominator() {
        return denominator;
    }
    @Override
    public FractionInterface add(FractionInterface anotherFraction) {
        FractionInterface result = new RationalFraction(1,1);
        result.setNumerator((this.numerator * anotherFraction.getDenominator()) + (anotherFraction.getNumerator() * this.denominator));
        result.setDenominator(this.denominator * anotherFraction.getDenominator());
        return result;
    }
    @Override
    public FractionInterface sub(FractionInterface anotherFraction) {
        FractionInterface result = new RationalFraction(1,1);
        result.setNumerator((this.numerator * anotherFraction.getDenominator()) - (anotherFraction.getNumerator() * this.denominator));
        result.setDenominator(this.denominator * anotherFraction.getDenominator());
        return result;
    }
    @Override
    public FractionInterface mul(FractionInterface anotherFraction) {
        FractionInterface result = new RationalFraction(1,1);
        result.setNumerator(this.numerator * anotherFraction.getNumerator());
        result.setDenominator(this.denominator * anotherFraction.getDenominator());
        return result;
    }
    @Override
    public FractionInterface div(FractionInterface anotherFraction) {
        FractionInterface result = new RationalFraction(1,1);
        result.setNumerator(this.numerator * anotherFraction.getDenominator());
        result.setDenominator(this.denominator * anotherFraction.getNumerator());
        return result;
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }
}