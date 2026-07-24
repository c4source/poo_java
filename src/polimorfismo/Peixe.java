package polimorfismo;

public class Peixe extends Animal {

    //Atributos
    private String corEscama;

    //Metodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Nandando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }

    //Metodo proprio da classe
    public void soltarBolha() {
        System.out.println("Soltando bolha");
    }

    //Metodos de acesso
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }


}
