package com.predicates;

import java.util.function.Consumer;

public class ResetAlarm implements Consumer<Sensor> {
    @Override
    public void accept(Sensor sensor) {
        sensor.triggered(false);
        sensor.batteryHealth(50);
        Alarm2.alarmServiceNotified = false;

    }
}
