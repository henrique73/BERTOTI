import Strategy.PaymentCredit;
import Strategy.PaymentDebit;
import Singleton.User;

public class Controller implements controllerInterface{
    View view;
    User user;

    public Controller(User user){
        this.user = user;
        view = new View(user,this);
        view.createView();
        user.registerObserver(view);
    }

    public void comprarGoogle(double value){
        user.charge(value);
    }

    public void comprarAmazon(double value){
        user.charge(value);
    }

    public void comprarFacebook(double value){
        user.charge(value);
    }

    public void selectDebit(){
        view.desabilitarBotaoDebito();
        user.setStrategy(new PaymentDebit());
        view.habilitarBotaoCredito();
    }

    public void selectCredit(){
        view.desabilitarBotaoCredito();
        user.setStrategy(new PaymentCredit());
        view.habilitarBotaoDebito();
    }

}