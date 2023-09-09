import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        System.out.println("Bem Vindo ao Wyll BANK");
        System.out.println("Por gentileza, Digite Seu nome:");
        nomeCliente = sc.next();
        System.out.println("Por gentileza, Digite o número da sua conta:");
        numeroConta = sc.nextInt();
        System.out.println("Por gentileza, Digite o número da sua Agência:");
        agencia = sc.next();
          System.out.println("Por gentileza, Digite o número do seu SALDO:");
        saldo = sc.nextInt();

       System.out.println("Ola "+nomeCliente+ " obrigado por criar uma conta em nosso banco, sua Agencia: "+ String.valueOf( agencia )+" Sua conta: " + String.valueOf( numeroConta )+ " e seu saldo: " + String.valueOf( saldo )+ " já está disponível  para saque ");
    }
}
