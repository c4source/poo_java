package Estruturada;

import java.util.Scanner;


public class PrimeiroPrograma {
    public static void main(String[] args) {


        /* int idade = 3;
        float sal = 5.000f;
        char letra = 'g';
        boolean casado = true;

        //typecast
        float idade = (float) 2.232;
        int age = (int) 3;
        char letra = (char) 'g';
        boolean casado = (boolean) true;
        */

        //Integer sal = new Integer(3);
           //Float sal = new Float(2.323);
        //Char letra = new Char('g');

        // Tipos primitivos.

        //sout

        /*
         String nome = "gabriel";
         * float nota = 4.2f;
         * System.out.format("A nota de %s é %.4f \n", nome, nota);
        */


        //input
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua nota: ");
        float nota = teclado.nextFloat();

        System.out.print("Digite uma nota com número inteiro: ");
        int nota2 = teclado.nextInt();

        System.out.format("A nota de %s é %.1f e também é %d ", nome, nota, nota2);


        /* em printf, printformat
        int: %d
        float: %.2f
        string: %s
        */



    }
}