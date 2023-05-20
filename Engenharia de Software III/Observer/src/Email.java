public class Email implements Observer{
    public void update(String email, String zipcode){
        sendMail(email);
    }

    public void sendMail(String email){
        System.out.println("Para o email: " + email);
        System.out.println("Voce ganhou o sorteio");
    }
}
