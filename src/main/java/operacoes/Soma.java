package operacoes;

import java.util.Scanner;
public class Soma {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.println("De o primeiro valor: ");
        x = scanner.nextInt();
        System.out.println("De o segundo valor: ");
        y = scanner.nextInt();
        System.out.println("o resultado é: " + (x + y));
    }
}