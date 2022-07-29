/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.jsf.web.app;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

    @ManagedProperty(value = "#{message}")
    private Message messageBean;

    private String message;

    public HelloWorld() {

    }

    public String getMessage() {

        if (messageBean != null) {
            message = messageBean.getMessage();
        }

        return message;
    }

    public void setMessageBean(Message messageBean) {
        this.messageBean = messageBean;
    }
}