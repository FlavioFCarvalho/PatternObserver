package com.observer;

import com.interfaces.Observer;

public class DashboardObserver implements Observer {
	
    @Override
    public void update(String message) {
        System.out.println("Alerta no painel: " + message);
    }
}

