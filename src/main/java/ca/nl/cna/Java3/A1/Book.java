package ca.nl.cna.Java3.A1;

import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private int editorNumber;
    private int copyright;
    private List<Author> authorList;

    public Book(String isbn, String title, int editorNumber, int copyright, List<Author> authorList) {
        this.isbn = isbn;
        this.title = title;
        this.editorNumber = editorNumber;
        this.copyright = copyright;
        this.authorList = authorList;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getEditorNumber() {
        return editorNumber;
    }

    public int getCopyright() {
        return copyright;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
}
