/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import beans.Correspondrepas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author machd
 */
@Stateless
public class CorrespondrepasFacade extends AbstractFacade<Correspondrepas> {
    @PersistenceContext(unitName = "GDTIAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CorrespondrepasFacade() {
        super(Correspondrepas.class);
    }
    
}
