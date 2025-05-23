package br.com.book;

import br.com.book.controllers.AuthorController;
import br.com.book.controllers.ClientController;
import br.com.book.views.AuthorView;
import br.com.book.views.ClientView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            var clientView = new ClientView();
            var authorVIew = new AuthorView();
            var authorController = new AuthorController(authorVIew);
            var clientController = new ClientController(clientView);
            var menuScanner = new Scanner(System.in);
            int option = -1;
            final Scanner scanner = new Scanner(System.in);
            boolean nextSystem = true;

            System.out.println("---------Login--------- \n");
            System.out.println("Para sair precione q ou sair \n");

            System.out.print("Usuário: ");
            String typedUser = scanner.nextLine();

            System.out.print("Senha: ");
            String typedPassword = scanner.nextLine();

            String userAdmin = "admin";
            String passwordAdmin = "admin";

            String userClient = "user";
            String passwordClient = "user";

           while (true) {

               if(typedUser.equals(userAdmin) && typedPassword.equals(passwordAdmin)) {
                   while (option != 0) {
                       System.out.println("===== MENU =====");;
                       System.out.println("1 - Criar Autor");
                       System.out.println("2 - Listar Autor");
                       System.out.println("0 - Sair");
                       System.out.print("Escolha uma opção: ");

                       option = menuScanner.nextInt();
                       menuScanner.nextLine();

                       switch (option) {
                           case 1 -> authorController.create();
                           case 2 -> authorController.list();
                           default -> System.out.println("Nenhuma opcao selecionada");
                       }
                   }
               }

               if(typedUser.equals(userClient) && typedPassword.equals(passwordClient)) {
                   System.out.println("Usuario autenticado com sucesso (Client)");
               }

//               while (option != 0) {
//                   System.out.println("===== MENU =====");
//                   System.out.println("1 - Criar usuário");
//                   System.out.println("2 - Listar usuários");
//                   System.out.println("3 - Criar Autor");
//                   System.out.println("4 - Listar Autor");
//                   System.out.println("0 - Sair");
//                   System.out.print("Escolha uma opção: ");
//
//                   option = menuScanner.nextInt();
//                   menuScanner.nextLine();
//
//                   switch (option) {
//                       case 1 -> clientController.create();
//                       case 2 -> clientController.list();
//                       case 3 -> authorController.create();
//                       case 4 -> authorController.list();
//                       default -> System.out.println("Nenhuma opcao selecionada");
//                   }
//               }

               String finalSystem = scanner.next();

               if(finalSystem.equalsIgnoreCase("q")) {
                   System.out.println("Saindo");
                   break;
               }

           }
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}