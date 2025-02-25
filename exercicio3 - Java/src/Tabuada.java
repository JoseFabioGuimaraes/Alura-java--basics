import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número que deseja para a tabuada: ");
        int numero = leitor.nextInt();

        for (int i = 1; i <11 ; i++) {
            System.out.println(String.format("O número %d * %d é igual a: %d",numero,i,(numero*i)));
        }
    }
}
