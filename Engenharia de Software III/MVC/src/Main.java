import Singleton.User;

public class Main {
    public static void main(String[] args) {
        User user = User.getUser("TESTE", 100, 100);
        Controller controller = new Controller(user);
    }

}