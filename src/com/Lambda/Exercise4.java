package com.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        List<Tire> tires = List.of(
                new Tire(17),
                new Tire(16),
                new Tire(18),
                new Tire(24),
                new Tire(12));
        Comparator<Tire> sorter = (t1, t2) -> t2.size - t1.size;
        List<Tire> sorted = new ArrayList<>(tires);
        sorted.sort(sorter);
        System.out.println(sorted);
    }
        private static final class Tire {
            private final int size;
            public Tire (int size) {
                this.size = size;
            }

            @Override
            public String toString() {
                return String .valueOf(size);
            }
        }
    }

