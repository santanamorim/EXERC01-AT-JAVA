import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = lerSequencia();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar suas ocorrências: ");
        int numero = scanner.nextInt();

        int ocorrencias = contarOcorrencias(numeros, numero);
        System.out.println("O número " + numero + " aparece " + ocorrencias + " vezes no vetor.");

        double media = calcularMedia(numeros);
        System.out.println("A média dos elementos digitados é: " + media);

        mostrarMaioresOuIguaisMedia(numeros, media);

        scanner.close();
    }

    public static ArrayList<Integer> lerSequencia() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite uma sequência de números (terminada por zero):");

        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            if (numeros.size() < 10) {
                numeros.add(numero);
            } else {
                System.out.println("Erro: Capacidade máxima de 10 números atingida.");
                break;
            }
        }

        return numeros;
    }

    public static int contarOcorrencias(ArrayList<Integer> numeros, int numero) {
        int contador = 0;
        for (int n : numeros) {
            if (n == numero) {
                contador++;
            }
        }
        return contador;
    }

    public static double calcularMedia(ArrayList<Integer> numeros) {
        if (numeros.isEmpty()) {
            return 0;
        }

        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }

        return (double) soma / numeros.size();
    }

    public static void mostrarMaioresOuIguaisMedia(ArrayList<Integer> numeros, double media) {
        System.out.println("Elementos maiores ou iguais à média:");
        for (int n : numeros) {
            if (n >= media) {
                System.out.println(n);
            }
        }
    }
}
