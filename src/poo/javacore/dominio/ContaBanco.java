package poo.javacore.dominio;

public class ContaBanco {

    private int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status; // Se verdadeiro; true conta está aberto, se falso conta está fechada


    //Construtor:
    public ContaBanco () {
        this.setSaldo(0);
        this.setStatus(false);

    }


    //Métodos da classe ContaBanco.

    //METODO ABRIR CONTA, 2 PRÉ REQUISITOS; Saber tipo da conta (cc ou cp)
    public void abrirConta(String tipo) {
           this.setTipo(tipo);
           this.setStatus(true);  //Use o this para referenciar o atributo

            if (tipo.equals("cc")){
                this.setSaldo(50);
            }
            else if (tipo.equals("cp")) {
               this.setSaldo(150);   // Use this para referenciar o atributo que vc quer
        }
        System.out.println("Conta criada com sucesso!");
    }

    // para fechar conta ela nao pode ter dinheiro em conta e nem estar negativo.
    public void fecharConta () {

            if (this.getSaldo() > 0) {
                System.out.println("ERRO!Operação inválida. Saldo em conta");
            }
            else if(this.getSaldo() < 0) {
                System.out.println("ERRO! Operação inválida. Saldo negativo!" );
            }
            else {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso");
            }


    }

    //Para depositar verificamos se a conta tem status true
    public void depositar(double s) {

        if (this.getStatus())  {

            //Jeito correto de accesso o saldo
            //this.saldo = saldo + s;
            this.setSaldo(this.getSaldo() + s);  //setSaldo metodo de alterar valor -> getSaldo recebe ele mesmo mais o valor deposito
            System.out.println("Deposito relizado com sucesso na conta de " + this.getDono());


        }
        else {
            System.out.println("Conta fechada! Impossível.");

        }


    }

    public void pagarMensal() {
        //Inicialize sempre a variavel local com algum valor, zero por exemplo .
        double var = 0;

        if (getTipo().equals("cc")) {
            var = 12.00;

        } else if (getTipo().equals("cp")) {
            var = 20.00;

        }

        if (!getStatus()) {
            System.out.println("ERRO! transação impossivel! Conta fechada.");
        } else if (getSaldo() < var) {
            System.out.println("ERRO! Saldo indisponível." );
        }
        else {
            setSaldo(getSaldo() - var);
            System.out.println("Mensaldidade paga com sucesso!");
        }


    }


    // precisa ter dinheiro e status ativo.
    public void sacar (double s ) {
         if (!this.getStatus()) {
             System.out.println("Conta FECHADA! Impossivel realizar está operação!");
         } else if (getSaldo() < s) {
             System.out.println("Saldo insuficiente! Impossível realizar está operação!");

         }
         else  {
             setSaldo(getSaldo() - s);
             System.out.println("Saque realizadocom sucesso!");
         }
    }


    //Metodos de acesso getters
    public int getNumConta() {
            return this.numConta;
    }

    public String getTipo() {
            return this.tipo;
    }

    public String getDono() {
            return this.dono;
    }

    public double getSaldo() {
            return this.saldo;
    }

    public boolean getStatus () {
        return this.status;

    }

    // Metodos de acessos setters.

    public void setNumConta (int n) {
            this.numConta = n;
    }

    public void setTipo (String tipo) {
            this.tipo = tipo;
    }

    public void setDono (String dono) {
        this.dono = dono;

    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    public void setStatus (boolean status) {
        this.status = status;
    }

    public void estadoAtual () {
        System.out.println("----------------------------------");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());

    }


}
