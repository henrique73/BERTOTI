package Strategy;

import Singleton.User;

public interface Payment {
    void pay(User user, double value);
}
