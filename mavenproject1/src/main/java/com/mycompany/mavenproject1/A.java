package com.mycompany.mavenproject1;

import java.util.UUID;

@javax.ejb.Stateless
public class A implements ARemote {
    
    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(A.class.getName());
    
    private String uuid;
    
    @javax.ejb.EJB
    private B b;

    public A() {
        uuid = UUID.randomUUID().toString();
        LOG.log(java.util.logging.Level.SEVERE, "A[uuid={0}] => created ()", uuid);
    }
    
    @javax.annotation.PostConstruct
    public void init() {
        LOG.log(java.util.logging.Level.SEVERE, "A[uuid={0}] => B of type {1} injected", new Object[]{uuid, b.getClass().getName()});
        LOG.log(java.util.logging.Level.SEVERE, "A[uuid={0}] => ready to use ", uuid);
    }
    
    @Override
    public void doSomething(String id, boolean withTimeout) {
        LOG.log(java.util.logging.Level.SEVERE, "A[uuid={0}] [{1}] => doSomething() called", new Object[]{uuid, id});
        b.doSomething(id, withTimeout);
        LOG.log(java.util.logging.Level.SEVERE, "A[uuid={0}] [{1}] => doSomething() finished", new Object[]{uuid, id});
    }
    
}
