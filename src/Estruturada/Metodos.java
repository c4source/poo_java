package Estruturada;



 class Metodos {


    // para criar o metodo (função) e preciso estar fora da main.
    // precisa ser static igual a main
    // na main chamamos a função com seus paramentros.

    static void soma(int a, int b)
    {
        int s = a + b;
        System.out.println("A soma de é s: " + s);
    }

    static int soma1(int x, int z) { // como retorna valor precisamos por static int na função
        int sm = x + z;
        return sm;
    }

    static void mensagem (String nome) {
        System.out.println("Olá " + nome + " Seja bem vindo! ");

    }

    static void linha () {
        for (int i = 1; i <= 5; i++) {
                System.out.println("=================");

        }
        System.out.println("");
    }

    static int devolver () {
        int retornar = 10;
        return retornar;
    }

    static void saudar (String name) {
        System.out.println("Olá, " + name);
    }

    static int somar2 (int a, int b ) {
        int resultado = a + b; // Se eu for precisar fazer mais coisas antes de mostrar o resultado, cria-se uma variavel
        return resultado;
    }

    //Sempre coloque o tipo da variavel antes do nome do metodo. ex; static boolean MaiorIdade()
    static boolean MaiorDeIdade (int idade){

        if (idade >= 18) {
            return true;
        }
        else {
            return false;
        }

    }

    // =====================================================================================================================
    // Pergunte o que vai entrar e o que vai sair; entrada de um numero para verificar se eh par ou impar
    // Dentro do metodo passe como int. Veja a saída, se for texto use String antes do nome do metodo ex; String parImpar()
    // Para utilizar operadores aritmeticos a variavel precisa ser int, float, double e etc. String NÃO FAZ!

    static String parImpar(int number ) {
        if (number % 2 == 0 ) {
            return "par ";

        }
        else {
            return "impar ";
        }
    }

    //
    static double calculadora (double g, double p, String operacao) {
        switch (operacao)
        {

            case "soma":
                return g + p;

            case "subtracao":
                return g - p;

            case "multiplicacao":
                return g * p;

            case "divisao":
                return g / p;

            default:
                return 0;

        }
    }

    static double quadrado (double numbero) {

        return Math.pow(numbero, 2); // Aqui o retorno ja mostra diretamente, sem variavel dentro do metodo.
    }


    public static void main(String[] args)
    {
        soma(5,2); //Chamando a função com os parametros

        int resposta = soma1(5,2);
        System.out.println("Segunda soma: " + resposta);


        System.out.println("Vai começar a contagem");
        System.out.println(Operacoes.contador(1, 5));


        System.out.println("Soma com classe private: " + Operacoes.soma3(1, 5)); // erro por que está privado.

        String nome = "Gabriel";
        mensagem(nome);

        linha();

        int valor = devolver();
        System.out.println(valor);

        saudar("Pamela");

       int result =  somar2(10, 30);
       System.out.println(result);


       boolean resultads = MaiorDeIdade(20);
       System.out.println(resultads);

       String ls = parImpar(257);
       System.out.println(ls);


       System.out.println(calculadora(5, 5, "divisao"));

        System.out.println(quadrado(5));

    }
}
