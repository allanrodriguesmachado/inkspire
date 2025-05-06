package br.com.book.views;

import br.com.book.models.ClientModel;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientView {
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public void createClient()
    {
        var scannerClient = new Scanner(System.in);

        viewMessage("-------------- Novo Cliente -----------------");

        viewMessage("Digite o Nome do Cliente: ");
        this.firstName = scannerClient.next();

        viewMessage("Digite o Sobrenome do Cliente: ");
        this.lastName = scannerClient.next();

        viewMessage("\nCliente Criado com Sucesso!");
    }

    public void showClientDetails(ClientModel client)
    {

        viewMessage("\nLista de Cliente(s)");

        viewMessage("Nome: " + client.firstName() + " " + client.lastName());
        viewMessage("Email: " + client.email());
        viewMessage("Idade: " + client.age() + "\n");
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    private void viewMessage(String message) {
        System.out.println(message);
    }

}
