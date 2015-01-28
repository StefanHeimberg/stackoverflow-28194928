package com.mycompany.mavenproject1;

@javax.ejb.Stateless
public class A implements ARemote {
    
    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(A.class.getName());
    
    @javax.ejb.EJB
    private B b;

    public A() {
        LOG.log(java.util.logging.Level.SEVERE, "A created");
    }
    
    @javax.annotation.PostConstruct
    public void init() {
        LOG.log(java.util.logging.Level.SEVERE, "B of type {0} injected", b.getClass().getName());
        LOG.log(java.util.logging.Level.SEVERE, "B is ready to use");
    }
    
    @Override
    public void doSomething() {
        LOG.log(java.util.logging.Level.SEVERE, "A.doSomething()");
        b.doSomething();
    }
    
}
