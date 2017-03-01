/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author tmorales3
 */
public class KeyboardMessageInput implements MessageReader {
    Scanner keyboard = new Scanner(System.in);
    
    public String getMessage()
    {
        String message = keyboard.nextLine();
        while(message.length() == 0)
        {
            System.out.println("Please enter message of at least 1 character.");
            message = keyboard.nextLine();
        }
        return message;     
    }
}
