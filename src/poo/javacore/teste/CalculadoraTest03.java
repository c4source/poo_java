package poo.javacore.teste;

import poo.javacore.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args)
    {

        Calculadora calc = new Calculadora();
        Calculadora calc2 = new Calculadora();
        Calculadora calc3 = new Calculadora();
        Calculadora calc4 = new Calculadora();


        int result = (int) calc.divideDoisNumeros(20, 15); // armazenamos o retorno em alguma variavel
                                                                //Podemos fazer cast de double para int

        System.out.println("Resultado com casting: " + result);


        //Retornando diretamente no console de armazenar em uma variavel o retorno do metodo.
        System.out.println(calc.divideDoisNumeros(20,5)); // retornamos o valor diretamente no console

        System.out.println("===========");
        System.out.println("Objeto 2 ");
        double resultado = calc2.divideDoisNumeros02(52, 2);
        System.out.println(resultado);

        System.out.println("============");
        System.out.println("Objeto 3 ");
        double rep = calc3.divideDoisNumeros03(10, 0);
        System.out.println(rep);


        System.out.println("========");
        System.out.println("classe void ");
        //SE FOR VOID não podemos imprimir com o SOUT, mas diretamente dessa maneira:
        calc3.imprimiDiviDeDoisNumeros(10, 0);










    }
}
