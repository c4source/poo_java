package poo.javacore.teste;

import poo.javacore.dominio.Caneta;
import poo.javacore.dominio.Carro;

public class CanetaTes01 {
    public static void main(String[] args) {

        //Instanciamento
        //Caneta c1 = new Caneta();
        //Caneta c2 = new Caneta();
        //Caneta c3 = new Caneta();

        //Instanciamento com construtor com parametros
        Caneta c4 = new Caneta("FABER CASTLE", "VERDE", 1.5, 100, true); // Metodo construtor
        Caneta c5 = new Caneta("BIC", "PRETA", 0.8, 220, false);
        Caneta c6 = new Caneta ("PENTEL", "AZUL", 2.0f, 100, true);

        //VISIBILIDADE PUBLICA, PODEMOS ACESSAR OS ATRIBUTOS E POR VALORES.
        //c1.modelo = "BIG CRISTAL";
        //c1.cor = "PRETA";
       // c1.carga = 80;

          // c1.ponta = 0.5f; Visibilidade private: ERRO!
         // c1.carga = 80;  Visibilidade protected: ERRO!
        // c1.tampado = false; Visibilidade private: ERRO! Um metodo publico dentro da classe consegue alterar esse atributo private
        // c1.pintar(); metodo privado.

        //Acessibilidade
        //c1.destampar(); //metodo dentro da classe Caneta é publico, ele pode acessar o atributo privado tampado dentro da main, pq ele esta dentro da classe do atributo privado
        //c1.status();
        //c1.rabiscar();
        //c1.pintar();

        // Getters e Setters, metodos de acesso, e Construtor.
        System.out.println("===== Acessos ao modelo =========");
        //c1.setModelo("FABER CASTLE"); //Modificando o valor com set o atributo modelo pelo metodo setModelo..;
        //c1.setPonta (1.5);
        //c1.setCor("AZUL MARINHO");
        //c1.setCarga(80);
        //c1.setTampado(false);
        //c1.status();

        System.out.println("======== Objeto 2 acessos =========");
        //c2.setModelo("BIC CRISTAL");
        //c2.setPonta(1.15);  //Alterei o valor do atributo atraves o metodo de modificador set
        //c2.ponta = 0.5; | //ERRO! E proibido acessar diretamente o atributo privado!. E boa pratica acessar atraves metodos de acesso
        //c2.setCor("ROXO");
        //c2.setCarga(40);
        //c2.setTampado(true);
        //c2.status();

        System.out.println("======== Objeto 3 acessos =========");
        //c3.setPonta(0.7);
        //c3.setCor("VERMELHA");
        //c3.setTampado(true);
        //c3.setCarga(99);
        //c3.setModelo("COPIC");
        //c3.status();

        //Construtor - Aqui o objeto ja nasce com as pré-definicoes feita no construtor.
        System.out.println("====== Objeto com Construtor.");

        c4.status();
        System.out.println("=====================");
        c5.status();
        System.out.println("=====================");
        c6.status();











































        // AULA 2 POo


        /*
        Carro carro1 = new Carro();




        //Inicialização dos valores dos atributos dos objetos
        c1.modelo = "bic";
        c1.cor   = "preta";
        c1.ponta = 14.07;
        c1.tampado = true; //verdadeira para estar tampada = tampada

        c2.modelo   = "fabercastle";
        c2.cor      = "azul";
        c2.ponta    = 15.3;
        c2.tampado = true; //falsa para estar tampada = destampada

        carro1.ano = 1998;
        carro1.marca = "Ferrari";
        carro1.cor = "Vermelha";
        carro1.modelo = "Sport";
        carro1.ligado = true;

        /*c1.status(); // Chamando o metodo que da status ao objeto.
        c1.pintar();
        c1.destampar();
        c1.pintar(); /*


        System.out.println("Status da caneta: ");
        c2.status();
        c2.pintar();
        c2.destampar();
        c2.pintar();

        System.out.println("");
        System.out.println("Status do carro: ");

        carro1.status();
        carro1.desligar();
        carro1.status();
        carro1.re();
        carro1.ligar();
        carro1.acelerar();
        carro1.desligar();
        carro1.acelerar(); */




    }
}
