public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2014;
        boolean incluidoPlano = false;
        double notaFilme = 7.1;
        String tipoPlano = "Plus";

        if (anoLancamento >=  2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Classicos");
        }

        //equalsIgnoreCase estou usando só para não mudar a a variavel tipoPlano
        if (incluidoPlano && tipoPlano.equalsIgnoreCase("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Atualize seu plano");
        }

    }
}
