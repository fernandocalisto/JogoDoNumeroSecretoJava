import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int chute = 0;
        int tentativas = 1;

        System.out.println(numeroSecreto);

        System.out.println("Bem-vindo ao Jogo do Número Secreto! Você tem 5 tentativas para acertar o número entre 0 e 100!");

        while (true) {

            System.out.printf("Insira sua tentativa N°%d: ",tentativas);
            chute = leitura.nextInt();
            if (chute == numeroSecreto){
                System.out.println("Parabéns!!! Você acertou o número Secreto em apenas " + tentativas + " tentativas!");
                break;
            }
            if (tentativas >= 5){
                System.out.println("As suas chances acabaram :( O número Secreto era " + numeroSecreto);
                break;
            }
            if (chute > numeroSecreto) {
                System.out.println("O número inserido é maior que o número secreto!");
            }
            else {
                System.out.println("O número inserido é menor que o número secreto!");
            }
            tentativas++;

        }
    }
}