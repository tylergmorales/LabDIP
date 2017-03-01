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
public class Startup {
    public static void main(String[] args) {
        MessageReader reader = new KeyboardMessageInput();
        Writer writer = new ConsoleMessageOutput();
        
        MessageService copier = new MessageService(reader, writer);
        copier.copyMessage();
    }
}
