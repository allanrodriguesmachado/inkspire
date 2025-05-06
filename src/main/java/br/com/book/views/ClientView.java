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

        System.out.println("-------------- Novo Cliente -----------------");

        System.out.println("Digite o Nome do Cliente: ");
        this.firstName = scannerClient.next();

        System.out.println("Digite o Sobrenome do Cliente: ");
        this.lastName = scannerClient.next();

        System.out.println("\nCliente Criado com Sucesso!");
    }

    public void showClientDetails(ClientModel client) {

        System.out.println("\nLista de Cliente(s)");

        System.out.println("Nome: " + client.firstName() + " " + client.lastName());
        System.out.println("Email: " + client.email());
        System.out.println("Idade: " + client.age() + "\n");
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }
}
