package com.mgiandia.se2ed.ch11.p10statemachine;

public class Alarm {

    private AlarmState state = AlarmState.STANDBY; 
    private Siren siren = new Siren();
    
    public AlarmState getState() {
        return state;
    }
    
    public void disarm() {
        if (AlarmState.ARMED.equals(state)) {    
            System.out.println("Going to STANDBY ...");
            state = AlarmState.STANDBY;
        }
    }
    
    public void sirenTest() {
        if (AlarmState.STANDBY.equals(state)) {         
            System.out.println("Going to ACTIVATED ...");
            state = AlarmState.ACTIVATED;
            siren.start();            
        }
        
    }
    
    public void intrusion() {
        if (AlarmState.ARMED.equals(state)) {
            System.out.println("Going to ACTIVATED ...");
            state = AlarmState.ACTIVATED;
            siren.start();
        }
    }
    public void deactivate() {
        if (AlarmState.ACTIVATED.equals(state)) {
            System.out.println("Going to STANDBY ...");
            siren.stop();
            state = AlarmState.STANDBY;
        }
    }
    
    public void arm() { 
        if (AlarmState.STANDBY.equals(state) && closedWindows()) {  
            System.out.println("Going to ARMED ...");
            state = AlarmState.ARMED;
        }
    }
            
    
    private boolean closedWindows() {
        return true;
    }
}

