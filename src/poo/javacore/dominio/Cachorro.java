package poo.javacore.dominio;

public class Cachorro implements Animal {

    private String nome;
    private String cor;

    public Cachorro(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCor(){
        return this.cor;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }

    public void pular(){
        System.out.println("Pulo longo");

    }

    public void ataque() {
        System.out.println("Mordendo*");
    }

}
