import java.util.Scanner;
public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

    System.out.print("Qual foi sua nota da primeira unidade? ");
       nota1 = scan.nextDouble();
    
    System.out.print("Qual foi sua nota da segunda unidade? ");
       nota2 = scan.nextDouble();
    
    System.out.print("Qual foi sua nota da terceira unidade? ");
       nota3 = scan.nextDouble();
    
    System.out.print("Qual foi sua nota da quarta unidade? ");
       nota4 = scan.nextDouble();

    media = (nota1 + nota2 + nota3 + nota4)/4;

    if (media >= 7)
       System.out.println("Você está aprovado!");
    else if (media >= 4 && media < 7)
       System.out.println("Você está na recuperação!");
    else 
       System.out.println("Você está reprovado!");
    

    }
}
