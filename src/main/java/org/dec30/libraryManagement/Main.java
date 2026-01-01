package org.dec30.libraryManagement;

import org.dec30.libraryManagement.Model.Book;
import org.dec30.libraryManagement.Model.Loan;
import org.dec30.libraryManagement.Model.Member;
import org.dec30.libraryManagement.Services.BookService;
import org.dec30.libraryManagement.Services.LoanService;
import org.dec30.libraryManagement.Services.MemberService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to library management system");
        BookService bookService = new BookService();
        MemberService memberService = new MemberService();
        LoanService loanService = new LoanService(bookService,memberService);
        Scanner sc = new Scanner(System.in);
        //adding book controller
        while(true){
            System.out.println("Enter book id");
            int id = sc.nextInt();
            System.out.println("Enter title");
            String title = sc.next();
            System.out.println("Enter author");
            String author = sc.next();
//            System.out.println("Enter availability (true/false)");
//            enum status ='AVAILABLE';
            Book.BookStatus status = Book.BookStatus.AVAILABLE;
            try{
                boolean success = bookService.addBook(id, title, author,status);
                if(success){
                    System.out.println("Book added successfully");
                }else{
                    System.out.println("Book add failed");
                }
            }catch(Exception e){
                System.out.println("Book could not be added");
            }
            System.out.println("Would you like to add another book? y/n");
            char choice = sc.next().charAt(0);
            if(choice == 'n'){
                break;
            }
        }

        //get all book controller
        System.out.println("All books list");
        for(Book book : bookService.getAllBooks()){
            System.out.println(book);
        }

        //get book by id
        System.out.println("Enter book id you would like to search for");
        int searchedId = sc.nextInt();
        try{
            Book success = bookService.getBookById(searchedId);
            if(success != null){
                System.out.println("Book found"+ success);
            }else{
                System.out.println("Book not found");
            }
        }catch(Exception e){
            System.out.println("Error on searching book"+e.getMessage());
        }

        //add member controller
        System.out.println("Now its time to enter members ");
        while(true){
            System.out.println("Enter member id");
            int memberId = sc.nextInt();
            System.out.println("Enter member name");
            String memberName = sc.next();
            try{
                boolean success = memberService.addMember(memberId, memberName);
                if(success){
                    System.out.println("Member added successfully");
                }else{
                    System.out.println("Member add failed");
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Would you like to enter another member? y/n");
            char choice = sc.next().charAt(0);
            if(choice == 'n'){
                break;
            }
        }

        //list all members
        for(Member member:memberService.getAllMembers()){
            System.out.println(member);
        }

        //issue book
        System.out.println("Enter the book issuing details");
        while(true){
            System.out.println("Enter book id");
            int bookId = sc.nextInt();
            System.out.println("Enter member id which you want to assign");
            int memberId = sc.nextInt();
            LocalDate issuedAt = LocalDate.now();

            try{
                boolean success = loanService.issueBook(bookId,memberId,issuedAt);
                if(success){
                    System.out.println("Book assigned successfully");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Would you like to issue another book? y/n");
            char choice = sc.next().charAt(0);
            if(choice == 'n'){
                break;
            }
        }
        for(Loan loan:loanService.getLoanList()){
            System.out.println(loan);
        };
    }
}
