package poo.javacore.dominio;

//Implements (nome da interface)
//Classe controleRemoto implementa Controlador
public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Metodo especial construtor.
    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;

    }

    //Setters.
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setVolume(int ligado) {
        this.volume = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Getters

    private boolean getLigado() {
        return ligado;
    }

    private int getVolume() {
        return volume;
    }

    private boolean getTocando() {
        return tocando;
    }

    // Métodos e implementação da logica dos metodos.

    @Override
    public void ligar() {
        this.ligado = true;

    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- Menu ------");
        System.out.println("Está ligado: " + this.getLigado());
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Está tocando: " + this.getTocando());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print('|');

        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o MENU.");
    }


    @Override
    public void maisVolume()
    {
        if (getLigado()) {
            setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume()
    {
        if (getLigado()) {
            setVolume(getVolume() - 5);
        }
    }


    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0)
        {
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0)
        {
            this.setVolume(50);
        }

    }

    @Override
    public void  play() {
        if (getLigado() && !getTocando()) {
            setTocando(true);
        }
    }

    public void pause () {
        if (getLigado() && getTocando()) {
            this.setTocando(false);
        }
    }

}