/*
Desafio
Você está desenvolvendo um sistema simples para um e-commerce que deseja registrar os valores das compras realizadas
por um cliente ao longo de um único dia. O sistema deve primeiro receber a quantidade total de compras realizadas e,
em seguida, solicitar o valor de cada uma dessas compras. Ao final, o sistema deve exibir o total gasto no dia e a
média de valor por compra.
*/

package Ecommerce;
import java.sql.SQLOutput;
import java.util.Scanner;

public class comprasEcommerce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a quantidade de compras
        System.out.println("Informe quantas compras foram realizadas hoje: ");
        int purchaseCount = scanner.nextInt();

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            double totalSpent = 0.0;

            // Lê o valor de cada compra e acumula no total
            for (int i = 1; i <= purchaseCount; i++) {
                System.out.println("Informe o valor da compra " + i + ":");
                double purchaseValue = scanner.nextDouble();
                totalSpent += purchaseValue;
            }

            double average = totalSpent / purchaseCount;

            // Exibe o total e a média com duas casas decimais
            System.out.printf("Total gasto: R$ %.2f\n", totalSpent);
            System.out.printf("Média por compra: R$ %.2f\n", average);
        }

        scanner.close();
    }
}

