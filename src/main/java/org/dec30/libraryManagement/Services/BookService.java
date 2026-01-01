package org.dec30.libraryManagement.Services;

import org.dec30.libraryManagement.Exceptions.BookNotFoundException;
import org.dec30.libraryManagement.Model.Book;

import java.util.ArrayList;

public class BookService {
    ArrayList<Book> books = new ArrayList<Book>();
    public boolean addBook(int id, String title, String author, Book.BookStatus status){
        for(Book book:books){
            if(book.getId() == id || book.getTitle().equals(title)){
                return false;
            }
        }
        Book book = new Book(id,title,author,status);
        books.add(book);
        return true;
    }

    public boolean updateBookStatus(int id, Book.BookStatus status) {
        Book book = getBookById(id);
        if(book == null){
            throw new BookNotFoundException(id);
        }
        book.setStatus(status);
        return true;
    };

    public boolean isBookExist(int id){
        for(int i = 0;i<books.size();i++){
            if(books.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }

    public boolean isBookAvailable(int id){
        for(int i = 0;i<books.size();i++){
            if(books.get(i).getId() == id){
                return books.get(i).getStatus() == Book.BookStatus.AVAILABLE;
            }
        }
        return false;
    }



    public ArrayList<Book> getAllBooks(){
        return new ArrayList<>(books);
    }
    public Book getBookById(int id){
        for(int i = 0;i<books.size();i++){
            if(books.get(i).getId() == id){
                return books.get(i);
            }
        }
        return null;
    }

}
