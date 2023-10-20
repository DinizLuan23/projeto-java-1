public class DesafioTemperatura {
    public static void main(String[] args) {
        double grausCelsius = 42.7;
        double grausFh = (grausCelsius * 1.8) + 32;

        // %s - String; %d - Inteiro; %f - Decimal; String.format(...); """.formatted();
        System.out.println("""
        Temperatura em Graus: %.2f
        Temperatura em Fahrenheit: %.2f
        """.formatted(grausCelsius, grausFh));
    }
}
