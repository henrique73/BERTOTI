public class OrganizarListas {

    private Organizar organizar;

    public void setOrganizar(Organizar organizar){
        this.organizar = organizar;
    }

    public Integer[] organizar(Integer[] number){
        return this.organizar.organizar(number);
    }
}
