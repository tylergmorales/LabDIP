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
public class MessageArrayInput {
    private String[] messages = {"Array Message 1", "Array message 2", "Array Message 3"};
    
    public String getMessage()
    {
        Random rand = new Random();
        int n = rand.nextInt(2) + 0;
        return messages[n];
    }
}
