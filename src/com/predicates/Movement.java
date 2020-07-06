package com.predicates;

public class Movement implements Sensor {
    private int batteryHealth;
    private boolean isTriggered;
    private int ambientLight;
    @Override
    public  int batteryHealth() {
        return batteryHealth;
    }
    @Override
    public void batteryHealth(int health) {

    }
    @Override
    public boolean triggered() {
        return isTriggered
    }
    @Override
    public void triggered(boolean state){

    }
    public int ambientLight() {
        return ambientLight;
    }

}
