package com.predicates;

public class Gateway implements Sensor {
    private int batteryHealth;
    private  boolean triggered;

@Override
public  int batteryHealth() {
    return batteryHealth;
}
@Override
public void batteryHealth(int health) {
    this.batteryHealth = health;
}
@Override
public boolean triggered() {
    return triggered;
}
@Override
public void triggered (boolean state) {
    triggered = state;
}
}
