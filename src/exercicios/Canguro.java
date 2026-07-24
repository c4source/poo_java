package exercicios;

public class Canguro extends Mamifero{

    //Metodo da classe
    public void usarBolsa(){
        System.out.println("Usando a bolsa");
    }

    // Metodo sobreposto
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }


}
