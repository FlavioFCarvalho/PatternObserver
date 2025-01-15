package com.subject;

import java.util.ArrayList;
import java.util.List;

import com.interfaces.Observer;

// Classe que gerencia os observadores
public class StockSubject {
	
    private List<Observer> observers = new ArrayList<>();
    private String productName;
    private int quantity;

    public StockSubject(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    // Adiciona um observador
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove um observador
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifica todos os observadores
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Estoque crítico para o produto: " + productName + " com quantidade: " + quantity);
        }
    }

    // Método para simular a baixa no estoque
    public void decreaseStock(int amount) {
        this.quantity -= amount;
        System.out.println("Quantidade restante de " + productName + ": " + quantity);
        if (this.quantity <= 5) { // Limite crítico
            notifyObservers();
        }
    }
}

