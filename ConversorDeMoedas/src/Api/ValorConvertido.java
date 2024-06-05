package Api;

import java.util.Scanner;

public class ValorConvertido {
    public void ParityCalculator(String coin1, String coin2, double parity) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor que deseja converter: ");
        Double value = sc.nextDouble();
        Double conversion = value * parity;

        System.out.println("O valor de " + value + "(" + coin1 + "), será de: " + String.format("%.2f", conversion) + "(" + coin2 + ")");
        System.out.println("Pressione Enter para continuar...");
        sc.nextLine();
        sc.nextLine();
    }
}
