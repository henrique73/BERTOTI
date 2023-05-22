public class RepositoryConfig {
    private static RepositoryConfig instance;

    private String server;
    private String port;

    //O construtor da singleton deve ser escondido do código cliente. Chamando o método getInstance deve ser o único modo de obter o objeto singleton.
    private RepositoryConfig() {
        server = "locahost";
        port= "3000";
    }

    public static RepositoryConfig getInstance() {
        if (instance == null) {
            instance = new RepositoryConfig();
        }
        return instance;
    }

    public String getServerConnection() {
        return server + ":" + port;
    }
}
