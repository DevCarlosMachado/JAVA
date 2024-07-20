import java.util.Scanner;
public class CaixaEletrônico {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
    
       double saldo = 500.00;
       double valorSolicitado;
       String nome;

    System.out.println("Olá, nos informe seu nome, por gentileza. ");
       nome = scan.nextLine();

    System.out.println("Qual o valor que você gostria de sacar?");
       System.out.print("R$ ");  
       valorSolicitado = scan.nextDouble();

    if (valorSolicitado <= saldo)
       System.out.println("Saque efetuado com sucesso!");
    else
       System.out.println("Saldo insuficiente. Por gentileza insira uma valor disponível para saque.");
    

    }
}
