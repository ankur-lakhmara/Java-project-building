package org.dec30.libraryManagement.Exceptions;

public class BookNotAvailableException extends RuntimeException{
    public BookNotAvailableException(int bookId){
        super("Book id " +bookId+ " Not Available");
    }
}
