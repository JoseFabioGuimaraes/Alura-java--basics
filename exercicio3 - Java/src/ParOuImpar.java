import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número para verificar se é par ou impar");
        int numero = leitor.nextInt();
        if (numero % 2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    }
}
