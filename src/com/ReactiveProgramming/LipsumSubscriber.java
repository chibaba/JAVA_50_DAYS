package com.ReactiveProgramming;

import java.util.concurrent.Flow;

public class LipsumSubscriber implements Flow.Subscriber<String> {
    private  Flow.Subscription subscription;
    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }
    @Override
    public void onNext (String item) {

    }
    @Override
    public void onError(Throwable throwable) {

    }
    @Override
    public void onComplete() {

    }
}
