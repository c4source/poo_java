package Estruturada;

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {

        //Operador Ternário

        int n1, n2, r;
        n1 = 9;
        n2 = 10;
        r = (n1>n2)?0:1; // 0 false - 1 true
        System.out.println(r);

        // comparação string

        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res);

        // Operador lógico
        // && e, || ou
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;

        boolean resp;


        resp = (x < y || y == z)? true:false;
        System.out.println(resp);
    // ==========================================================
        // exercicio
        Scanner keyboard =  new Scanner (System.in);

        //input
        System.out.printf("Digite o ano de nascimento:  ");
        int year = keyboard.nextInt();

        //calculo
        int age = 2026 - year;

        //condicionando com operador logico
        String re = (age>= 18)? "Maior de idade":"Menor de idade";

        //output da resposta da condição
        System.out.println(re);

        //output do ano e da idade
        System.out.println("Ano: " + year);
        System.out.println("Idade: " + age);


        System.out.println("=================================");

        // exercicio 2

        //input
        System.out.printf("Digite o ano de nascimento para saber se vc vota: ")        ;
        int ano = keyboard.nextInt();

        //calc
        int idade = 2026 - ano;

        //verificar condicional com && e ||
        String respostinha = ((idade >= 16 && idade < 18)) || (idade > 70)? "Voto opcional":"Voto obrigatório";

        //output da condição, ano e idade.
        System.out.println(respostinha);

        System.out.println("Ano: " + ano);
        System.out.println("Idade: " + idade);











    }
}
