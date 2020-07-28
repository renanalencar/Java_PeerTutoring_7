/**
 * Carro
 */
public class Carro {
    private String placa;
    private String modelo;
    private String ano;
    private String proprietario;

    public Carro(String placa, String modelo, String ano, String proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
}