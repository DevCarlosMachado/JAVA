package JogoAdivinhacao;
import java.util.Scanner;
import java.util.Random;

public class jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("------------------------------------");
        System.out.println("--Bem-vindo ao jogo da adivinhação--");
        System.out.println("------------------------------------");

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;

        do {
            System.out.println("Digite um número entre 1 e 100: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("Ops, você errou! Tente um número maior.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Ops, você errou! Tente um número menor.");
            }

        } while (tentativa != numeroSecreto);

        System.out.println("Parabéns! Você acertou o número secreto " + numeroSecreto + " com " + tentativas + " tentativas.");

    }
}
