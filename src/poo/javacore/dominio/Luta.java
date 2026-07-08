package poo.javacore.dominio;

public class Luta {

    private Lutador desafiado;  // Aqui estamos dizendo: Uma LUTA possui um objeto do tipo lutador.
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos especiais

    public void setDesafiado (String desafiado) {
        this.desafiado = desafiado;
    }

    public String getDesafiado () {
        return this.desafiado;
    }

    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    public String getDesafiante() {
        return this.desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }

    // Métodos da classe:

    public void marcarLuta() {

    }

    public void lutar() {

    }


}
