import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do úsuario: ");
        String nomeUsuario = leitor.nextLine();
        System.out.println("Digite o tipo de conta: Corrente ou Poupança");
        String tipoConta = leitor.nextLine();
        double valorDaConta = 0.0;
        boolean ficar = true;
        String infoUser = """
                Nome: %s
                Tipo da conta:%s
                Saldo da Conta: %.2f
                """.formatted(nomeUsuario,tipoConta,valorDaConta);
        System.out.println(infoUser);
        while (ficar){
            String menu = """
                    Digite:
                        1. Para saber seu saldo;
                        2. Para realizar depositos;
                        3. Para Realizar uma transferencia;
                        4. Para sair;
                    """;
            System.out.println(menu);
            int escolha = leitor.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Seu saldo é de: " + valorDaConta);
                    break;
                case 2:
                    System.out.println("Qual o valor você deseja depositar? ");
                    double valorDeposito = leitor.nextDouble();
                    valorDaConta += valorDeposito;
                    break;
                case 3:
                    System.out.println("Qual valor você deseja transferir? ");
                    double valorTranferencia = leitor.nextDouble();
                    if (valorDaConta < valorTranferencia){
                        System.out.println("Informa um valor válido");
                    } else {
                        valorDaConta -= valorTranferencia;
                        System.out.printf("Valor de %.2f enviado com sucesso, seu saldo agora é: %.2f",valorTranferencia,valorDaConta);
                    }
                    break;
                case 4:
                    ficar = false;
                    break;

                default:
                    System.out.println("Escolha um número valido");
            }

            System.out.println();
        }

    }
}