package com.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Alarm2 {
    static boolean alarmServiceNotified;
    public static void main(String[] args) {
        List<Sensor> sensors = new ArrayList<>();
        sensors.add(new Gateway(34,false));
        sensors.add(new Gateway( 14, true));
        sensors.add(new Gateway(74,false));
        sensors.add(new Gateway(8, false));
        sensors.add(new Gateway(18, false));
        sensors.add(new Gateway(9, false));
        Predicate<Sensor> hasAlarmOrWarning = new HasAlarm().or(new HasWarning());
    }
}
