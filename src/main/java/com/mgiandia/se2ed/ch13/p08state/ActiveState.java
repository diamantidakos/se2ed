package com.mgiandia.se2ed.ch13.p08state;


class ActiveState extends AlarmObjectState {

    @Override
    public void deactivate(Alarm alarm) {
        alarm.getSiren().stop();
        alarm.setObjectState(new StandByState());
    }

    @Override
    public AlarmState getState() {
        return AlarmState.ACTIVATED;
    }
} 
