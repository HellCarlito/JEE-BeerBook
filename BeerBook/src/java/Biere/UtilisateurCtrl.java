/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biere;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Simon Hay
 */
@Named(value = "utilCtrl")
@ViewScoped
public class UtilisateurCtrl implements Serializable{

    @EJB // Entreprise  Java Bean
    private UtilisateurDAO daoUtil;
    private Utilisateur util;
    
    /**
     * Creates a new instance of BiereCtrl
     */
    public UtilisateurCtrl() {
        this.util = new Utilisateur();
    }
    
    public void addUtil(){
        daoUtil.add(this.util);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Bienvenue " + util.getPseudoU() + " :-) !"));        
        this.util = new Utilisateur();
    }

    //Getters and setters

    public UtilisateurDAO getDaoUtil() {
        return daoUtil;
    }

    public void setDaoUtil(UtilisateurDAO daoUtil) {
        this.daoUtil = daoUtil;
    }

    public Utilisateur getUtil() {
        return util;
    }

    public void setUtil(Utilisateur util) {
        this.util = util;
    }
    
    
    
 

}
