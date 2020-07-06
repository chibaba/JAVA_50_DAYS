package com.predicates;

// the alarm system will have 3 kinds of sensors
// 1 alarm sensors
// 2. gateway sensors
//3.fire sensors

public class Alarm {
    public static void main(String[] args) {

    }
    public interface Sensor{
        int batteryHealth();
        void batteryHealth(int health);
        boolean triggered();
        void triggered(boolean state);
    }
}
