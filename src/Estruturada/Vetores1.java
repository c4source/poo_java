package Estruturada;

import java.util.Arrays;

public class Vetores1 {
    public static void main(String[] args)
    {
        /* Vetores em algoritmos
        int n[] = new int [4];

        n[0] = 15;
        n[1] = 3;
        n[2] = 24;
        n[3] = 11;

        System.out.println(n);
        */

        // - declarar um vetor e imprimir seus valores com FOR,

        int e[] = {12, 11, 3, 4, 15, 24, 10000};
        System.out.println("O total de casas de E é: " + e.length);

        for (int i = 0; i < e.length; i++) // Nem sempre sabemos o tamanho do vetor, por isso .length o java sabe automaticamente
        {

        System.out.println("Na posição " + i + " temos o valor:  " + e[i]);

        }

        System.out.println("===============================");

        // - Ex:

        String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "sep", "out", "nov", "dez"};
        int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        // - para imprimir os valores dos indices do vetor fazemos mes[i], para mostrar o indice i 
        for (int i = 0; i < mes.length; i++)
        {
            System.out.println("O mes de "+ mes[i] + " tem " + dia[i]+ " dias" );
        }


        System.out.println("===============================");


        // - vetor 3 ano bissexto

        int ano[] = {2020, 2021, 2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030};

        for (int k = 0; k < ano.length; k++) {
            if (( ano[k] % 4 == 0 && ano[k] % 100 != 0) || ano[k] % 400 == 0) {
                System.out.println("O ano " + ano[k] + " é bissexto");
            } else {
                System.out.println("O ano " + ano[k] + " Não é bissexto");
            }

        }

        System.out.println("===============================");

        // For para printar o vetor de outra maneira

       int vetor[] = {2020, 2021, 2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030};


        for (int c = 0;  c < vetor.length;  c++) {
            if ((vetor[c] % 4 == 0 && vetor[c] % 100 != 0) || vetor[c] % 400 == 0)
            {
                System.out.println("O ano " + vetor[c] + " é bissexto ");
            }
            else
            {
                System.out.println("O ano " + vetor[c] + " Não é bissexto");
            }
        }

        // vetor for it, para cada elemento especifico em vetor.

        System.out.println("===============================");

        int num[] = {1, 2, 3, 4, 5, 6};
        for (int valor: num) {
            System.out.println(valor);
        }

        double x[] = {-1, 2,5, 25,5, -3,5, -7,2};
        for (double z: x) {
            System.out.print(z + " ");
        }


        //- Colocando os valores de um vetor em ordem, classe Arrays.sort e for it.
        double ordem[] = {6, 26, 22, 13, 4, 7 };
        Arrays.sort(ordem); // Arrays é uma classe que na biblioteca do JAVA, ORDENAR Array
        for (double zx: ordem) {
            System.out.println(zx + " ");
        }

        //- Busca de um valor em um vetor.

        int busca[] = {12, 13, 234, 532542, 423, 231, 1, 2, 43, 64, 213, 523, 1231,  563,};

        //Percorrer o vetor
        for (int g: busca) {
            System.out.print(g + " ");
        }

        //pularlinha
        System.out.println("");

        //Ordenar o vetor, é um metodo
        Arrays.sort(busca);

        //buscar no vetor
        int posicao = Arrays.binarySearch(busca, 423);

        //Mostrar a posicao do valor
        System.out.println("Encontrei o valor na posicao " + posicao);

        System.out.println("==============================");

        //- Preenchendo vetor

        int numbers[] =  new int[8];

        // Vai preencher todas as posições com o valor da key: 7
        Arrays.fill(numbers, 7);

        for (int xx: numbers) {
            System.out.print(xx);
        }
        System.out.println("");

        System.out.println("================================");


        int bag[] = {7, 2, 18, 20, 3,};
        int maior = bag[2];

        for (int cont = 0; cont < bag.length; cont++) {
            if (bag[cont] > maior ) {
                maior = bag[cont];
            }

        }
        System.out.println("O maior numero do vetor é: " + maior);
        System.out.println("");
        System.out.println("=================================");

        int y[] = {15, 8, 22, 3, 17, 9};
        int p = y[0];

        for (int j = 0; j < y.length; j++) {
            if (y[j] < p) {
                p = y[j];
            }
        }

        System.out.println(" O menor valor é: " + p);






    }
}
