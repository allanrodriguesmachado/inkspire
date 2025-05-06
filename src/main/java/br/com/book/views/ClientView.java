package br.com.book.views;

import br.com.book.models.ClientModel;

import java.util.Scanner;

public class ClientView {
    private int id;
    private String firstName;
    private String lastName;

    public void createClient()
    {
        var scannerClient = new Scanner(System.in);

        viewMessage("-------------- Novo Cliente -----------------");

        this.id++;

        viewMessage("Digite o Nome do Cliente: ");
        this.firstName = scannerClient.next();

        viewMessage("Digite o Sobrenome do Cliente: ");
        this.lastName = scannerClient.next();

        viewMessage("\nCliente Criado com Sucesso!");
    }

    public void showClientDetails(ClientModel client)
    {

        viewMessage("\nLista de Cliente(s)");

        viewMessage("Id: " + client.id());
        viewMessage("Nome: " + client.firstName() + " " + client.lastName());
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public int getId()
    {
        return this.id;
    }

    private void viewMessage(String message) {
        System.out.println(message);
    }
}
