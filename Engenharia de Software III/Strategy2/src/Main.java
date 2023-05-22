import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
        OrganizarListas organizarListas = new OrganizarListas();

        organizarListas.setOrganizar(new OrganizarCresente());
        Integer[] ar = organizarListas.organizar(arr);
        System.out.println(Arrays.toString(ar));

        organizarListas.setOrganizar(new OrganizarDecresente());
        organizarListas.organizar(arr);
        System.out.println(Arrays.toString(ar));

        organizarListas.setOrganizar(new OrganizarAleatorio());
        organizarListas.organizar(arr);
        System.out.println(Arrays.toString(ar));
    }
}