package poo.javacore.teste;

import poo.javacore.dominio.Cachorro;
import poo.javacore.dominio.Gato;

public class AnimalTeste01 {
    public static void main(String[] args) {

        Gato gato1 = new Gato();
        gato1.setNome("paçoca");
        gato1.setCor("Preto"); //metodo esta privado.
        gato1.setAltura(30.00);
        gato1.setTipo("Ciames");
        gato1.status();
        gato1.ataque();
        gato1.pular();

        System.out.println(" ");

        Cachorro cachorro1 = new Cachorro("Cereja", "Caramelo");
        cachorro1.ataque();
        cachorro1.emitirSom();
        cachorro1.pular();


    }
}
