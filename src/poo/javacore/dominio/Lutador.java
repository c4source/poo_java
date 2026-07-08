package poo.javacore.dominio;

public class Lutador {

    //Atributos
    private String nome;
    private String nascionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Construtor.
    public Lutador (String nome, String nascionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates )
    {
        this.nome   = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;


    }

    //Métodos especiais - Getters.
    public String getNascionalidade() {
        return nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public int getVitorias() {
        return vitorias;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    //Métodos especiais - Setters.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
       } else if (this.peso <= 70.) {
            this.categoria = "Peso leve";
        }
        else if (this.peso <= 83.3) {
            this.categoria = "Peso média";
        }
        else if (this.peso <= 120.2) {
            this.categoria = "Peso pesado";
        }
        else {
            this.categoria = "Inválido";
        }

    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    //Métodos

    public void apresentar() {
        System.out.println("============= Aprensetação do lutador ===========");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Origem: " + this.getNascionalidade());
        System.out.println(getIdade() + " anos" );
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou:  " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());


    }

    public void status() {
        System.out.println(getNome());
        System.out.println("É um peso: " + this.getCategoria());
        System.out.println(getVitorias() + "Vitorias");
        System.out.println(getDerrotas() + "Derrotas");
        System.out.println(getEmpates() + " Empates");


    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }




}
