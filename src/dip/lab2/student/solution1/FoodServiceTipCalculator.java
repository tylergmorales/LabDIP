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
public class FoodServiceTipCalculator implements TipCalculator {
    private double bill;
    private double tipPercent;

    public FoodServiceTipCalculator(double bill, double tipPercent) {
        setBill(bill);
        setTipPercent(tipPercent);
    }

    public double getNetBillAmt() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }
    
    public double getCalculatedTip()
    {
        return bill * tipPercent;
    }
}
