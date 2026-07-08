package poo.javacore.dominio;

public class Caneta {

    //Atributos
    public String modelo;
    private double ponta;
    public String cor;
    private boolean tampado;
    public int carga;


    //Construtor: define que todos os objetos criados tenham atributos pre definidos na sua construção, nascendo o objeto com valores especificados
    public Caneta(String modelo, String cor, double ponta, int carga, boolean tampado) {


        // Forma simples, sem parametro de construir o construtor:

            /*this.tampado = false;
            this.modelo = "BIC";
            this.cor = "AZUL";
            this.ponta = 0.12;
            this.carga = 110;*/

        // Forma com parametro:

            this.setModelo(modelo); // Passe o parametro na cahamada do metodoModelo
            this.setCor(cor);
            this.setPonta(ponta);
            this.setCarga(carga);
            this.setTampado(tampado);



    }


    //this. referencia o atributo da classe
    public void status ()
    {
        System.out.println("Cor da caneta: " + this.getCor());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Esta tampada? " + this.getTampado());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " +this.getCarga());   //Retornamos uma informação com o GET.

    }

    //GET RETORNA UM VALOR, POR ISSO RETURN.
    public String getModelo () {
        return this.modelo;
    }
    public double getPonta () {
        return this.ponta;
    }

    public String getCor() {
        return this.cor;
    }

    public int getCarga () {
        return this.carga;
    }

    public boolean getTampado () {
        return this.tampado;
    }

    //SET ALTERA UM VALOR, POR ISSO VOID.
    public void setModelo (String m) {
        this.modelo = m;
    }

    public void setPonta (double p) {
        this.ponta = p;
    }

    public void setCor (String cor){
        this.cor = cor;
    }

    public void setCarga (int carga) {
        this.carga = carga;
    }

    public void setTampado (Boolean tampada) {
        this.tampado = tampada;
    }

     public void pintar () {
        if (this.tampado == true) {
            System.out.println("ERRO!. caneta fechada! não pode pintar");

        }
        else
        {
            System.out.println("Pintando*");
        }
    }

    public void rabiscar () {
        if (this.tampado == true) {
            System.out.println("ERRO!. caneta fechada! não pode rabiscar");

        }
        else
        {
            System.out.println("Rabiscando...*");
        }
    }


    public void destampar() {
       this.tampado = false;
        System.out.println("Destampado com sucesso");
    }

    public void tampar(){
        this.tampado = true;
        System.out.println("Caneta tampada.");
    }
}
