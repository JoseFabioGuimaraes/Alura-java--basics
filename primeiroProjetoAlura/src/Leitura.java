
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito");
        String filmeDigitado = leitor.nextLine();
        System.out.println("Qual foi a data de lançamento do filme "+filmeDigitado);
        int anoLancamento = leitor.nextInt();
        System.out.println("Ano de lançamento é: " +  "\nAgora digite sua avaliação para o filme:");
        double avaliacaoUsuario = leitor.nextDouble();
        System.out.println("A sua avaliação foi de: " + avaliacaoUsuario);

    }
}
