package com.mgiandia.se2ed.ch13.p08state;

public class Alarm {

    private AlarmObjectState objectState = new StandByState(); 
    private Siren siren = new Siren();
    
    public AlarmState getState() {
        return objectState.getState();
    }
    
    public void arm() {         
       objectState.arm(this);        
    }
    
    public void disarm() {
        objectState.disarm(this);        
    }
    
    
    public void sirenTest() {
        objectState.sirenTest(this);
    }
    
    public void intrusion() {
        objectState.intrusion(this);
    }
    
    public void deactivate() {
        objectState.deactivate(this);
    }
   
    
            
    void setObjectState(AlarmObjectState state) {
        this.objectState = state;
    }
    
    
    Siren getSiren() {
        return siren;
    }
    
    boolean closedWindows() {
        return true;
    }
}

