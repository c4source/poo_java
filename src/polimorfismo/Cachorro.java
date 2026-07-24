package polimorfismo;

public class Cachorro extends Lobo {

    //Metodos da classe Cachorro
    public void enterrarOsso()
    {
        System.out.println("Enterrando osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }

    //Metodos de sobrecarga ( assinaturas diferentes ) formas diferentes
    //Metodos sobrecarga vao na mesma classe, tem o msm nome e assinatura diferentes.
    // Os tipos das assinaturas sao diferentes umas das outras

    public void reagir(String frase){
            if (frase.equals("Toma comida") || frase.equals("Olá")) {
                System.out.println("Abanar o rabo");
            }
            else {
                System.out.println("Rosnar");
            }
    }

    public void reagir(int hora, int min) {
            if (hora < 12 ) {
                System.out.println("Abanar");
            }
            else if (hora > 18) {
            System.out.println("Ignorar");
            }
            else {
            System.out.println("abanar e latir");
            }
    }

    public void reagir(boolean dono) {
            if (dono) {
                System.out.println("Abanar");
            }
            else {
                System.out.println("Rosnar e latir");
            }


    }

    public void reagir (int idade, double peso) {
            if (idade < 5 ) {
                if (peso < 10) {
                    System.out.println("Abanar");
                } else {
                    System.out.println("Latir ");
                }
            }
            else if (idade < 18) {
                System.out.println("Rosnar");
            }
            else
            {
            System.out.println("ignorar");
            }

    }



}
