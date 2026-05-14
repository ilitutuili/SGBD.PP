
 
public class Main {

    public static void main(String[] args) {

        PerfilUsuario perfil = PerfilUsuario.ULTIMATE;

        BancoAdapter banco = selecionarBanco(perfil);

        banco.conectar();
        banco.executarQuery("SELECT * FROM usuarios");
        banco.desconectar();
    }

    public static BancoAdapter selecionarBanco(PerfilUsuario perfil) {

        switch (perfil) {

            case GRATUITO:
                System.out.println("Perfil Gratuito -> Paradox");
                return new ParadoxAdapter();

            case BASICO:
                System.out.println("Perfil Básico -> Firebird");
                return new FirebirdAdapter();

            case ULTIMATE:
                System.out.println("Perfil Ultimate -> MySQL");
                return new MySQLAdapter();

            default:
                throw new IllegalArgumentException("Perfil inválido.");
        }
    }
}