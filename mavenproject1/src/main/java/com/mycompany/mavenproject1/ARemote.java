package com.mycompany.mavenproject1;

import javax.ejb.Remote;

@Remote
public interface ARemote {
    
    public static final String JNDI_NAME = "java:global/mavenproject1/A!com.mycompany.mavenproject1.ARemote";
    
    public void doSomething(String id, boolean withTimeout);
    
}
