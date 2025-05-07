package br.com.book.controllers;

import br.com.book.models.ClientModel;
import br.com.book.views.ClientView;

import java.util.*;

public class ClientController {
    final private ClientView view;
    final private List<ClientModel> clients = new ArrayList<>();
    private int nextId = 1;

    public ClientController(ClientView view) {
        this.view = view;
    }

    public void create()
    {
        try {
            view.createClient();

            String firstName = view.promptFirstName();
            String lastName = view.promptLastName();

            ClientModel client = new ClientModel(
                    this.nextId++,
                    firstName,
                    lastName);

            clients.add(client);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void list()
    {
        for (ClientModel clientModel: clients) {
            view.showClientDetails(clientModel);
        }
    }
}
