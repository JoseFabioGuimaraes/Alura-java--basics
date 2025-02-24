public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Interestelar ");

        int anoLancamento = 2014;
        System.out.println("O ano de lançamento foi: " + anoLancamento);
        boolean incluidoPlano = true;
        double notaFilme = 7.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String snipose;
        snipose = """
                Filme SciFi
                Dirigido por Nolan
                Ano de lançamento: %d
                """.formatted(anoLancamento);
        System.out.println(String.format("O filme é Interestelar, com a média: %.2f. \nSnipose:  %s", media, snipose));

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}