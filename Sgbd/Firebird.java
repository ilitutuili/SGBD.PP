

public class Firebird {

    public void iniciarFirebird() {
        System.out.println("Conectado ao Firebird.");
    }

    public void rodarComando(String sql) {
        System.out.println("Executando no Firebird: " + sql);
    }

    public void encerrarFirebird() {
        System.out.println("Desconectado do Firebird.");
    }
}