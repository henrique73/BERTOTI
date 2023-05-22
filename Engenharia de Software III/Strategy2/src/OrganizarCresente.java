import java.util.Arrays;

public class OrganizarCresente implements Organizar {

    public Integer[] organizar(Integer[] number) {
        Arrays.sort(number);
        return number;
    }
}
