package com.processes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Exercise4 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("firefox");
        Process process = null;
        try {
            process = processBuilder.start();
        } catch (IOException ioe) {
            System.out.println("WARNING: interruption happened with exec");

        }
        try {
            process.waitFor(10, TimeUnit.SECONDS)
        }
    }
}
