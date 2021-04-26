package com.mgiandia.se2ed.ch13.p08state;

class ArmedState extends AlarmObjectState {

    @Override
    AlarmState getState() {
        return AlarmState.ARMED;
    }
    
    @Override
    void intrusion(Alarm alarm) {
        alarm.getSiren().start();
        alarm.setObjectState(new ActiveState());
    }
    
    
    @Override
    void disarm(Alarm alarm) {
        alarm.setObjectState(new StandByState());
    }
} 
