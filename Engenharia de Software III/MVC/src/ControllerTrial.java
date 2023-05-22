public class ControllerTrial implements controllerInterface{

    View view;
    Subject model;

    public ControllerTrial(Subject mo){
        this.model = mo;
        view = new View(model, this);
        view.createView();
        view.habilitarBotaoDesconectar();

    }

    public void conectar(){
        model.registerObserver(view);
        System.out.println("Conectar no mercado de açoes");
        view.desabilitarBotaoConectar();
        view.habilitarBotaoDesconectar();
    }

    public void desconectar(){
        model.removeObserver(view);
        System.out.println("Assinatura cancelada");
        view.desabilitarBotaoDesconectar();
        view.habilitarBotaoConectar();
    }

}