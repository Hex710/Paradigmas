
public class Endereco {

    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.setRua(rua);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
    }

    public void setRua(String rua) {
        if (rua != null) {
            this.rua = rua;
        }
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public void setBairro(String bairro) {
        if (bairro != null) {
            this.bairro = bairro;
        }
    }

    public void setCidade(String cidade) {
        if (cidade != null) {
            this.cidade = cidade;
        }
    }

    public void setEstado(String estado) {
        if (estado != null) {
            this.estado = estado;
        }
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEstado() {
        return this.estado;
    }
}
