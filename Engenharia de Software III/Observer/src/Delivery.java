public class Delivery implements Observer{
    public void update(String email, String zipcode){
        sendPrize(zipcode);
    }

    public void sendPrize(String zipcode){
        System.out.println("Enviando premio para o endereco: " + zipcode);
    }
}
