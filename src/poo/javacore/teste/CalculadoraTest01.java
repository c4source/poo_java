package poo.javacore.teste;

import poo.javacore.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        // variavel de referencia + .metodo da classe
        calculadora.somarDoisNumeros();

        //                     Passar os argumentos para os parametros.
        calculadora.subtrairDoisNumeros(850, 360);




    }
}
