public class Main {
    public static void main(String[] args) {
        RepositoryConfig repositoryConfig = RepositoryConfig.getInstance();
        String repoConfig = repositoryConfig.getServerConnection();
        System.out.println(repoConfig);
    }
}