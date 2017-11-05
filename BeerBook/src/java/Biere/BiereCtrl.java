/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biere;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author carlito
 */
@Named(value = "biereCtrl")
@ViewScoped
public class BiereCtrl implements Serializable{

    @EJB // Entreprise  Java Bean
    private BiereDAO dao;
    private Biere biere;
    
    /**
     * Creates a new instance of BiereCtrl
     */
    public BiereCtrl() {
        this.biere = new Biere();
    }
    
    public List<Biere> getBiere() {
        return dao.allBiere();
    }
    
    public BiereDAO getDao() {
        return dao;
    }

    public void setDao(BiereDAO dao) {
        this.dao = dao;
    }

    public Biere getBie() {
        return biere;
    }

    public void setBiere(Biere biere) {
        this.biere = biere;
    }

    public void addBiere() {
        dao.add(biere);
        biere = new Biere();
    }

    public void updateBiere() {
        dao.updateBiere(biere);
    }

}
