package br.com.book.views;

import br.com.book.models.AuthorModel;

import java.util.Scanner;

public class AuthorView {
    final private Scanner scanner = new Scanner(System.in);
    public void createAuthor() {

    }

    public String promptFullName()
    {
        System.out.println("Digite o nome do Autor");
        return scanner.nextLine();
    }

    public void showAuthorDetails(AuthorModel author)
    {
        System.out.println("Nome: " + author.fullName());
    }
}
