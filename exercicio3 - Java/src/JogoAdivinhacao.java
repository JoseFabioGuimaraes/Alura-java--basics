import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100);
        Scanner leitor = new Scanner(System.in);
        //System.out.println(numero);
        int chute;
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Digite um número de chute");
            chute = leitor.nextInt();
            if(chute > numero){
                System.out.println("O numero é menor que o chute");
            } else if (chute < numero) {
                System.out.println("O numero é maior que o chute");
            } else {
                System.out.println(" O número está correto");
            }
        }
    }
}
