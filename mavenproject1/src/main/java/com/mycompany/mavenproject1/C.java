package com.mycompany.mavenproject1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJBException;

@javax.ejb.Stateless
public class C {
    
    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(C.class.getName());

    public C() {
        LOG.log(java.util.logging.Level.SEVERE, "C created");
    }
    
    @javax.annotation.PostConstruct
    public void init() {
        LOG.log(java.util.logging.Level.SEVERE, "C is ready to use");
    }
    
    public void doSomething(String id, boolean withTimeout) {
        LOG.log(java.util.logging.Level.SEVERE, "[{0}]       => C.doSomething() called", id);
        if(withTimeout) {
            try {
                Thread.sleep(Integer.valueOf(1000 * 60 * 5).longValue());
            } catch (InterruptedException ex) {
                Logger.getLogger(C.class.getName()).log(Level.SEVERE, null, ex);
                throw new EJBException(ex);
            }
        }
        LOG.log(java.util.logging.Level.SEVERE, "[{0}]       => C.doSomething() finished", id);
    }
    
}
