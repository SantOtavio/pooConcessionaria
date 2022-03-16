import java.util.ArrayList;

public class Carro extends  Automovel{

    public static ArrayList<Carro> listCars = new ArrayList<Carro>();

    int cavaloPontencia, qtdPortas;
    boolean estepe;

    public int getCavaloPontencia() {
        return cavaloPontencia;
    }

    public void setCavaloPontencia(int cavaloPontencia) {
        this.cavaloPontencia = cavaloPontencia;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public boolean isEstepe() {
        return estepe;
    }

    public void setEstepe(boolean estepe) {
        this.estepe = estepe;
    }

    public Carro(String cor, String placa, String modelo, int ano, int cavaloPontencia, int qtdPortas, boolean estepe) {
        super(cor, placa, modelo, ano);
        this.cavaloPontencia = cavaloPontencia;
        this.qtdPortas = qtdPortas;
        this.estepe = estepe;
    }

    public static void registerCAR(String cor, String placa, String modelo, int ano, int cavaloPontencia, int qtdPortas, boolean estepe) {
        Carro cTemp = new Carro(cor , placa , modelo , ano , cavaloPontencia, qtdPortas, estepe);
        listCars.add(cTemp);
        Main.principalMenu();
    }
}
