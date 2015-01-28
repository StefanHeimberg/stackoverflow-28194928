package com.mycompany.mavenproject1;

import java.util.UUID;

@javax.ejb.Singleton
public class B {
    
    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(B.class.getName());
    
    private String uuid;
    
    @javax.ejb.EJB
    private C c;

    public B() {
        uuid = UUID.randomUUID().toString();
        LOG.log(java.util.logging.Level.SEVERE, "B[uuid={0}] => created", uuid);
    }
    
    @javax.annotation.PostConstruct
    public void init() {
        LOG.log(java.util.logging.Level.SEVERE, "B[uuid={0}] => C of type {1} injected", new Object[]{uuid, c.getClass().getName()});
        LOG.log(java.util.logging.Level.SEVERE, "B[uuid={0}] => ready to use", uuid);
    }
    
    public void doSomething(String id, boolean withTimeout) {
        LOG.log(java.util.logging.Level.SEVERE, "B[uuid={0}] [{1}]   => doSomething() called", new Object[]{uuid, id});
        c.doSomething(id, withTimeout);
        LOG.log(java.util.logging.Level.SEVERE, "B[uuid={0}] [{1}]   => doSomething() finished", new Object[]{uuid, id});
    }
    
}
