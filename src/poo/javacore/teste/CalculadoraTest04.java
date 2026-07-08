package poo.javacore.teste;

import poo.javacore.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        //Variaveis na main
        int a1 = 1;
        int b2 = 2;
        System.out.println("Na main");
        System.out.println("A1: " + a1);
        System.out.println("A2: " + b2);
        System.out.println("");
        System.out.println("========");
        calculadora.altereDoisNumeros(a1, b2);


    }
}
