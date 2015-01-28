package com.mycompany.mavenproject1;

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
    
    public void doSomething() {
        LOG.log(java.util.logging.Level.SEVERE, "C.doSomething()");
    }
    
}
