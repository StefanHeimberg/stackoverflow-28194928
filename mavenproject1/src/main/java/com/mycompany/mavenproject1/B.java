package com.mycompany.mavenproject1;

@javax.ejb.Singleton
public class B {
    
    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(B.class.getName());
    
    @javax.ejb.EJB
    private C c;

    public B() {
        LOG.log(java.util.logging.Level.SEVERE, "B created");
    }
    
    @javax.annotation.PostConstruct
    public void init() {
        LOG.log(java.util.logging.Level.SEVERE, "C of type {0} injected", c.getClass().getName());
        LOG.log(java.util.logging.Level.SEVERE, "B is ready to use");
    }
    
    public void doSomething() {
        LOG.log(java.util.logging.Level.SEVERE, "B.doSomething()");
        c.doSomething();
    }
    
}
