package Estruturada;

public class VetorExercicios2 {
    public static void main(String[] args)
    {
        int vetor[] = {7, 2, 6, 8, 3};

        float soma = 0;
        float par = 0;
        float impar = 0;


        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i]; // soma cada valor de cada indice do vetor

            if (vetor[i] % 2 == 0) {
                par++; // se o valor for par ele soma + 1 na variavel par

            } else {
                impar++; // senao o valor for impar ele soma +1 na variavel impar
            }


        }
        float media = soma / vetor.length;

        System.out.println("Soma: " + soma);
        System.out.println(media);
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);

        // - Exerc 4
        System.out.println("");
        System.out.println("==========");

        int vetor1[] = {7, 2, 6, 8, 3}; // quantos numeros são maiores que cinco?
        int MaiorCinco = 0; // CONTADOR de maiores numeros

        for (int x = 0; x < vetor1.length; x++)
        {
            if (vetor1[x] > 5 ) {
                MaiorCinco++;
            }
        }

        System.out.println("Numeros maiores que cinco: " + MaiorCinco);






    }
}
