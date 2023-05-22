import java.util.ArrayList;
import java.util.Random;

public class Sorting{

    private ArrayList observers;
    private User[] users;

    public Sorting(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers(String email, String zipcode){
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(email, zipcode);
        }
    }

    public String sort(User[] users){
        int randomNum = new Random().nextInt(users.length);
        notifyObservers(users[randomNum].email, users[randomNum].zipcode);

        return users[randomNum].email;
    }
}
