package br.com.book;

import br.com.book.controllers.ClientController;
import br.com.book.views.ClientView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            var clientView = new ClientView();
            var clientController = new ClientController(clientView);
            var menuScanner = new Scanner(System.in);
            int option = -1;

            while (option != 0) {
                System.out.println("===== MENU =====");
                System.out.println("1 - Criar usuário");
                System.out.println("2 - Listar usuários");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                option = menuScanner.nextInt();
                menuScanner.nextLine();

                switch (option) {
                    case 1 -> clientController.create();
                    case 2 -> clientController.list();
                    default -> System.out.println("Nenhuma opcao selecionada");
                }
            }
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}