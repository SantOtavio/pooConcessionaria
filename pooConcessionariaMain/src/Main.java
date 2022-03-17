import javax.swing.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int infinito = 0;
        do {
            principalMenu();
        } while (infinito != 1);
    }

    static int inputChoose(){
        return sc.nextInt();
    };

    static void principalMenu() {
        int choose;

            System.out.println("+++++MENU CONCESSIONÁRIA+++++" +
                    "\n1 - Cadastrar Automóvel" +
                    "\n2 - Listar Automóveis" +
                    "\n3 - Editar" +
                    "\n4 - Remover");
         choose = Integer.parseInt(JOptionPane.showInputDialog(null , "cadastra ai fdp"));


            switch (choose) {
                case 1:
                    menuRegister();
                    break;
                case 2:
                    listAutomobile();
                    break;
                case 3:
                    break;
                case 4:
                    removeAutomobile();
                    break;
            }
    }

    private static void removeAutomobile() {
        System.out.println("+++++MENU REMOVER+++++" +
                "\n1 - Remover Carro" +
                "\n2 - Remover Moto");
        int choose = sc.nextInt();

        switch (choose){
            case 1:
                removeCar();
                break;
            case 2:
                removeMotorcycle();
                break;
        }
    }

    private static void removeMotorcycle() {
    }

    private static void removeCar() {
        System.out.println("Insira a placa do carro: ");
        String placa = sc.next();

        Carro.removeCar(placa);
    }

    private static void listAutomobile() {
        for (int i = 0; i < Moto.listMotorcycles.size(); i++){
            System.out.println("Modelo: " + Moto.listMotorcycles.get(i).getModelo());
            System.out.println("Placa: " + Moto.listMotorcycles.get(i).getPlaca());
            System.out.println("Cor: " + Moto.listMotorcycles.get(i).getCor());
            System.out.println("Ano: " + Moto.listMotorcycles.get(i).getAno());
        }
        for (int n = 0; n < Carro.listCars.size(); n++){
            System.out.println("Modelo: " + Carro.listCars.get(n).getModelo());
            System.out.println("Placa: " + Carro.listCars.get(n).getPlaca());
            System.out.println("Cor: " + Carro.listCars.get(n).getCor());
            System.out.println("Ano: " + Carro.listCars.get(n).getAno());
        }
        principalMenu();
    }

    private static void menuRegister() {
        System.out.println("+++++MENU REGISTRO+++++" +
                "\n1 - Registrar Carro" +
                "\n2 - Registrar Moto");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
            case 2:
                registerAutomobile(choose);
                break;
        }
    }

    private static void registerAutomobile(int choose) {
        String cor, placa, modelo;
        int ano;

        System.out.println("Insira a cor do automóvel");
        cor = sc.next();

        System.out.println("Insira a placa do automóvel");
        placa = sc.next();

        System.out.println("Insira o modelo do automóvel");
        modelo = sc.next();

        System.out.println("Insira o ano do automóvel");
        ano = sc.nextInt();

        if (choose == 1) {
            choose = 0;
            registerCar(cor, placa, modelo, ano);
        } else {
            choose = 0;
            registerMotorcycle(cor, placa, modelo, ano);
        }

    }


    private static void registerMotorcycle(String cor, String placa, String modelo, int ano) {

        System.out.println("A moto possui bagageiro?");
        boolean bagageiro = sc.nextBoolean();

        System.out.println("Quantidade de cilindradas da moto:");
        int cilindrada = sc.nextInt();

        System.out.println("Capacidade do tanque da moto:");
        int capacidadeTanque = sc.nextInt();

        Moto.registerMotorcycle(cor, placa, modelo, ano, bagageiro, cilindrada, capacidadeTanque);
    }

    private static void registerCar(String cor, String placa, String modelo, int ano) {
        int cavaloPontencia, qtdPortas;
        boolean estepe;

        System.out.println("Insira a quantidade de cavalos de potência:");
        cavaloPontencia = sc.nextInt();

        System.out.println("Insira a quantidade de portas:");
        qtdPortas = sc.nextInt();

        System.out.println("O carro possui estepe?");
        estepe = sc.hasNext();

        Carro.registerCAR(cor, placa, modelo, ano, cavaloPontencia, qtdPortas, estepe);
    }
}
