package Estruturada;

public class EstruturaRepeticao {

    public static void main(String[] args)
    {

        int cc = 0;

        while (cc <= 400 ) {
            System.out.println("Cambalhadota " + cc);
            cc++;

        }

        // Mudando fluxo do laço com continue.

        int contador = 1;

        while (contador <= 20)
        {
            contador++;

            if (contador ==  6  || (contador == 10) || contador == 15)
            {
                continue;
            }
            System.out.println("Contador " + contador);
        }


    }
}
