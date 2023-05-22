import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Model model = new Model();
        ControllerTrial controller = new ControllerTrial(model);
        Random ran = new Random();

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int randomNumber = ran.ints(1, 0, 11).findFirst().getAsInt();
            public void run() {
                model.setPrices(((Integer) ran.nextInt(6)).toString(), ((Integer) ran.nextInt(10)).toString(), ((Integer) ran.nextInt(15)).toString());
            }
        },0 , 5000);
    }

}