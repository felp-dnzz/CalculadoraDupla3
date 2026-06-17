package operacoes;

import java.util.Scanner;

public class Porcentagem {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("De o numero: ");
        x = scanner.nextInt();
        System.out.println("A porcentagem é: ");
        y = scanner.nextInt();
        System.out.println("o resultado é: " + (x * (y/100)));
    }
}
