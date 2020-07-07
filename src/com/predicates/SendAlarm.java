package com.predicates;

import java.util.function.Consumer;

public class SendAlarm implements Consumer<Sensor> {
    @Override
    public void accept(Sensor sensor) {
        if (sensor.triggered()) {
            Alarm2.alarmServiceNotified = true;
        }
    }
}
