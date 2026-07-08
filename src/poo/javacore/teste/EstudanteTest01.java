package poo.javacore.teste;

import poo.javacore.dominio.Estudante;
import poo.javacore.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args)
    {
        //instanciamente
    Estudante estudante = new Estudante();
    Estudante estudante2 = new Estudante();
    ImpressoraEstudante impressora = new ImpressoraEstudante();

    //Inicialização
    estudante.nome = "Dante";
    estudante.idade = 15;
    estudante.sexo = "M";

    estudante2.nome = "Virgilio";
    estudante2.idade = 67;
    estudante2.sexo = "M";


    /*//Mostrando os valores dos objetos
    System.out.println(estudante.nome);
    System.out.println(estudante.idade);
    System.out.println(estudante.sexo);

    System.out.println("=========================");
    //Segundo objeto
    System.out.println(estudante2.nome);
    System.out.println(estudante2.idade);
    System.out.println(estudante2.sexo);
    */


    //Mostrando os valores com variavel de referencia/parametro dentro do metodo imprime.
    System.out.println("Com metodo impressora");
    impressora.imprime(estudante);
    //A variavel/referencia local (dentro do metodo como parametro estudante, morre pq é local)
    // Na linha 42 ela é criada novamente e aponta para o objeto estudant02.
    impressora.imprime(estudante2);





    }
}
