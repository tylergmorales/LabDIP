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
public class MessageArrayInput implements Reader {
    private String[] messages = {"Array Message 1", "Array message 2", "Array Message 3"};
    
    public String getMessage()
    {
        Random rand = new Random();
        int n;
        do {n = rand.nextInt(3) + 0;}
        while(n != 3);
        return messages[n];
    }
}
