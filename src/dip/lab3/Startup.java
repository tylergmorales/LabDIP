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
        Reader reader = new MessageArrayInput();
        Writer writer = new GUIMessageOutput();
        
        Copier copier = new Copier(reader, writer);
        copier.copyMessage();
    }
}
