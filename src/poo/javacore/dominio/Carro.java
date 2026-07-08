package poo.javacore.dominio;

public class Carro  {

        public String cor;
        public String marca;
        public String modelo;
        public int ano;
        public boolean ligado; //Se true = ligado, se false = desligado

        public void ligar(){
              this.ligado = true;
              System.out.println("Ligando o carro....");
        }

        public void desligar () {
                this.ligado = false;
                System.out.println("Desligando o carro....");
        }

        public void acelerar () {
                if (this.ligado == true) {
                        System.out.println("Acelerando...");
                }
                else {
                        System.out.println("Carro desligado! Ligue o carro.");
                }
        }
        public void re() {
                if (this.ligado == true) {
                        System.out.println("Dando ré...");
                }
                else {
                        System.out.println("Carro desligado!. Ligue o carro.");
                }
        }


        public void status() {
                System.out.println("Modelo do carro: " + this.modelo);
                System.out.println("Cor: " + this.cor);
                System.out.println("Ano: " + this.ano);
                System.out.println("Marca: " + this.marca);
                System.out.println("Carro ligado? " + this.ligado);

        }


}
