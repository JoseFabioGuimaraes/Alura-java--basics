public class Main {
    public static void main(String[] args) {
        double nota1 = 9.4;
        double nota2 = 6.7;
        double media = (nota1 + nota2) / 2;
        System.out.println("Media igual a: " + media);

        int mediaInt = (int) (media);
        System.out.println("Media inteira: " + mediaInt);

        char variavelChar = '@';
        String email = "filhofabio78";
        System.out.println(email+variavelChar);

        double precoProduto = 2.50;
        int quantidade = 4;
        double valorTotal = precoProduto*quantidade;
        System.out.println("Valor total de: "+ valorTotal);

        double valorEmDolar = 54.00;
        double valorDoDolar = 4.94; //queria eu que fosse esse valor haha
        double valorCompraReal = valorEmDolar * valorDoDolar;
        System.out.println(String.format("Valor das compras em real: R$%.2f",valorCompraReal));

        double precoOriginal = 1000.00;
        int percentualDesconto = 5;
        double valorDesconto = (precoOriginal * percentualDesconto)/100;
        double valorComDesconto = precoOriginal - valorDesconto;
        System.out.println("O valor com desconto ficou igual a: R$"+valorComDesconto);
    }
}