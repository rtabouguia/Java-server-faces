/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.jsf.web.app;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;


@ManagedBean(name = "navigationController", eager = true)
public class NavigationController {

    @ManagedProperty(value ="navigationController, eager=tru")
    private String pageId;
    
    public NavigationController() {

    }
    
    public String goToPage(){
        if (pageId ==null)
        {
            return "home";
        } 
        return "pageId";
    }

    public String moveToHello(){
        return "hello";
    }
     public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
    
}