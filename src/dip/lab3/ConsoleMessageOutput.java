/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author tmorales3
 */
public class ConsoleMessageOutput implements Writer {

    @Override
    public void outputMessage(String message) {
        System.out.println(message);
    }
    
    
}
