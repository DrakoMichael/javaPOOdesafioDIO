package Funcionalidades;

import Funcionalidades.NavegaçãoWeb.Navegador;
import Funcionalidades.ReprodutorMusical.ReprodutorMusical;
import Funcionalidades.Telefonia.sistemaTelefonico;

public class EquipamentoMultifuncional implements Navegador, ReprodutorMusical, sistemaTelefonico  {

    public void acessarWeb() {
        System.out.println("Acessando a web pelo equipamento Multifuncional");
    }
    public void reproduzirMusica() {
        System.out.println("reproduzindo música pelo equipamento Multifuncional");
    }
    public void telefonar() {
        System.out.println("Telefonando pelo equipamento Multifuncional");
    }

    
} 