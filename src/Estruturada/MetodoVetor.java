package Estruturada;

public class MetodoVetor {



        static public int MaiorNumeroVetor(int vet[]) {
           int MaiorNum = vet[0];

            for (int i = 0; i < vet.length; i++) {
                if (vet[i] > MaiorNum) {
                    MaiorNum = vet[i];
                }

            }
            return MaiorNum;
        }




}
