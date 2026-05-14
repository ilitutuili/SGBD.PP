

public class FirebirdAdapter implements BancoAdapter {

    private Firebird firebird;

    public FirebirdAdapter() {
        firebird = new Firebird();
    }

    @Override
    public void conectar() {
        firebird.iniciarFirebird();
    }

    @Override
    public void executarQuery(String query) {
        firebird.rodarComando(query);
    }

    @Override
    public void desconectar() {
        firebird.encerrarFirebird();
    }
}