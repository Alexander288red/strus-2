/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.struts1.action;

import com.mycompany.struts1.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Leo
 */
public class HelloWorldAction extends ActionSupport {

    private MessageStore messageStore;
    private static int helloCount = 0;
    private String userName;

    public String execute() throws Exception{
        messageStore = new MessageStore();
        if (userName != null) {
            messageStore.setMessage(messageStore.getMessage()+ " " + userName);
        }
        helloCount++;
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
    
    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
    
    public int getHelloCount() {
        return helloCount;
    }
    
    public void setHelloCount(int helloCount) {
        HelloWorldAction.helloCount = helloCount;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUsername(String userName) {
        this.userName = userName;
    }

}
