package Estruturada;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args)

    {

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Digite a primeira nota: ");
    float n1 = teclado.nextFloat();

    System.out.printf("Digite a segunda nota: ");
    float n2 = teclado.nextFloat();

    float media = (n1 + n2) / 2;

    System.out.println("A média é: " + media);

    if (media > 7)
    {
        System.out.println("Parabens");

    }


    System.out.println("=============================");

    //exerc 2
    System.out.print("Digite ano de nascimento ");
    int ano = teclado.nextInt();

    int rep = 2026 - ano;

    System.out.println("idade: "+ rep);

    //Condicional, praticamente igual ao do C#
    if (rep >= 18)
    {
        System.out.println("Maior de idade");
    }
    else
    {
        System.out.println("Menor de idade");
    }


    System.out.println("=============================");

    //Exerc 3



        System.out.print("Digite um numero: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0 ) {
            System.out.println("NUMERO PAR");
        }
        else {
            System.out.println("NUMERO IMPAR");
        }

        // Exerc 4
        System.out.println("=============================");

        //Composta Encadeada  --  (else if)
        System.out.printf("Digite ano de nascimento para ver se você vota: ");
        int age = teclado.nextInt();

        int i = 2026 - age;

        if (i < 16)
        {
            System.out.printf("Não vota");

        } else if ((i >= 16 && i < 18 ) || (i > 70)) {
            System.out.println("Opcional");
        } else {
            System.out.println("Obrigatorio");
        }

        //Condicao de multipla escolha  --- (switch case,break)
        System.out.println("=============================");
        System.out.printf("Quantas perna tem o animal?: ");
        int pernas = teclado.nextInt();
        String tipo;

        System.out.printf("Isso é um(a): ");
        switch (pernas)
        {
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);








    }



}
