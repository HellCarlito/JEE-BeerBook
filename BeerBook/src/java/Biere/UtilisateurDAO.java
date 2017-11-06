/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biere;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Simon Hay
 */
@Stateless
public class UtilisateurDAO {
    
    @PersistenceContext(unitName = "BeerBookPU")
    private EntityManager em; // l'objet qui permettra faire liaison avec la BDD

    public void add(Utilisateur u){
        em.persist(u);
        em.flush();
    }    
}
