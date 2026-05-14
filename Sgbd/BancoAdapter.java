

public interface BancoAdapter {
    void conectar();
    void executarQuery(String query);
    void desconectar();
}