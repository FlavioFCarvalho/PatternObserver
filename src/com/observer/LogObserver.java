package com.observer;

import com.interfaces.Observer;

public class LogObserver implements Observer {
	
    @Override
    public void update(String message) {
        System.out.println("Log registrado: " + message);
    }
}

