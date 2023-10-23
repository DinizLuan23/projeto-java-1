import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Tente adivinhar o número de 0-100 (5 Chances):");
            int numeroEntrada = leitura.nextInt();

            if(numeroEntrada > numeroAleatorio){
                System.out.println("Valor digitado é maior que o número!");
            } else if (numeroEntrada < numeroAleatorio) {
                System.out.println("Valor digitado é menor que o número!");
            } else {
                System.out.println("Valor correto, Parabéns!!!!");
                break;
            }

            if(i == 4){
                System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroAleatorio);
            }
        }
    }
}
