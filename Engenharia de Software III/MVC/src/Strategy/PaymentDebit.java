package Strategy;

import Singleton.User;

public class PaymentDebit implements Payment {

    public void pay(User user, double value) {
        double currentAmmount = user.getAmmount();
        if(currentAmmount >= value){
            user.setAmmount(currentAmmount - value);
        }
        else {
            System.out.println("Out of ammount");
        }
    }
}
