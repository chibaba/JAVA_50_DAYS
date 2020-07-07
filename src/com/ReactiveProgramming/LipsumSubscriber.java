package com.ReactiveProgramming;

import java.util.concurrent.Flow;

public class LipsumSubscriber implements Flow.Subscriber<String> {
    private  Flow.Subscription subscription;
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);

    }
    @Override
    public void onNext (String item) {
        System.out.println(item);

    }
    @Override
    public void onError(Throwable throwable) {

    }
    @Override
    public void onComplete() {

    }
}
