package org.dec30.libraryManagement.Model;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvialable;

    public Book(int id, String title, String author, boolean isAvialable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvialable = isAvialable;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isAvialable() {
        return isAvialable;
    }
    public void setAvialable(boolean isAvialable) {
        this.isAvialable = isAvialable;
    }

    @Override
    public String toString(){
        return "Book: { id=" + id + ", title=" + title + ", author=" + author + "isAvailable="+ isAvialable + "}";
    }

}
