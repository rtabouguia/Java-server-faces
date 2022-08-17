/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.m2i.jsf.web.app;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author RAISA
 */
@ManagedBean(name = "clubManager", eager = true)
@SessionScoped
public class ClubManager {
    private final List<Adherent> listeAdherents;
    private Adherent adherent;
    
    private String name;
    private String prenom;
    private String ville;
    private String dateNaissance;
    private String loisir;
    private String sexe;

    public ClubManager() {
        this.listeAdherents =  new ArrayList();
        this.adherent = new Adherent();
    }

     public String addAdherent() {
        listeAdherents.add(adherent);
        return null;
    }
     public String goToInscription() {
        return "inscription?faces-redirect=true";
    }
     
     public String onSave() {
        listeAdherents.add(adherent);
        adherent = new Adherent();
        return "listAdherent";
    }

    public List<Adherent> getAdherents() {
        return listeAdherents;
    }
    public void setAdherents(List<Adherent> adherents) {
        this.listeAdherents = adherents;
    }

     public Adherent getAdherent() {
        return adherent;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLoisir() {
        return loisir;
    }

    public void setLoisir(String loisir) {
        this.loisir = loisir;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
    
}
