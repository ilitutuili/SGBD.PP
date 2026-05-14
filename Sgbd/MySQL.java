

public class MySQL {

    public void connect() {
        System.out.println("Conectado ao MySQL.");
    }

    public void execute(String sql) {
        System.out.println("Executando no MySQL: " + sql);
    }

    public void disconnect() {
        System.out.println("Desconectado do MySQL.");
    }
}