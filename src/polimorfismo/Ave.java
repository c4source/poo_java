package polimorfismo;

public class Ave extends Animal {

    //Atributos
    private String corPena;

    //Metodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ração de passarinho");
    }

    @Override
    public void emitirSom(){
        System.out.println("Cantando");
    }

    //Metodos proprios
    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }

    //Metodos de acesso

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
