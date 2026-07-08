package Estruturada;

public class VetorExercicios {
    public static void main(String[] args)
    {

        int vetor[] = {7, 2, 6, 8, 3,};
        int maior = vetor[0];
        int posicao = 0;

       for (int i = 0; i < vetor.length; i++)
       {
           if (vetor[i] > maior)
           {

               maior = vetor[i];
               posicao = i;

           }
       }

       for (int k = 0; k < vetor.length; k++) {
           System.out.print( vetor[k] + " ");
       }
        System.out.println("");
        System.out.println("O maior valor do vetor: " + maior);
        System.out.println("A posicão: " + posicao);

        // exerc 2
        System.out.println("");
        System.out.println("=====================");

        int numeros[] = {7, 2, 6, 8, 3};
        int menor = numeros[0];
        int posicaoo = 0;

        for (int x = 0; x < numeros.length; x++)
        {
            if (numeros[x] < menor) {
                menor = numeros[x];
                posicaoo = x;
        }

        }
        System.out.println("");
        System.out.println("O menor valor é: " + menor);
        System.out.println("Posicao: " + posicaoo);


        System.out.println("");
        System.out.println("======================");

        // exerc 3 encontrar maior e menor valor do vetor em um unico for

        int vet[] = {7, 2, 6, 8, 3 };
        int menor1 = vet[0];
        int maior2 = vet[0];
        int posicaoMenor = 0;
        int posicaoMaior = 0;

        for (int j = 0; j < vet.length; j++) {
            if (vet[j] > maior2 ) {
                maior2 = vet[j];
                posicaoMaior = j;
            } else if (vet[j] < menor1) {
                menor1 = vet[j];
                posicaoMenor = j;
            }
        }

        System.out.println("O maior valor é: " + maior2);
        System.out.println("A posicação é: " + posicaoMaior);
        System.out.println("O menor valor é: " + menor1);
        System.out.println("A posição do menor valor é: " + posicaoMenor);







    }
}
