public class Main {
    public static void main(String[] args) {
        double temperaturaCelsius = 36.5;
        int temperaturaFahrenheit = (int) (temperaturaCelsius*1.8) + 32;
        String saida = """
                A Temperatura de %.1f graus Celsius
                é igual a %d graus Fahrenheit
                """.formatted(temperaturaCelsius,temperaturaFahrenheit);
        System.out.println(saida);
    }
}