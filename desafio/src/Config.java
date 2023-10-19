public class Config {
    private static Config instance;
    private String appName;
    private int maxConnections;

    private Config() {
        // Defina as configurações padrão aqui
        this.appName = "MinhaAplicacao";
        this.maxConnections = 10;
    }

    public static Config getInstance() {
        if (instance == null) {
            synchronized (Config.class) {
                if (instance == null) {
                    instance = new Config();
                }
            }
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public void displayConfig() {
        System.out.println("Nome da Aplicação: " + appName);
        System.out.println("Número Máximo de Conexões: " + maxConnections);
    }
}
