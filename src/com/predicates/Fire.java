package com.predicates;

public class Fire implements Sensor {
    private int batteryHealth;
    private boolean triggered;
    private int temperature;
    public Fire(int batteryHealth, boolean isTriggered, int temperature) {
        this.batteryHealth = batteryHealth;
        this.triggered = isTriggered;

    }


    @Override
    public int batteryHealth() {
        return batteryHealth;
    }
    @Override
       public void batteryHealth(int health) {

    }
    @Override
    public void triggered(boolean state)
}
public int temperature() {
    return temperature;
}
