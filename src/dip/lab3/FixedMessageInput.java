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
public class FixedMessageInput implements MessageReader {
    private final String MESSAGE = "Fixed Message Input";
    
    @Override
    public String getMessage(){
        return MESSAGE;
    }
}
