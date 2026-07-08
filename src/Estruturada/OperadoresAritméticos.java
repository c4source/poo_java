package Estruturada;

public class OperadoresAritméticos {
    public static void main(String[] args)
    {


    /*float n1 = 5;
    float n2 = 3;

    float media = (n1 + n2) / 2;
    System.out.println("A media do aluno é:  " + media);*/

        // Operador Unários
        //   --/ ++ Encrementa um numero quando  operador vai na frente
        // 5++ = 6


            //ex:
            int numero = 5;
            numero++;
            System.out.println(numero);

            float nota1 = 10;
            nota1--;
            System.out.println(nota1);

            //Ex
            int num = 10;
            int valor = 4 + num--;
            System.out.println(valor);
            System.out.println(num);

            //------
            int x = 4;
            x += 2;
            System.out.println(x);

            int y = 10;
            y *= 2;
            System.out.println(y);

            // operadores matematicoS
            float n = 8.4f;
            System.out.println(Math.round(n)); //arredonda numero para cima
            System.out.println(Math.sqrt(5));

            double ale = Math.random();
            int numb = (int) (5 + ale * (10-5)); //numeros random entre 10 e 5)
            System.out.println(numb);

            //-------











    }
}
