import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o Filme: ");
            nota = leitor.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println(mediaAvaliacao);
        System.out.println("Média de avaliação: " + mediaAvaliacao/3);
        
    }
}
