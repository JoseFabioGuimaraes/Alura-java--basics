import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial:");
        int numeroFatoracao = leitor.nextInt();
        int resultado = 1;

        for (int i = 1; i <= numeroFatoracao; i++) {
            resultado *= i;
            System.out.println(resultado);
        }

        System.out.println("O fatorial de " + numeroFatoracao + " é: " + resultado);
    }
}