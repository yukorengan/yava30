package com.verdin.jsf.ejb;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
 
@Singleton
@Startup
public class StartupBean {
    public enum States {BEFORESTARTED, STARTED, PAUSED, SHUTTINGDOWN};
    HarusAda _harusAda = new HarusAda();
    private States state;
    @PostConstruct
    public void initialize() {
        state = States.BEFORESTARTED;
        // Perform intialization
        
        _harusAda.initialize();
        
        state = States.STARTED;
        System.out.println("Service Started");
    }
    
    @PreDestroy
    public void terminate() {
        state = States.SHUTTINGDOWN;
        // Perform termination
        System.out.println("Shut down in progress");
    }
    
    public States getState() {
        return state;
    }
    
    public void setState(States state) {
        this.state = state;
    }
}