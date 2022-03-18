import java.util.ArrayList;

public class Vendas extends Automovel {
    static double valorVenda;

    static ArrayList<Vendas> sellList = new ArrayList<Vendas>();

    public Vendas(String cor, String placa, String modelo, int ano, double valorVenda) {
        super(cor, placa, modelo, ano);
        this.valorVenda = valorVenda;
    }


    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public static void sellAutomobile(String placa, double valor) {

        Vendas sellAuto = new Vendas(cor , placa , modelo , ano , valor);
        sellList.add(sellAuto);
        Carro.removeCar(placa);
        Main.principalMenu();
    }
}
