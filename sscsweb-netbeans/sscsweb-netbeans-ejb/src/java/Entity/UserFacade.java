/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
<<<<<<< HEAD
 * @author andrea
=======
 * @author elia
>>>>>>> origin/master
 */
@Stateless
public class UserFacade extends AbstractFacade<User> implements UserFacadeLocal {

<<<<<<< HEAD
    @PersistenceContext(unitName = "sscsweb-netbeans-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
    
=======
  @PersistenceContext(unitName = "sscsweb-netbeans-ejbPU")
  private EntityManager em;

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }

  public UserFacade() {
    super(User.class);
  }
  
>>>>>>> origin/master
}
