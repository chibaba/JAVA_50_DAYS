package com.predicates;

// the alarm system will have 3 kinds of sensors
// 1 alarm sensors
// 2. gateway sensors
//3.fire sensors

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Alarm {
    public static void main(String[] args) {
        List<Sensor> sensors = new ArrayList<>();
        sensors.add(new Gateway(34, false));
        sensors.add(new Gateway(14, true));
        sensors.add(new Gateway(74, false));
        sensors.add(new Gateway(8, false));
        sensors.add(new Gateway(18, false));
        sensors.add(new Gateway(9, false));
        Predicate<Sensor> hasAlarmOrWarning = new HasAlarm().or(new HasWarning());
        for (Sensor sensor : sensors) {
            if (new HasAlarm().test(sensor)) {
                System.out.println("Alarm was triggered");
            }
        }

    }

}
