
import Api.ValorConvertido;
import Api.RequestApi;
import Menu.Menu;

import java.io.IOException;
import java.net.ConnectException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Double parity = 0.0;

        RequestApi requestExchange = new RequestApi();
        ValorConvertido convertedValue = new ValorConvertido();

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        do {
            Menu.showMenu();
            try {
                var op = scanner.nextLine();
                switch (op) {
                    case "1":
                        parity = requestExchange.ReceiveValue("USD", "BOB");
                        convertedValue.ParityCalculator("USD", "BOB", parity);
                        break;
                    case "2":
                        parity = requestExchange.ReceiveValue("BOB", "ARS");
                        convertedValue.ParityCalculator("BOB", "ARS", parity);
                        break;
                    case "3":
                        parity = requestExchange.ReceiveValue("BRL", "USD");
                        convertedValue.ParityCalculator("BRL", "USD", parity);
                        break;
                    case "4":
                        parity = requestExchange.ReceiveValue("BOB", "BRL");
                        convertedValue.ParityCalculator("BOB", "BRL", parity);
                        break;
                    case "5":
                        parity = requestExchange.ReceiveValue("BRL", "CLP");
                        convertedValue.ParityCalculator("BRL", "CLP", parity);
                        break;
                    case "6":
                        parity = requestExchange.ReceiveValue("USD", "RUB");
                        convertedValue.ParityCalculator("USD", "RUB", parity);
                        break;
                    case "0": System.out.println("Saindo do programa....");
                        quit = true;
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, selecione uma opção válida.");
                        System.out.println("Pressione Enter para continuar...");
                        scanner.nextLine();
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Erro: Por favor, insira um valor numérico válido(Se estiver usando \"ponto\" como casa decima troque pela vírgula!).");
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine();
            }catch (ConnectException e ){
                System.out.println("Erro de conexão, conecte a internet");
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine();
            }
        } while (!quit);
    }
}