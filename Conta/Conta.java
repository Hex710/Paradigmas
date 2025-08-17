
public class Conta {

    private String titulo;
    private int saldo;
    private int limite;

    public String getTitulo() {
        return this.titulo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public int getLimite() {
        return this.limite;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        }
    }

    public void setSaldo(int saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public void setLimite(int limite) {
        if (limite <= this.saldo) {
            this.limite = limite;
        }
    }

    public void deposito(int amount) {
        if (amount >= 0) {
            this.saldo = this.saldo + amount;
        }
    }

    public void saque(int amount) {
        if ((amount >= 0) && (amount <= this.saldo) && (amount <= this.limite)) {
            this.saldo = this.saldo + amount;
        }
    }
}
