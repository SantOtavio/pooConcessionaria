public class Automovel {
    static String cor;
    static String placa;
    static String modelo;
    static int ano;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Automovel(String cor, String placa, String modelo, int ano) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }
}
