package polimorfismo;

public class Main {
    public static void main(String[] args) {


        //Polimorfismo com sobreposição

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave v = new Ave();

        //Mamifero
        m.setPeso(87);
        m.setIdade(27);
        m.setMembros(4);
        m.setCorPelo("Preto");
        m.alimentar();
        m.emitirSom();
        m.locomover();

        System.out.println("");

        //Reptíl
        r.setPeso(7);
        r.setIdade(34);
        r.setMembros(7);
        r.setCorEscama("Verde");
        r.alimentar();
        r.emitirSom();
        r.locomover();

        System.out.println(" ");

        //Peixe
        p.setPeso(5);
        p.setIdade(40);
        p.setMembros(0);
        p.alimentar();
        p.emitirSom();
        p.locomover();
        p.soltarBolha();

        System.out.println(" ");

        //Ave
        v.setMembros(2);
        v.setIdade(10);
        v.setCorPena("Azul");
        v.setPeso(4);
        v.alimentar();
        v.locomover();
        v.emitirSom();
        v.fazerNinho();

        System.out.println(" ");

        //canguru
        Canguro c = new Canguro();
        c.setMembros(4);
        c.setIdade(30);
        c.setPeso(32);
        c.setCorPelo("Bege");
        c.locomover();
        c.usarBolsa();


        System.out.println(" ");

        //Cachorro
        Cachorro dog = new Cachorro();
        dog.setMembros(4);
        dog.setPeso(35);
        dog.setIdade(25);
        dog.setCorPelo("Preto");
        dog.enterrarOsso();
        dog.abanarRabo();
        //metodos de sobrecarga
        dog.reagir("Toma comida");
        dog.reagir("Olá");
        dog.reagir(12, 15);
        dog.reagir(9, 2);
        dog.reagir(29, 25);
        dog.reagir(false);
        dog.reagir(15, 10.0);

        System.out.println("");
        //Cobra
        Cobra cobra = new Cobra();

        cobra.setIdade(40);
        cobra.setMembros(0);
        cobra.setPeso(6);
        cobra.setCorEscama("Verde");
        cobra.locomover();
        cobra.alimentar();
        cobra.emitirSom();

        System.out.println("");

        //Tartaruga
        Tartaruga t = new Tartaruga();

        t.setIdade(200);
        t.setPeso(100);
        t.setMembros(4);
        t.locomover();

        System.out.println("");

        GoldFish g = new GoldFish();

        g.setIdade(10);
        g.setMembros(1);
        g.setCorEscama("Dourado");
        g.soltarBolha();
        g.emitirSom();

        System.out.println("");

        //Ave
        Ave ave = new Ave();
        ave.setIdade(12);
        ave.setMembros(4);
        ave.setPeso(1);
        ave.setCorPena("Vermelha");
        ave.emitirSom();
        ave.fazerNinho();
        ave.alimentar();
        ave.locomover();









    }
}
