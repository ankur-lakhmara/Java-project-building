package org.dec30.libraryManagement.Model;

import org.dec30.libraryManagement.Exceptions.BookNotAvailableException;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvialable;
    private BookStatus status;
    public enum BookStatus {
        AVAILABLE,
        ISSUED,
        RESERVED,
        LOST;

        public boolean canTransitionTo(BookStatus status) {
            switch (this) {
                case AVAILABLE:
                    return status == ISSUED;
                case ISSUED:
                    return status == AVAILABLE || status == LOST;
                case LOST:
                    return false;
                default:
                    return false;
            }
        }
    }


    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus newStatus) {
        if(!this.status.canTransitionTo(newStatus)){
            throw new IllegalStateException("Illegal state transition "+this.status+ " -> "+newStatus);
        }
        this.status = newStatus;
    }

    public Book(int id, String title, String author, BookStatus status) {
        this.id = id;
        this.title = title;
        this.author = author;
//        this.isAvialable = isAvialable;
        this.status = status;
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
        return status == BookStatus.AVAILABLE;
    }


    @Override
    public String toString(){
        return "Book: { id=" + id + ", title=" + title + ", author=" + author + "status="+ status + "}";
    }

}
