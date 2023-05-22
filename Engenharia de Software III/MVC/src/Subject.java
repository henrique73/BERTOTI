public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    void setPrices(String precoGoogle, String precoAmazon, String precoFacebook);
}