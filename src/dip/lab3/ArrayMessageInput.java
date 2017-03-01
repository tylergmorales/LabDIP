/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Random;

/**
 *
 * @author tmorales3
 */
public class ArrayMessageInput implements MessageReader {
    private String[] messages = {"Array Message 1", "Array message 2", "Array Message 3", "Array Message 4", "Array Message 5"};
    
    public String getMessage()
    {
        Random rand = new Random();
        int n;
        {n = rand.nextInt(messages.length) + 0;}
        return messages[n];
    }
}
