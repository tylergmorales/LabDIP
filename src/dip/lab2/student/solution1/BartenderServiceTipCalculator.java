/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author tmorales3
 */
public class BartenderServiceTipCalculator implements TipCalculator {
    private int drinkQty;
    private double flatTipAmount;

    public int getDrinkQty() {
        return drinkQty;
    }

    public void setDrinkQty(int drinkQty) {
        if(drinkQty < 1)
        {
            throw new IllegalArgumentException("Enter Qty of drinks more than 0");
        }
        this.drinkQty = drinkQty;
    }

    public double getFlatTipAmount() {
        return flatTipAmount;
    }

    public void setFlatTipAmount(double flatTipAmount) {
        if (flatTipAmount <= 0)
        {
            throw new IllegalArgumentException("Enter Flat tip Amount greater than 0");
        }
        this.flatTipAmount = flatTipAmount;
    }

    public BartenderServiceTipCalculator(int drinkQty, double flatTipAmount) {
        setDrinkQty(drinkQty);
        setFlatTipAmount(flatTipAmount);
    }
    
    public double getCalculatedTip()
    {
        return drinkQty * flatTipAmount;
    }
}
