import java.util.ArrayList;

public class Moto extends Automovel{
    public static ArrayList<Moto> listMotorcycles = new ArrayList<Moto>();

    boolean bagageiro;
    int cilindrada , capacidadeTanque;

    public static ArrayList<Moto> getListMotorcycles() {
        return listMotorcycles;
    }

    public static void setListMotorcycles(ArrayList<Moto> listMotorcycles) {
        Moto.listMotorcycles = listMotorcycles;
    }



    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Moto(String cor, String placa, String modelo, int ano, boolean bagageiro, int cilindrada, int capacidadeTanque) {
        super(cor, placa, modelo, ano);
        this.bagageiro = bagageiro;
        this.cilindrada = cilindrada;
        this.capacidadeTanque = capacidadeTanque;
    }

    public static void registerMotorcycle(String cor, String placa, String modelo, int ano, boolean bagageiro, int cilindrada, int capacidadeTanque) {
        Moto mTemp = new Moto(cor , placa , modelo , ano , bagageiro , cilindrada , capacidadeTanque);
        listMotorcycles.add(mTemp);
        Main.principalMenu();
    }
}
