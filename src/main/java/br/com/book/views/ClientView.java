package br.com.book.views;

import br.com.book.models.ClientModel;

import java.util.Scanner;

public class ClientView {
    final private Scanner scanner = new Scanner(System.in);

    public void createClient()
    {
        viewMessage("-------------- Novo Cliente -----------------");
    }

    public String promptFirstName()
    {
        viewMessage("Digite o Nome do Cliente: ");
        return scanner.next();
    }

    public String promptLastName()
    {
        viewMessage("Digite o Sobrenome do Cliente: ");
        return scanner.next();
    }

    public void showClientDetails(ClientModel client)
    {
        viewMessage("\nLista de Cliente(s)");

        viewMessage("Id: " + client.id());
        viewMessage("Nome: " + client.firstName() + " " + client.lastName());
    }



    private void viewMessage(String message) {
        System.out.println(message);
    }
}
