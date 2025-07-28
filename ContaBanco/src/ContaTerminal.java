package ContaBanco.src;

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("OBS: Após cada informação fornecida, aperte ENTER para seguir para o próximo campo!");
       
        System.out.print("Digite seu nome completo(sem acentos): "); 
           String nome = scan.nextLine();
        
        System.out.print("Digite o número do seu CPF(somente números): ");
           String cpf = scan.nextLine();

        System.out.print("Digite a data do seu nascimento(dd/mm/aaaa): ");
           String nascimento = scan.nextLine();
           
        System.out.print("Por favor, digite o número da sua agência: ");
           String agencia = scan.nextLine();

        System.out.print("Por favor, digite o número da sua conta: ");
           String conta = scan.nextLine();

        System.out.print("Digite o valor você gostaria de fazer em seu primeiro depósito(R$): ");
           int saldo = scan.nextInt();
       
        System.out.println("Olá, " + nome + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já  está disponível para saque.");

        
        
    }
}
