package operacoes;

import java.util.Scanner;

public class Potencia {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("De o numero: ");
        x = scanner.nextInt();
        System.out.println("De o expoente: ");
        y = scanner.nextInt();
        double resultado = Math.pow(x, y);
        System.out.println("O resultado é: " + resultado);
    }
}
