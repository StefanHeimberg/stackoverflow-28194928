package com.mycompany.mavenproject1;

public class ARemoteIT {
    
    public static <T> T lookup(final String jndiName, final Class<T> type) throws javax.naming.NamingException {
        final javax.naming.Context context = new javax.naming.InitialContext();
        return type.cast(context.lookup(jndiName));
    }
    
    @org.junit.Test
    public void test() throws javax.naming.NamingException, InterruptedException {
        // client 1
        final ARemote client1 = lookup(ARemote.JNDI_NAME, ARemote.class);
        client1.doSomething();
        
        Thread.sleep(1000l);
        
        // client 2
        final ARemote client2 = lookup(ARemote.JNDI_NAME, ARemote.class);
        client2.doSomething();
    }
    
}
