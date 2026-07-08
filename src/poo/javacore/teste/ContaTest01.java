package poo.javacore.teste;

import poo.javacore.dominio.ContaBanco;

public class ContaTest01 {
    public static void main(String[] args)
    {
        //instanciamento
        //Popular os atributos dos objetos atraves de metodos.
        ContaBanco conta1 = new ContaBanco();
            conta1.setNumConta(1);
            conta1.setDono("Oslvado domingues");
            conta1.abrirConta("cc");




        ContaBanco conta2 = new ContaBanco();
            conta2.setNumConta(2);
            conta2.setDono("Gabriel Henrique");
            conta2.abrirConta("cp");


            conta1.depositar(100);
            conta2.depositar(500);
            conta2.sacar(100);

            conta1.estadoAtual();
            conta2.estadoAtual();





    }
}
