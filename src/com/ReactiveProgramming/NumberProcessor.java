package com.ReactiveProgramming;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

    public class NumberProcessor extends SubmissionPublisher<String>
            implements Flow.Processor<String, String> {
        private Flow.Subscription subscription;
        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            this.subscription = subscription;
            this.subscription.request(1);
        }
        @Override
        public void onNext(String item) {
            this.subscription.request(1);
        }
        @Override
        public void onError(Throwable throwable) {
            closeExceptionally(throwable);
        }
        @Override
        public void onComplete() {
            close();
        }
    }

