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
 * @author carlito
 */
@Stateless
public class BiereDAO {

    @PersistenceContext(unitName = "BeerBookPU")
    private EntityManager em; // l'objet qui permettra faire liaison avec la BDD

    public List<Biere> allBiere() {
        // em --> entity manager
        Query query = em.createNamedQuery("Biere.findAll");
        return query.getResultList(); // pour récup la liste en entier
    }

    public void add(Biere e) {
        em.persist(e);
        em.flush();
    }
    
    public void updateBiere(Biere biere){
        Biere e = em.merge(biere);
        em.persist(e);
        em.flush();
    }
}
