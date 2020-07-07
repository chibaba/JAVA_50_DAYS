package com.predicates;

public class HasAlarm implements Predicate<Sensor> {
    @Override
    public boolean test(Sensor sensor) {
        return sensor.triggered();
    }
}
