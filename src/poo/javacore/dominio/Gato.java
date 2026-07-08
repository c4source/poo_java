package poo.javacore.dominio;

public class Gato implements Animal {

    //Atributos.
    private String nome;
    private String tipo;
    private String cor;
    private double altura;
    private int vida;
    private boolean vivo;

    //Construtor
    public Gato() {
        this.vida = 100;
        this.vivo = true;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau miau ");
    }

    @Override
    public void pular() {
        System.out.println("Pulo silêncioso");
    }

    @Override
    public void ataque() {
        System.out.println("Arranhar");
    }



    //Métodos especiais.
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor (){
       return this.cor;
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setAltura (double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setVida(int vida){
        this.altura = vida;
    }

    public int getVida() {
        return this.vida;

    }

    public void setVivo (Boolean vivo) {
        this.vivo = vivo;
    }

    public boolean getVivo() {
        return this.vivo;
    }

    public void status () {
        System.out.println("===== Gato =====");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("tipo: " + this.tipo);
        System.out.println("Altura: " + this.altura);
        System.out.println("Vida: " + this.vida);
        System.out.println("Vivo ou morto: " + this.vivo);
    }





}
