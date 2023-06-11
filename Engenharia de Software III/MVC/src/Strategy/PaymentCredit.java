package Strategy;

import Singleton.User;

public class PaymentCredit implements Payment {

    public void pay(User user, double value) {
        double currentLimit = user.getLimit();
        if(currentLimit >= value){
            user.setLimit(currentLimit - value);
        }
        System.out.println("out of limit");
    }
}
