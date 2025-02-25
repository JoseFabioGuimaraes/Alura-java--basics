import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        if (numero <0){
            System.out.println("Número negativo");
        } else{
            System.out.println("Número positivo");
        }
    }
}
