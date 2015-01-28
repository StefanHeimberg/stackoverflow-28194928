package com.mycompany.mavenproject1;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJBException;

@javax.ejb.Stateless
public class C {
    
    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(C.class.getName());
    
    private String uuid;

    public C() {
        uuid = UUID.randomUUID().toString();
        LOG.log(java.util.logging.Level.SEVERE, "C[uuid={0}] => created", uuid);
    }
    
    @javax.annotation.PostConstruct
    public void init() {
        LOG.log(java.util.logging.Level.SEVERE, "C[uuid={0}] => ready to use", uuid);
    }
    
    public void doSomething(String id, boolean withTimeout) {
        LOG.log(java.util.logging.Level.SEVERE, "C[uuid={0}] [{1}]     => doSomething() called", new Object[]{uuid, id});
        if(withTimeout) {
            try {
                Thread.sleep(Integer.valueOf(1000 * 60).longValue());
            } catch (InterruptedException ex) {
                Logger.getLogger(C.class.getName()).log(Level.SEVERE, null, ex);
                throw new EJBException(ex);
            }
        }
        LOG.log(java.util.logging.Level.SEVERE, "C[uuid={0}] [{1}]     => doSomething() finished", new Object[]{uuid, id});
    }
    
}
