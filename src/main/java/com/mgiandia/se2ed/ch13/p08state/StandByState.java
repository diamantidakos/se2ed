package com.mgiandia.se2ed.ch13.p08state;

class StandByState extends AlarmObjectState {

    @Override
    AlarmState getState() {
        return AlarmState.STANDBY;
    }

    
    @Override
    void arm(Alarm alarm) {
        if (alarm.closedWindows()) {
            alarm.setObjectState(new ArmedState());
        }
    }
    
    @Override
    void sirenTest(Alarm alarm) {
        alarm.getSiren().start();
        alarm.setObjectState(new ActiveState());
    }

} //StandByState
