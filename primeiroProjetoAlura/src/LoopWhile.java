import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;
        while(nota != -1){
            System.out.println("Digite sua avaliação para o Filme ou digite -1 para sair: ");
            nota = leitor.nextDouble();
            if(nota != -1 ) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliação: " + mediaAvaliacao/totalDeNotas);

    }
}
