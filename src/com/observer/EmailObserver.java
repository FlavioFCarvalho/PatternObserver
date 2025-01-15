package com.observer;

import com.interfaces.Observer;

public class EmailObserver implements Observer {
	
    @Override
    public void update(String message) {
        System.out.println("Email enviado: " + message);
    }
}

