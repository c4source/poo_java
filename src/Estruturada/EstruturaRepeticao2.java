package Estruturada;

import java.util.Scanner;

public class EstruturaRepeticao2 {
    public static void main(String[] args)
    {


        //Estrutura de repeticao com do e while
       /* int cont = 0;

        do
        {
            System.out.println(cont);
            cont++;
        }
        while (cont < 4); */

        System.out.println("=========================");

        Scanner teclado = new Scanner (System.in);

        int n;
        int s = 0;
        String resp;

        //DO (FAÇA)
        do {
            System.out.printf("Digite um numero para somar: ");
            n = teclado.nextInt();
            s += n; //CALCULO
            System.out.print("Quer continuar S/N?: ");
            resp = teclado.next(); //USE O .next no Scanner para limpar buffer da memória.
        }
        //WHILE (ENQUANTO RESPOSTA FOR IGUAL '' S'' )
        while (resp.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);



    }
}
