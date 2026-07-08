package Estruturada;

public class EstruturaRepeticao3 {

    public static void main(String[] args)
    {
        // - Repeticao com VARIAVEL de  CONTROLE.

        for (int i = 1; i <= 3; i++)
        {
            System.out.println(i);
        }

        // - Laços ANINHADOS



        // - Laço de fora = linhas
        // - Laço de dentro = coluna

        for (int k = 0; k <= 5; k++) {

            for (int j = 0; j <= k; j++) {

                System.out.print("# ");

            }
            System.out.println();
        }

    }
}
