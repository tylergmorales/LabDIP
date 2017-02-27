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
public class Startup {
    public static void main(String[] args) {
        TipCalculator calc = new BartenderServiceTipCalculator(2, 2);
        TipCalculator calc2 = new FoodServiceTipCalculator(100, .2);
        
        
        TipCalculatorService service = new TipCalculatorService(calc);
        TipCalculatorService service2 = new TipCalculatorService(calc2);
        
        System.out.println(service.getTip());
        System.out.println(service2.getTip());
    }
    
}
