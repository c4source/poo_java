package poo.javacore.dominio;

public class Calculadora {


    // METODOS
    public void somarDoisNumeros () {
        System.out.println(10 + 7);
    }

    public void subtrairDoisNumeros (int a, int b) {
        System.out.println(a - b);
    }

    public double divideDoisNumeros (double a, double b) {
        if (b == 0) {
            return 0;  // Se o numero passado do argumento para o parametro for = 0 retorne 0
        }
        return a / b;
    }

        //Exemplo 2 do metodo dividir dois numeros, se for b = 0 return 0 senão divida os dois numeros
    public double divideDoisNumeros02 (double a, double b)  {
        if (b == 0) {
            return 0;  // Se o numero passado do argumento para o parametro for = 0 retorne 0
        } else {
            return a / b; //Senão faça a divisão
        }
    }

        // Uma outra logica de negocio, mas que chega ao mesmo resultado, logica varia de pessoa para pessoa.
    public double divideDoisNumeros03 (double a, double b)  {
        if (b != 0) {
            return a / b;  // Se b for diferente de 0 então divida a / b
        }
            return 0; //Senão retorne zero 0

    }


    public void imprimiDiviDeDoisNumeros (double a, double b)  {
        if (b == 0) {
            System.out.println("Não existe divisão por zero.");
        } else {
            System.out.println(a / b);
    }   }


    public void altereDoisNumeros (int a1, int b2) //As parametros/variaveis aqui são; LOCAL
    {
          a1 = 99; // a1 copia (1) ----> a1 = 99 e passa a valer 99
          b2 = 33; // b2 copia (2) ----> b2 = 33 e passa a valer 33

        //       --- quem mudou foi a copia a original NÃO. AS VARIAVEIS DA MAIN a1 = 1 e b2 = 2 continua intactas.

        System.out.println("Dentro de altereDoisNumeros");
        System.out.println("a1: " + a1);
        System.out.println("a2: " + b2);
    }



}
