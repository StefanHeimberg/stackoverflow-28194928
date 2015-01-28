package com.mycompany.mavenproject1;

public class ARemoteIT {
    
    public static <T> T lookup(final String jndiName, final Class<T> type) throws javax.naming.NamingException {
        final javax.naming.Context context = new javax.naming.InitialContext();
        return type.cast(context.lookup(jndiName));
    }
    
    @org.junit.Test
    public void client1() throws javax.naming.NamingException, InterruptedException {
        // run method with timeout on C
        lookup(ARemote.JNDI_NAME, ARemote.class).doSomething("client1", true);
    }
    
    @org.junit.Test
    public void client2() throws javax.naming.NamingException, InterruptedException {
        // run method without timeout on C
        lookup(ARemote.JNDI_NAME, ARemote.class).doSomething("client2", false);
    }
    
}
