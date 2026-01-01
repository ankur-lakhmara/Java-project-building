package org.dec30.libraryManagement.Services;

import org.dec30.libraryManagement.Exceptions.BookNotAvailableException;
import org.dec30.libraryManagement.Exceptions.BookNotFoundException;
import org.dec30.libraryManagement.Exceptions.MemberNotExistException;
import org.dec30.libraryManagement.Model.Book;
import org.dec30.libraryManagement.Model.Loan;

import java.time.LocalDate;
import java.util.ArrayList;

public class LoanService {

    private BookService bookService;
    private MemberService memberService;
    public LoanService(BookService bookService, MemberService memberService){
        this.bookService = bookService;
        this.memberService = memberService;
    }
    ArrayList<Loan> loanList = new ArrayList<Loan>();

    public boolean issueBook(int bookId, int memberId, LocalDate issuedAt){
        Book book = bookService.getBookById(bookId);
        if(book == null){
            throw new BookNotFoundException(bookId);
        }
        if(!memberService.isMemberExist(memberId)){
            throw new MemberNotExistException(memberId);
        }
        if(book.getStatus() != Book.BookStatus.AVAILABLE){
            throw new  BookNotAvailableException(bookId);
        }
        loanList.add(new Loan(bookId, memberId, issuedAt));
        bookService.updateBookStatus(bookId, Book.BookStatus.ISSUED);
        return true;
    }

    public ArrayList<Loan> getLoanList(){
        return loanList;
    }
}
