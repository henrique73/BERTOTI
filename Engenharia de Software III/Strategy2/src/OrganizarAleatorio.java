import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrganizarAleatorio implements Organizar {

    public Integer[] organizar(Integer[] number){
        List<Integer> intList = Arrays.asList(number);
        Collections.shuffle(intList);
        intList.toArray(number);

        return number;
    }
}
