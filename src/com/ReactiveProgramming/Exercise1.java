package com.ReactiveProgramming;

import java.util.concurrent.SubmissionPublisher;

public class Exercise1 {
    public static void main(String[]  args) {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        LipsumSubscriber lipsumSubscriber = new LipsumSubscriber();
        publisher.subscribe(lipsumSubscriber);
        String filePath = "res/lipsum.txt";
    }
}
