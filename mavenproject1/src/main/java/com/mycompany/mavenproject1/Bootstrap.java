package com.mycompany.mavenproject1;

@javax.ejb.Singleton
@javax.ejb.Startup
public class Bootstrap {
    
    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(Bootstrap.class.getName());
    
    @javax.annotation.PostConstruct
    public void init() {
        LOG.log(java.util.logging.Level.SEVERE, "========================");
        LOG.log(java.util.logging.Level.SEVERE, "Bootstrap.init()");
        LOG.log(java.util.logging.Level.SEVERE, "========================");
    }
    
    @javax.annotation.PreDestroy
    public void destroy() {
        LOG.log(java.util.logging.Level.SEVERE, "========================");
        LOG.log(java.util.logging.Level.SEVERE, "Bootstrap.destroy()");
        LOG.log(java.util.logging.Level.SEVERE, "========================");
    }
    
}
