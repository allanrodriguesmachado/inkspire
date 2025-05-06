package br.com.book.controllers;

import br.com.book.models.ClientModel;
import br.com.book.views.ClientView;

import java.util.*;

public class ClientController {
    final private ClientView view;
    final private List<ClientModel> clients = new ArrayList<>();

    public ClientController(ClientView view) {
        this.view = view;
    }

    public void create()
    {
        view.createClient();

        ClientModel client = new ClientModel(
                view.getFirstName(),
                view.getLastName(),
                "re",
                23);

        clients.add(client);
    }

    public void list()
    {
        for (ClientModel clientModel: clients) {
            view.showClientDetails(clientModel);
        }
    }
}
