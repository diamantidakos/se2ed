package com.mgiandia.se2ed.ch13.p08state;


abstract class AlarmObjectState {

    abstract AlarmState getState();
    void arm(Alarm alarm) {}
    void disarm(Alarm alarm) {}
    void sirenTest(Alarm alarm) {}
    void intrusion(Alarm alarm) {}
    void deactivate(Alarm alarm) {}    
     
    
}
