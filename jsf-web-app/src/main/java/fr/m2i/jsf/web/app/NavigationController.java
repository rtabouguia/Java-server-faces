/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.jsf.web.app;


import javax.faces.bean.ManagedBean;


@ManagedBean(name = "navigationController", eager = true)
public class NavigationController {


    public NavigationController() {

    }

    public String moveToHello(){
        return "hello";
    }
    
    public String moveToPage2(){
        return "page2";
    }
}