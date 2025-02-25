import java.util.Scanner;

public class DiferenciacaoNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        if(num1 == num2){
            System.out.println("Os número são iguais");
        } else {
            System.out.println("Os números são diferentes");
            if (num1>num2){
                System.out.println("O primeiro número é maior que o segundo");
            } else {
                System.out.println("O segundo número é maior que o primeiro");
            }
        }
    }
}
