package br.com.book.controllers;

import br.com.book.models.AuthorModel;
import br.com.book.views.AuthorView;

import java.util.*;

public class AuthorController {
    final private AuthorView view;
    final private List<AuthorModel> authors = new ArrayList<>();
    private int nextId = 1;

    public AuthorController(AuthorView view)
    {
        this.view = view;
    }

    public void create()
    {
        view.createAuthor();

        String fullName = view.promptFullName();

        AuthorModel author = new AuthorModel(
                this.nextId++,
                fullName
        );

        authors.add(author);
    }

    public void list()
    {
        for (AuthorModel author: authors) {
            view.showAuthorDetails(author);
        }
    }
}