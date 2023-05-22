public class Controller implements controllerInterface{
    View view;
    Subject model;
    public Controller(Subject mo){
        this.model = mo;
        view = new View(model, this);
        view.createView();
        view.desabilitarBotaoDesconectar();

    }

    public void conectar(){

        model.registerObserver(view);
        System.out.println("Conectado ao mercado de açoes");
        view.desabilitarBotaoConectar();
        view.habilitarBotaoDesconectar();

    }

    public void desconectar(){

        model.removeObserver(view);
        System.out.println("Desconectado");
        view.desabilitarBotaoDesconectar();
        view.habilitarBotaoConectar();

    }

}