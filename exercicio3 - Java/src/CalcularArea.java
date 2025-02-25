import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite: \n1 para calcular a área do quadrado\n2 para calcular a área do circulo");
        int escolha = leitor.nextInt();
        if (escolha == 1){
            System.out.println("Para calcular a área do quadrado precisamos do lado do quadrado \nQual o valor do lado: ");
            double lado = leitor.nextDouble();
            double area = lado * lado;
            System.out.println("A área desse quadrado é: " + area);
        } else {
            System.out.println("Ja para área do circulo, precisamosdo valor do raio\nDigite o valor do raio:");
            double raio = leitor.nextDouble();
            double area = 3.14 * (raio * raio);
            System.out.println("A área do circulo é: " + area);
        }
    }
}
