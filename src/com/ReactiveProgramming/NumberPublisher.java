package com.ReactiveProgramming;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.SubmissionPublisher;

public class NumberPublisher extends SubmissionPublisher <String> {
    final Timer timer = new Timer();
    final TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {

        }
    };
    public NumberPublisher() {

    }

}
