package com.observable;

import com.observer.IObserver;

public interface IObservable {
    public void add(IObserver iObserver);
    public void remove(IObserver iObserver);
    public void notifying();
}
