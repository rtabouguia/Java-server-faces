/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.jsf.web.app;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "message", eager = true)
public class Message {

    private String message;

    public Message() {
        this.message = "Le message depuis le Bean Message";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}