package poo.javacore.teste;

import poo.javacore.dominio.Estudante;
import poo.javacore.dominio.Carro;
import poo.javacore.dominio.ContaBancaria;
import poo.javacore.dominio.Livro;

public class PessoaTeste01 {
    public static void main(String[] args) {

        //Estanciamento do objeto - estrutura; classe, variavel, Instancia

        // Tipo     Referencia    Objeto
        Estudante   estudante   = new Estudante();
        Estudante   estudante2 = new Estudante();

        //Passe o valor pela variavel de referencia.atributo da classe Estudante.
        estudante.nome = "Gabriel";
        estudante.sexo = "M";
        estudante.idade = 27;

        // segundo objeto da classe Estudante;
        estudante2.nome = "Isabela";
        estudante2.sexo = "F";
        estudante2.idade = 27;


        // Instanciamento de um novo objeto da classe Carro
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        // atribuindo valores aos atributos do objeto --- INICIALIZAR OS VALORES DOS OBJETOS

        carro.marca = "Ferrari";
        carro.modelo = "Puro sangue";
        carro.ano  = 2026;
        System.out.println("\n");
        carro2.marca = "Ferrari";
        carro2.modelo = "SUV";
        carro2.ano = 2025;

        carro = carro2; // Variavel de referencia carro aponta para variavel de referencia carro2. Imprimindo os msm valores

        // Instanciamento de um objeto da classe Livro
        Livro livro = new Livro();
        Livro livro2 = new Livro();

        //Passar os valores para os atributos da classe livro

        livro.titulo = "A divina comédia";
        livro.autor = "Danto Alighieri";
        livro.paginas = 351;

        //objeto 2 da classe Livro.
        livro2.titulo = "O silmarillion";
        livro2.autor = "Tolkien";
        livro2.paginas = 400;

        // Instanciamento do obejto da classe ContaBancaria
        ContaBancaria contabancaria = new ContaBancaria();
        ContaBancaria contabancaria2 = new ContaBancaria();
        // Passando valores pros atributos da classe atraves do objeto

        contabancaria.titular     =  "Gabriel Henrique";
        contabancaria.saldo       =  100000;
        contabancaria.numeroConta = 1;

        contabancaria2.titular      = "Osvaldo Domingues";
        contabancaria2.saldo        = 700000;
        contabancaria2.numeroConta  = 2;


        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);

        System.out.println("");
        System.out.println("-------------");

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

        System.out.println("");
        System.out.println("-------------");

        System.out.println(livro.titulo);
        System.out.println(livro.autor);
        System.out.println(livro.paginas);

        System.out.println("");
        System.out.println("-------------");

        System.out.println(livro2.titulo);
        System.out.println(livro2.autor);
        System.out.println(livro2.paginas);

        System.out.println("");
        System.out.println("-------------");

        System.out.println(contabancaria.titular);
        System.out.println(contabancaria.saldo);
        System.out.println(contabancaria.numeroConta);
        System.out.println("");
        System.out.println(contabancaria2.titular);
        System.out.println(contabancaria2.saldo);
        System.out.println(contabancaria2.numeroConta);




    }
}
