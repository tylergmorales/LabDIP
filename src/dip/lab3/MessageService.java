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
public class MessageService {
    private MessageReader reader;
    private Writer writer;
    
    public MessageService(MessageReader reader, Writer writer)
    {
        this.reader = reader;
        this.writer = writer;
    }
    
    public void copyMessage(){
        String message = reader.getMessage();
        writer.outputMessage(message);
    }
}
