

public class MySQLAdapter implements BancoAdapter {

    private MySQL mysql;

    public MySQLAdapter() {
        mysql = new MySQL();
    }

    @Override
    public void conectar() {
        mysql.connect();
    }

    @Override
    public void executarQuery(String query) {
        mysql.execute(query);
    }

    @Override
    public void desconectar() {
        mysql.disconnect();
    }
}