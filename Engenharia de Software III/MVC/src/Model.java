import java.util.*;

public class Model implements Subject {
    private ArrayList observers;
    private String precoGoogle;
    private String precoAmazon;
    private String precoFacebook;

    public Model() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(precoGoogle, precoAmazon, precoFacebook);
        }
    }

    public void pricesChanged() {
        notifyObservers();
    }

    public void setPrices(String precoGoogle, String precoAmazon, String precoFacebook) {
        this.precoGoogle = precoGoogle;
        this.precoAmazon = precoAmazon;
        this.precoFacebook = precoFacebook;
        pricesChanged();
    }


    public String getGooglePrice() {
        return precoGoogle;
    }

    public String getAmazonPrice() {
        return precoAmazon;
    }

    public String getPrecoFacebook() {
        return precoFacebook;
    }
}