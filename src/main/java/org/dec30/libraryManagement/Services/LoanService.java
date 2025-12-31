package org.dec30.libraryManagement.Services;

import org.dec30.libraryManagement.Exceptions.BookNotAvailableException;
import org.dec30.libraryManagement.Exceptions.BookNotFoundException;
import org.dec30.libraryManagement.Exceptions.MemberNotExistException;
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
        if(!bookService.isBookExist(bookId)){
            throw new BookNotFoundException(bookId);
        }
        if(!bookService.isBookAvailable(bookId)){
            throw new BookNotAvailableException(bookId);
        }
        if(!memberService.isMemberExist(memberId)){
            throw new MemberNotExistException(memberId);
        }
        loanList.add(new Loan(bookId, memberId, issuedAt));
        bookService.updateBookAvailability(bookId, false);
        return true;
    }

    public ArrayList<Loan> getLoanList(){
        return loanList;
    }
}
