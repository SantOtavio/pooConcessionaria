import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        principalMenu();
    }

    static void principalMenu() {
        System.out.println("+++++MENU CONCESSIONÁRIA+++++" +
                "\n1 - Cadastrar Automóvel" +
                "\n2 - Listar Automóveis" +
                "\n3 - Editar" +
                "\n4 - Remover");
        int choose = sc.nextInt();

        switch (choose){
            case 1:
                menuRegister();
                break;
            case 2:
                listAutomobile();
        }
    }

    private static void listAutomobile() {

    }

    private static void menuRegister() {
        System.out.println("+++++MENU REGISTRO+++++" +
                "\n1 - Registrar Carro" +
                "\n2 - Registrar Moto");
        int choose = sc.nextInt();

        switch (choose){
            case 1:
                registerAutomobile(choose);
//                registerCar(choose , cor , placa , modelo , ano);
                break;
            case 2:
//                registerMotorcycle(choose , cor , placa , modelo , ano);
        }
    }

    private static void registerAutomobile(int choose){
        String cor , placa , modelo;
        int ano;

        System.out.println("Insira a cor do automóvel");
        cor = sc.next();

        System.out.println("Insira a placa do automóvel");
        placa = sc.next();

        System.out.println("Insira o modelo do automóvel");
        modelo = sc.next();

        System.out.println("Insira o ano do automóvel");
        ano = sc.nextInt();

        int verify = 0;

        if (choose == 1){
            registerCar(cor , placa , modelo , ano);
        } else {
            registerMotorcycle(choose = 30 , cor , placa , modelo , ano);
        }

    }


    private static void registerMotorcycle(int choose , String cor , String placa , String modelo , int ano) {
        if (choose == 30){
            System.out.println("A moto possui bagageiro?");
            boolean bagageiro = sc.nextBoolean();

            System.out.println("Quantidade de cilindradas da moto:");
            int cilindrada = sc.nextInt();

            System.out.println("Capacidade do tanque da moto:");
            int capacidadeTanque = sc.nextInt();

            Moto.registerMotorcycle(cor , placa , modelo , ano , bagageiro , cilindrada , capacidadeTanque);
        } else {
            registerAutomobile(choose);
        }
    }

    private static void registerCar(String cor , String placa , String modelo , int ano) {
            int cavaloPontencia , qtdPortas;
            boolean estepe;

            System.out.println("Insira a quantidade de cavalos de potência:");
            cavaloPontencia = sc.nextInt();

            System.out.println("Insira a quantidade de portas:");
            qtdPortas = sc.nextInt();

            System.out.println("O carro possui estepe?");
            estepe = sc.hasNext();

            Carro.registerCAR(cor , placa , modelo , ano ,cavaloPontencia , qtdPortas , estepe);
    }
}
