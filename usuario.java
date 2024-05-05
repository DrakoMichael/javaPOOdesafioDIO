import Funcionalidades.EquipamentoMultifuncional;

public class usuario {
    public static void main(String[] args) {
        EquipamentoMultifuncional celular = new EquipamentoMultifuncional();

        System.out.println("Usuário acessando o celular");
        celular.acessarWeb();
        celular.reproduzirMusica();
        celular.telefonar();
    }
}
