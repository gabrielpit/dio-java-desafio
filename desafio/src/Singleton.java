public class Singleton {
    public static void main(String[] args) {
        Config config = Config.getInstance();

        // A partir deste ponto, você pode acessar o objeto Config em qualquer lugar do código.
        // Altere as configurações conforme necessário.
        config.setAppName("MeuNovoApp");
        config.setMaxConnections(20);

        // Exiba as configurações
        config.displayConfig();
    }
}