package org.dec30.libraryManagement.Services;

import org.dec30.libraryManagement.Model.Book;

import java.util.ArrayList;

public class BookService {
    ArrayList<Book> books = new ArrayList<Book>();
    public boolean addBook(int id, String title,String author,boolean isAvailable){
        for(Book book:books){
            if(book.getId() == id || book.getTitle().equals(title)){
                return false;
            }
        }
        Book book = new Book(id,title,author,isAvailable);
        books.add(book);
        return true;
    }

    public boolean updateBookAvailability(int id, boolean isAvailable) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.get(i).setAvialable(isAvailable);
                return true;
            }
        }
        return false;
    }

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
                return books.get(i).isAvialable();
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
