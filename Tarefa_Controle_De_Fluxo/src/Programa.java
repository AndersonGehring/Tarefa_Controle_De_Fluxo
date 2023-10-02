import java.util.Scanner;

public class Programa {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7.0) {
            System.out.printf("Parabens você passou!! media: %.2f", media);
        }
        else if(media >= 5.0) {
            System.out.printf("Você está de recuperação!! media: %.2f", media);
        }
        else{
            System.out.printf("Você reprovou!! media: %.2f", media);
        }
    }
}
