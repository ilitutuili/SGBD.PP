

public class ParadoxAdapter implements BancoAdapter {

    private Paradox paradox;

    public ParadoxAdapter() {
        paradox = new Paradox();
    }

    @Override
    public void conectar() {
        paradox.abrirBancoParadox();
    }

    @Override
    public void executarQuery(String query) {
        paradox.executarSQLParadox(query);
    }

    @Override
    public void desconectar() {
        paradox.fecharBancoParadox();
    }
}