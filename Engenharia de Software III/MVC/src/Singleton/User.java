package Singleton;

import Strategy.Payment;

import java.util.ArrayList;

public class User{
    private static User instance;
    private ArrayList observers;
    private String name;
    private double ammount;
    private double limit;
    private Payment strategy;

    public void registerObserver(UserObserver o){
        observers.add(o);
    }

    public void removeObserver(UserObserver o){
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers(double limit, double debit){
        for (int i = 0; i < observers.size(); i++) {
            UserObserver observer = (UserObserver)observers.get(i);
            observer.updateUser(ammount, limit);
        }
    }

    private User(String name, double ammount, double limit) {
        observers = new ArrayList();
        this.name = name;
        this.ammount = ammount;
        this.limit = limit;
    }

    public static User getUser(String nome, double ammount, double limit) {
        if (instance == null) {
            instance = new User(nome, ammount, limit);
        }
        return instance;
    }

    public void setStrategy(Payment strategy) {
        this.strategy = strategy;
    }

    public void charge(double value) {
        if (strategy != null) {
            strategy.pay(this, value);
            notifyObservers(getLimit(), getAmmount());
        } else {
            System.out.println("Strategy not set");
        }
    }

    public double getAmmount() {
        return this.ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public double getLimit() {
        return this.limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
