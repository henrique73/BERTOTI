import java.util.Arrays;
import java.util.Collections;

public class OrganizarDecresente implements Organizar {

    public Integer[] organizar(Integer[] number) {
        Arrays.sort(number, Collections.reverseOrder());
        return number;
    }
}
