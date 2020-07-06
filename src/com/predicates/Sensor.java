package com.predicates;

public interface Sensor {
    int batteryHealth();
    void batteryHealth(int health);
    boolean triggered();
    void triggered(boolean state);
}
