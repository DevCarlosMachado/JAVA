package CalculoFrete;
import java.util.Scanner;

public class CalculoFreteRapido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Leia o peso em quilos:
        System.out.println("Informe o peso da carga(kg): ");
        double pesoCarga = scanner.nextDouble();

        // TODO: Leia o valor do frete por quilo:
        System.out.println("Informe o valor do frete por quilo: ");
        double valorFreteQuilo = scanner.nextDouble();

        // TODO: Calcule o valor total do frete:
        double valorTotal = pesoCarga * valorFreteQuilo;

        // TODO: Exiba o valor formatado com duas casas decimais:
        System.out.printf("O valor total do frete é de R$%.2f", valorTotal);

        scanner.close();
    }
}
