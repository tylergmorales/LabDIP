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
public class KeyboardMessageInput implements Reader {
    Scanner keyboard = new Scanner(System.in);
    
    public String getMessage()
    {
        return keyboard.nextLine();     
    }
}
